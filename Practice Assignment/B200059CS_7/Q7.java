import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int X = Integer.parseInt(line.nextLine().trim());
        String inp = line.nextLine().trim();
        String[] numStrings = inp.split(" ", -2);

        HashMap<Integer,Integer> count = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        int curr = 0;

        for(int i=0; i<numStrings.length; i++){
            int x = Integer.parseInt(numStrings[i]);
            try{
                curr = count.get(x);
            } catch (NullPointerException e){
                curr = 0;
            }

            curr++;
            count.put(x,curr);
        }

        for(int x : count.keySet()){
            if(count.get(x) > X)
                nums.add(x);
        }

        if(nums.size() == 0){
            System.out.println("NULL");
        }
        else{
            Collections.sort(nums);
            for(int z = nums.size() - 1; z >= 0; z--)
                System.out.print(nums.get(z) + " ");
        }

    }
}
