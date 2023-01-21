import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int N = Integer.parseInt(line.nextLine().trim());
        for(int i=1; i<(N+1); i++){
            int temp = i;
            for(int j=1; j<(i+1); j++){
                System.out.print(temp + " ");
                temp += (N-j);
            }
            System.out.print("\n");
        }
    }
}