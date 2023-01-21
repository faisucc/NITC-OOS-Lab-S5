import java.util.Scanner;

public class Q1 {

    public static void display(char a, int n){
        for(int i=0; i<n; i++){
            int k = 0;
            while(k <= i)
            {
                System.out.print(a + " ");
                k++;
            }
            System.out.print("\n");
        }
    }

    public static void display(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void display(int a, int b){
        System.out.println((a*a) + (b*b));
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        String[] det = inp.split(" ",-2);
        if(det.length == 1){
            display(Integer.parseInt(det[0]));
        }
        else{
            try{
                int x = Integer.parseInt(det[0]);
                int y = Integer.parseInt(det[1]);
                display(x,y);
            } catch (NumberFormatException e){
                char x = det[0].charAt(0);
                int y = Integer.parseInt(det[1]);
                display(x,y);
            }

        }
    }

}
