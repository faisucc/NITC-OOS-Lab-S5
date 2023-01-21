import java.util.Scanner;

public class Q1 {
    public static void bitwiseAND(int x, int y){
        int ans = x&y;
        System.out.println(ans);
    }

    public static void bitwiseAND(int x, int y, int z){
        int ans = x&y&z;
        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        String[] det = inp.split(" ", -2);
        if(det.length == 2)
            bitwiseAND(Integer.parseInt(det[0]),Integer.parseInt(det[1]));
        else if(det.length == 3)
            bitwiseAND(Integer.parseInt(det[0]),Integer.parseInt(det[1]),Integer.parseInt(det[2]));
    }
}
