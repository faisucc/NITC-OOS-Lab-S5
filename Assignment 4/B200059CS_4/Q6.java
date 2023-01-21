import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Point{
    float abscissa;
    float ordinate;

    Point(int x, int y){
        this.abscissa = (float)x;
        this.ordinate = (float)y;
    }
/*
    public Point newPoint(float x, float y){
        Point p = new Point(0,0);
        p.abscissa = x;
        p.ordinate = y;
        return p;
    }
*/
    public Point midpoint(Point p1, Point p2){
        float x = ((float)p1.abscissa + (float)p2.abscissa)/2;
        float y = ((float)p1.ordinate + (float)p2.ordinate)/2;

        Point p = new Point(0,0);
        p.abscissa = x;
        p.ordinate = y;
        return p;
    }
}

public class Q6 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String point = line.nextLine().trim();
        String[] points = point.split(",",-2);
        Point p1 = new Point(Integer.parseInt(points[0]),Integer.parseInt(points[1]));
        point = line.nextLine().trim();
        points = point.split(",",-2);
        Point p2 = new Point(Integer.parseInt(points[0]),Integer.parseInt(points[1]));
        Point ans = new Point(-1,-1);
        ans = ans.midpoint(p1,p2);

        BigDecimal ans1 = new BigDecimal((double)ans.abscissa);
        BigDecimal ans2 = new BigDecimal((double)ans.ordinate);

        BigDecimal out1 = ans1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal out2 = ans2.setScale(2, RoundingMode.HALF_UP);

        System.out.println(out1 + "," + out2);
    }

}
