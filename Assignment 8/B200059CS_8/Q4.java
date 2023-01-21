import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

    public static String decodeMessage(String first, String curr){
        String ret = "";
        int sum = 0;
        int base = 1;
        for(int i=7; i>=0; i--){
            if(first.charAt(i) != curr.charAt(i)){
                sum += base;
            }
            base *= 2;
        }

        ret += (char)sum;

        return ret;
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();

        if(inp.length() % 8 != 0){
            System.out.println("Incorrect Input");
            return;
        }

        String first = "";
        for(int i=0; i<8; i++){
            first += inp.charAt(i);
        }

        

        ArrayList<String> message = new ArrayList<>();
        String temp = "";
        int flag = 0;
        for(int i=8; i<inp.length(); i++){
            if(i%8 == 0){
                if(flag != 0)
                    message.add(temp);
                //System.out.println("debug: " + temp);
                temp = "";
                flag = 1;
            }
            temp += inp.charAt(i);
        }
        message.add(temp);
        temp = "";
        String ret = "";

        for(String x : message){
            ret += decodeMessage(first, x);
        }

        System.out.println(ret);

    }
}
