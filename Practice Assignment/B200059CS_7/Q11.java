import java.util.*;

import static java.lang.System.exit;

public class Q11 {

    public static int isVowel(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        inp = inp.toLowerCase();
        TreeMap<String,Integer> vowCount = new TreeMap<>();
        int cnt;
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i) >= '1' && inp.charAt(i) <= '9'){
                System.out.println("INVALID");
                exit(0);
            }else{

                char x = inp.charAt(i);
                StringBuilder t = new StringBuilder();
                t.append(x);
                if(isVowel(x) == 1){
                    try{
                        cnt = vowCount.get(t.toString());
                    } catch(NullPointerException e){
                        cnt = 0;
                    }
                    cnt++;
                    String tt = t.toString();
                    vowCount.put(tt,cnt);
                }
            }
        }

        int max = 0;
        String b = "";
        for(String a : vowCount.keySet()){
            int cc = vowCount.get(a);
            if(cc > max) {
                max = cc;
                b = a;
            }
        }

        System.out.println(b + " " + max);

    }
}
