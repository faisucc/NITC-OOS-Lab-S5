import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int len = inp.length();

       // ArrayList<Character> letters = new ArrayList<>();

        char[] letters = new char[len];

        for(int i=0; i<len; i++){
            letters[i] = '.';
        }

        letters[len-1] = inp.charAt(len-1);
        letters[0] = inp.charAt(len-2);
        int i = len-3;
        int left = 1;
        int flag = 0;
        while(i != -1){
            if(flag == 0){
                letters[len-left-1] = inp.charAt(i);
                i--;
                flag = 1;
            }
            else{
                letters[left] = inp.charAt(i);
                i--;
                flag = 0;
                left++;
            }
        }

        System.out.println(letters);
    }
}
