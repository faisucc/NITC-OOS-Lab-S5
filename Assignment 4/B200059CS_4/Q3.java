import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class IntegerArray{
    //int[] data;
    int[] data = new int[5];

    public void inputData(int[] dataMain){

        for(int i=0; i<5; i++){
            this.data[i] = dataMain[i];
        }

    }

    public void bubSort(){
        int n = this.data.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i);j++){
                if(this.data[j-1] > this.data[j]){
                    temp = this.data[j-1];
                    this.data[j-1] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(this.data[i] + " ");
        }

    }

}

public class Q3 {

    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        Scanner line = new Scanner(System.in);
        String input = line.nextLine().trim();
        String[] num = input.split(" ",-2);
        int[] vals = new int[6];

        for(int i=0; i<5; i++){
            numbers.add(Integer.parseInt(num[i]));
            vals[i] = Integer.parseInt(num[i]);
        }

        if(numbers.size() != 5){
            System.out.println("INVALID INPUT");
        }
        else{
            IntegerArray i = new IntegerArray();
            i.inputData(vals);
            i.bubSort();
        }

    }


}
