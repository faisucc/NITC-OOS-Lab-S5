import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(line.nextLine().trim());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(line.nextLine().trim());
        System.out.print("Choose operator (+,-,*,/,%): ");
        String op = line.nextLine().trim();
        switch(op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                try{
                    System.out.println(n1*n2);

                }
                catch (NumberFormatException e){
                    System.out.println("Overflow!");

                }
                break;
            case "/":
                if(n2 == 0){
                    System.out.println("Division by zero is not possible!");
                    break;
                }
                System.out.println(n1/n2);
                break;
            case "%":
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
