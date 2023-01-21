import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String op = line.nextLine().trim();
        try{
            int first = Integer.parseInt(line.nextLine().trim());
            int second = Integer.parseInt(line.nextLine().trim());
            if(op.equals("+")){
                System.out.println(first+second);
            }
            else if(op.equals("-")){
                System.out.println(first-second);
            }
            else if(op.equals("*")){
                System.out.println(first*second);
            }
            else if(op.equals("/")){
                try{
                    System.out.println(first/second);
                } catch(ArithmeticException e){
                    System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument");
                }
            }
        } catch(NumberFormatException e){
            System.out.println("NumberFormatException: Enter a valid argument");
        }


    }
}
