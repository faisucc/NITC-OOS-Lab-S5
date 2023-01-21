import java.util.Scanner;

class TelephoneCall{
    String phNo;
    String custName;
    int callSlots;
    int totalBill;

    public void readCustomer(String phNo, String custName, int callSlots){
        this.phNo = phNo;
        this.custName = custName;
        this.callSlots = callSlots;
    }

    public void computeBill(){
        this.totalBill = 300;
        if(this.callSlots <= 100)
            this.totalBill = this.totalBill + 500;
        else {
            if(this.totalBill >= 101 && this.totalBill <= 200)
                this.totalBill += 8*this.callSlots;
            else if(this.totalBill >= 201 && this.totalBill <= 300)
                this.totalBill += 10*this.callSlots;
            else
                this.totalBill += 15*this.callSlots;
        }
        System.out.println(this.totalBill);
    }

}

public class Q4 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String name = line.nextLine().trim();
        String num = line.nextLine().trim();
        int slots = Integer.parseInt(line.nextLine().trim());

        TelephoneCall customer = new TelephoneCall();
        customer.readCustomer(num,name,slots);
        customer.computeBill();
    }
}
