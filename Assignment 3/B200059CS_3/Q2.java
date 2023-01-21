import java.util.Scanner;

class Inventory{
    int ID;
    String name;
    int unit_price;
}

public class Q2 {
    public static void main(String[] args){
        Inventory [] item = new Inventory[1000];
        int i = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        String inputline = "";
        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        while(true){
            inputline = input.nextLine();
            if(inputline.equals("OKAY"))
                break;
            String[] eachWord = inputline.split(" ",-2);
            item[i] = new Inventory();
            item[i].ID = Integer.parseInt(eachWord[0]);
            item[i].name = eachWord[1];
            item[i].unit_price = Integer.parseInt(eachWord[2]);
            i++;
        }

        inputline = "";
        String[] invoice = new String[1000];
        int count = 0;
        while(true){

            System.out.println("1.Add Invoice");
            System.out.println("2.Exit");
            System.out.println("Choice:");
            inputline = input.nextLine();
            if(inputline.equals("2"))
                break;
            System.out.println("Add Invoice Item(Y/N)");
            inputline = input.nextLine();
            if(inputline.equals("Y")){
                System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                while(true){
                    inputline = input.nextLine();
                    if(inputline.equals("OKAY"))
                        break;
                    String[] eachInvoice = inputline.split(" ",-2);
                    for(int j=0; j<i; j++){
                        if(item[j].ID == Integer.parseInt(eachInvoice[0])){
                            invoice[count] = item[j].ID + "," + item[j].name + "," + item[j].unit_price + "," + Integer.parseInt((eachInvoice[1]));
                            count++;
                            total = total + (Integer.parseInt(eachInvoice[1])*item[j].unit_price);
                        }
                    }
                }

                System.out.println("****INVOICE****");
                for(int j=0; j<count; j++){
                    System.out.println(invoice[j]);
                }
                System.out.print("Total:");
                System.out.println(total);
                System.out.println("********");
            }
        }
    /*    for(int j = 0; j < i; j++){
            System.out.print(item[j].ID);
            System.out.print(" ");
            System.out.print(item[j].name);
            System.out.print(" ");
            System.out.print(item[j].unit_price);
            System.out.print("\n");
        } */
    }
}
