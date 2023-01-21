import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int N = Integer.parseInt(line.nextLine().trim());
        int[] arr = new int[N];
        String[] nums = line.nextLine().trim().split(" ", -2);
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        int sum = 0;
        String[] indices = line.nextLine().trim().split(" ", -2);
        try{
            for(int i=0; i<indices.length; i++){
                sum += arr[Integer.parseInt(indices[i])];
            }
            System.out.println(sum);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
        }
    }
}
