import java.util.*;


public class Q1 {

    public static boolean checkIfVowel(int x){
        if(x == 97 || x == 101 || x == 105 || x == 111 || x == 117)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String word = line.nextLine();
        String noVowels = "";

        for(int i = 0; i < word.length(); i++) {
            if (checkIfVowel((int) word.charAt(i)) == true)
                continue;
            noVowels = noVowels + word.charAt(i);
        }

        char tempArray[] = noVowels.toCharArray();
        Arrays.sort(tempArray);
        for(char x : tempArray){
            System.out.print(x);
        }
    }
}
