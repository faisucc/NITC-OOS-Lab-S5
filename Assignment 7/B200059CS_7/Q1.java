import java.util.Scanner;

interface currency{
    abstract int convertRupees(int vall);
    abstract int convertDollars(int vall);
    abstract int convertPounds(int vall);

}

class Bank implements currency{

    int val;
    Bank(int num){
        this.val = num;
    }


    public int convertRupees(int vall){
        return vall;
    }
    public int convertDollars(int vall){
        return vall*70;
    }
    public int convertPounds(int vall){
        return vall*100;
    }
}


public class Q1 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int firstBalance = Integer.parseInt(line.nextLine().trim());
        String[] vals = line.nextLine().trim().split(" ", -2);
        Bank b = new Bank(firstBalance);
        if(b.val < b.convertRupees(Integer.parseInt(vals[0])) + b.convertDollars(Integer.parseInt(vals[1])) + b.convertPounds(Integer.parseInt(vals[2])))
            System.out.println("Insufficient balance") ;
        else{
            System.out.println(b.val - (b.convertRupees(Integer.parseInt(vals[0])) + b.convertDollars(Integer.parseInt(vals[1])) + b.convertPounds(Integer.parseInt(vals[2]))));
        }
    }
}
