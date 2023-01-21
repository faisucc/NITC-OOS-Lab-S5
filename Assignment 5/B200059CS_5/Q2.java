import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Q2 {

    public static void calculateArea(int r){
        double area = Math.PI*r*r;
        BigDecimal ans = new BigDecimal(area);
        BigDecimal ret = ans.setScale(2,RoundingMode.HALF_UP);
        System.out.println(ret);
    }

    public static void calculateArea(int l, int b){
        double area = l*b;
        BigDecimal ans = new BigDecimal(area);
        BigDecimal ret = ans.setScale(2,RoundingMode.HALF_UP);
        System.out.println(ret);
    }

    public static void calculateArea(int a, int b, int c){
        double s = (a+b+c)/2;
        double insideRoot = s*(s-a)*(s-b)*(s-c);
        double ans = Math.sqrt(insideRoot);
        BigDecimal newAns = new BigDecimal(ans);
        BigDecimal ret = newAns.setScale(2,RoundingMode.HALF_UP);
        System.out.println(ret);
    }

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        String[] det = inp.split(" ", -2);
        if(det.length == 1)
            calculateArea(Integer.parseInt(det[0]));
        else if(det.length == 2)
            calculateArea(Integer.parseInt(det[0]),Integer.parseInt(det[1]));
        else if(det.length == 3)
            calculateArea(Integer.parseInt(det[0]),Integer.parseInt(det[1]),Integer.parseInt(det[2]));

    }

}
