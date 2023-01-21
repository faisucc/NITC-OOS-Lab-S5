import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        String inp = line.nextLine().trim();
        ArrayList<Integer> even =  new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        String[] numStrings = inp.split(" ", -2);
        for(int i=0; i<numStrings.length; i++){
            int x = Integer.parseInt(numStrings[i]);
            if(x%2 == 0){
                even.add(x);
            }
            else
            {
                odd.add(x);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.print("Even array: ");
        for(int i=0; i<even.size(); i++)
            System.out.print(even.get(i) + " ");
        System.out.print("\n");
        System.out.print("Odd array: ");
        for(int i=0; i<odd.size(); i++)
            System.out.print(odd.get(i) + " ");
    }
}
