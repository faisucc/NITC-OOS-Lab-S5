import java.util.ArrayList;
import java.util.Scanner;

class Customer{
    String name;
    String no;
    String type;
}

class Service extends Customer{
    String serviceName;
    int rate;
}

class Membership extends Customer{

    public int getFinalPrice(Customer c, int price){
        int finalPrice = 0;
        if(c.type.equalsIgnoreCase("Silver")){
            finalPrice = (int)(price*0.1);
        }
        else if(c.type.equalsIgnoreCase("Gold")){
            finalPrice = (int)(price*0.15);
        }
        else if(c.type.equalsIgnoreCase("Platinum")){
            finalPrice = (int)(price*0.2);
        }
        else
            finalPrice = 0;

        return finalPrice;
    }
}

public class Q6 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        ArrayList<Service> servicesTaken = new ArrayList<>();
        String newAns = "Y";
        while(!newAns.equalsIgnoreCase("N")){
            System.out.println("Enter customer details: ");
            System.out.print("Name: ");
            String name = line.nextLine().trim();
            System.out.print("Mobile: ");
            String no = line.nextLine().trim();
            System.out.print("Membership: ");
            String mem = line.nextLine().trim();

            Customer c = new Customer();
            c.name = name;
            c.no = no;
            c.type = mem;

            System.out.print("Add Service(Y/N): ");
            String ans = line.nextLine().trim();
            while(!ans.equalsIgnoreCase("N")){
                System.out.print("ServiceName: ");
                String serName = line.nextLine().trim();
                System.out.print("Rate: ");
                int rate = Integer.parseInt(line.nextLine().trim());
                System.out.print("Add Service(Y/N): ");

                Service s = new Service();
                s.serviceName = serName;
                s.rate = rate;
                servicesTaken.add(s);
                ans = line.nextLine().trim();
            }

            System.out.println("*****BILL*****");
            System.out.println(name + "\t" + no + "\t" + mem);
            int total = 0;
            Membership m = new Membership();

            for(int i=0; i<servicesTaken.size(); i++){
                System.out.println((i+1) + ". " + servicesTaken.get(i).serviceName + "\t" + servicesTaken.get(i).rate);
                total += servicesTaken.get(i).rate;
            }
            System.out.println("Total: " + total + "-" + m.getFinalPrice(c,total));
            System.out.println("Please Pay: " + (total - m.getFinalPrice(c,total)));
            servicesTaken.clear();

            System.out.println("Enter another customer's details?(Y/N)");
            newAns = line.nextLine().trim();
        }


    }
}
