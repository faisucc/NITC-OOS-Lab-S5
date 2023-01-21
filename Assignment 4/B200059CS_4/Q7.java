import java.util.Scanner;
class Angle{
    int degrees;
    int minutes;

    public Angle angleSum(Angle angle1, Angle angle2){
        int m1 = angle1.minutes;
        int m2 = angle2.minutes;
        int d1 = angle1.degrees;
        int d2 = angle2.degrees;

        int fm = (m1+m2);
        int newfm;
        if(fm >= 60)
            newfm = 1;
        else
            newfm = 0;
        int fd = newfm + d1 + d2;

        Angle ans = new Angle();
        ans.degrees = fd;
        ans.minutes = fm%60;

        return ans;
    }
}

public class Q7 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();

        Angle a1 = new Angle();
        Angle a2 = new Angle();
        String[] det = inp.split(" ", -2);
        a1.degrees = Integer.parseInt(det[0]);
        a1.minutes = Integer.parseInt(det[1]);

        inp = line.nextLine().trim();
        det = inp.split(" ", -2);
        a2.degrees = Integer.parseInt(det[0]);
        a2.minutes = Integer.parseInt(det[1]);

        Angle a = new Angle();
        a = a.angleSum(a1,a2);

        System.out.println(a.degrees + " " + a.minutes);

    }

}
