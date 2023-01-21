import java.util.Scanner;

class Bank{
    int X;
}

class SBI{
    int interest;
    public void interest(Bank b){
        this.interest = (int)(b.X*0.05);
    }
}

class ICICI extends SBI{
    int interest;
    @Override
    public void interest(Bank b){
        this.interest = (int)(b.X*0.06);
    }
}

class Axis extends ICICI{
    int interest;
    @Override
    public void interest(Bank b){
        this.interest = (int)(b.X*0.07);
    }
}

public class Q2 {
    public static void main(String[] args){
        Bank b = new Bank();
        Scanner line = new Scanner(System.in);
        int X = line.nextInt();
        b.X = X;
        SBI s = new SBI();
        s.interest(b);
        System.out.println("SBI interest is : " + s.interest);

        ICICI i = new ICICI();
        i.interest(b);
        System.out.println("ICICI interest is : " + i.interest);

        Axis a = new Axis();
        a.interest(b);
        System.out.println("AXIS interest is : " + a.interest);
    }
}
