import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        while(!inp.equals("t")){
            if(inp.equals("e")){
                inp = line.nextLine().trim();
                int k = Integer.parseInt(line.nextLine().trim());
                String newInp = "";
                ArrayList<Character> ran = new ArrayList<>();
                for(int i=0; i<inp.length(); i++){
                    if (inp.charAt(i) == ' '){
                        ran.add(' ');
                    }
                    else
                        ran.add( (char) (inp.charAt(i)^' '));
                }
                for(int i=0; i<ran.size(); i++){
                    if(ran.get(i) == ' '){
                        newInp += ' ';
                        continue;
                    }
                     int temp = ran.get(i);
                     if(temp >= 65 && temp <= 90){
                         if(temp + k > 90){
                             temp += k - 26;
                         }
                         else{
                             temp += k;
                         }
                     }

                     else if(temp >= 97 && temp <= 122){
                         if(temp+k > 122){
                             temp += k - 26;
                         }
                         else{
                             temp += k;
                         }
                     }
                     newInp += (char)temp;
                }

                System.out.println(newInp);

            }

            if(inp.equals("d")) {
                inp = line.nextLine().trim();
                int k = Integer.parseInt(line.nextLine().trim());
                String newInp = "";
                ArrayList<Character> ran = new ArrayList<>();
                for (int i = 0; i < inp.length(); i++) {
                    if (inp.charAt(i) == ' '){
                        ran.add(' ');
                    }
                    else
                        ran.add((char) (inp.charAt(i) ^ ' '));
                }
                for (int i = 0; i < ran.size(); i++) {
                    if(ran.get(i) == ' '){
                        newInp += ' ';
                        continue;
                    }
                    int temp = ran.get(i);
                    if (temp >= 65 && temp <= 90) {
                        if (temp - k < 65) {
                            int diff = 64 - (temp - k);
                            temp = diff + 65;
                        } else {
                            temp -= k;
                        }
                    } else if (temp >= 97 && temp <= 122) {
                        if (temp - k < 97) {
                            int diff = 96 - (temp - k);
                            temp = diff + 97;
                        } else {
                            temp -= k;
                        }
                    }
                    newInp += (char) temp;
                }

                System.out.println(newInp);
            }
            inp = line.nextLine().trim();
        }
    }
}
