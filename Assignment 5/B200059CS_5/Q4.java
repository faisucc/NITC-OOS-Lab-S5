import java.util.ArrayList;
import java.util.Scanner;

class Customer{
    String customerName;
    String accountNo;
    int currentBalance;

    public void addDetails(String name, String accno, int balance){
        this.customerName = name;
        this.accountNo = accno;
        this.currentBalance = balance;
    }

    public void availableBalance(){
        System.out.println(this.customerName + ":" + this.currentBalance);
    }

}

class SilverMembership extends Customer{
    public void availableBalance(Customer cust){
        int newBalance = cust.currentBalance + (int)(0.05*cust.currentBalance);
        System.out.println(cust.customerName + ":" + cust.currentBalance + ":" + "Silver" + ":" + newBalance);
        cust.currentBalance = newBalance;
    }
}

class GoldMembership extends Customer{
    public void availableBalance(Customer cust){
        int newBalance = cust.currentBalance + (int)(0.1*cust.currentBalance);
        System.out.println(cust.customerName + ":" + cust.currentBalance + ":" + "Gold" + ":" + newBalance);
        cust.currentBalance = newBalance;
    }
}


class PlatinumMembership extends Customer{
    public void availableBalance(Customer cust){
        int newBalance = cust.currentBalance + (int)(0.15*cust.currentBalance);
        System.out.println(cust.customerName + ":" + cust.currentBalance + ":" + "Platinum" + ":" + newBalance);
        cust.currentBalance = newBalance;
    }
}

public class Q4 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int N = Integer.parseInt(inp);
        while(true){
            if(N == 0)
                break;
            inp = line.nextLine().trim();
            String[] det = inp.split(":",-2);
            Customer newCust = new Customer();
            newCust.addDetails(det[0],det[1],Integer.parseInt(det[2]));
            if(newCust.currentBalance < 100000){
                SilverMembership temp = new SilverMembership();
                temp.availableBalance(newCust);
            }
            else if(newCust.currentBalance >= 100000 && newCust.currentBalance < 1000000){
                GoldMembership temp = new GoldMembership();
                temp.availableBalance(newCust);
            }
            else if(newCust.currentBalance >= 1000000){
                PlatinumMembership temp = new PlatinumMembership();
                temp.availableBalance(newCust);
            }

            N--;
        }
    }

}
