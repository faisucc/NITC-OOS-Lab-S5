import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        HashMap<Character,Integer> map = new HashMap<>();
        int x = 0;
        //int z = 0;
        for(int i=0; i<inp.length(); i++){
            try{
                x = map.get(inp.charAt(i));
            } catch(NullPointerException e){
                x = 0;
               // z = 0;
            }
            x++;
            if(map.get(inp.charAt(i)) == null){
                map.put(inp.charAt(i),x);
            }
            else
                map.replace(inp.charAt(i),x);
            //map.put(inp.charAt(i),x);
        }
        char highest = ' ';
        ArrayList<Character> finalList = new ArrayList<>();
        int max = 0;
        while(!map.isEmpty()){
            max = 0;
            for(char y : map.keySet()){
                if(max < map.get(y)){
                    max = map.get(y);
                    highest = y;
                }
            }
            while(max > 0){
                finalList.add(highest);
                max--;
            }

            map.remove(highest);
        }
        String ret = "";
        //System.out.println(finalList);
        for(int i=0; i<finalList.size(); i++)
            ret += finalList.get(i);

        System.out.println(ret);

    }
}
