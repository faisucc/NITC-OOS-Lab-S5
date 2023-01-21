import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        String inp = line.nextLine().trim();
        String[] numStrings = inp.split(", ", -2);
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numStrings.length; i++){
            int X = Integer.parseInt(numStrings[i]);
            if(X > max)
                max = X;
            if(X < min)
                min = X;
        }
        System.out.print("Maximum value: " + max);
        System.out.print("\n");
        System.out.print("Minimum value: " + min);
    }
}
