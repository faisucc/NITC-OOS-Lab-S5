import java.util.Scanner;

abstract class Addition{
    abstract void add();
}

class IntegerAddition extends Addition{
    int x;
    int y;

    IntegerAddition(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void add(){
        System.out.println(this.x + this.y);
    }
}

class FractionAddition extends Addition{
    int n1;
    int n2;
    int d1;
    int d2;

    FractionAddition(int n1, int d1, int n2, int d2){
        this.n1 = n1;
        this.d1 = d1;
        this.n2 = n2;
        this.d2 = d2;
    }

    public int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }

    @Override
    public void add(){
        int n = (n1*d2) + (n2*d1);
        int d = (d1*d2);
        int gcd = GCD(n,d);
        n = n/gcd;
        d = d/gcd;
        System.out.println(n + "/" + d);
    }
}

public class Q4 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String l1 = line.nextLine().trim();
        String[] one = l1.split(" ",-2);
        String l2 = line.nextLine().trim();
        String[] two = l2.split(" ", -2);

        IntegerAddition i = new IntegerAddition(Integer.parseInt(one[0]),Integer.parseInt(one[1]));
        i.add();

        FractionAddition f = new FractionAddition(Integer.parseInt(two[0]),Integer.parseInt(two[1]),Integer.parseInt(two[2]),Integer.parseInt(two[3]));
        f.add();
    }
}
