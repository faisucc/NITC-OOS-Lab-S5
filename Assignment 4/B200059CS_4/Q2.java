import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        String[] det = inp.split(" ", -2);

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0; i<det.length; i++){
            nums.add(Integer.parseInt(det[i]));
        }
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<nums.size(); j++){
                for(int k=j+1; k<nums.size(); k++){
                    if(nums.get(j) + nums.get(k) == nums.get(i))
                        count++;
                }
            }
        }

        System.out.println(count);

    }
}
