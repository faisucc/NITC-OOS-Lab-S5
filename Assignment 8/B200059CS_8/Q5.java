import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String[] coord = line.nextLine().trim().split(" ", -2);
        int first = Integer.parseInt(coord[0]);
        int second = Integer.parseInt(coord[1]);
        int N = Integer.parseInt(line.nextLine().trim());
        while(N > 0){
            String[] det = line.nextLine().trim().split(" ", -2);
            if(det[0].equalsIgnoreCase("Up")){
                first = first - Integer.parseInt(det[1]);
            }
            else if(det[0].equalsIgnoreCase("Down")){
                first = first + Integer.parseInt(det[1]);
            }
            else if(det[0].equalsIgnoreCase("Left")){
                second = second - Integer.parseInt(det[1]);
            }
            else if(det[0].equalsIgnoreCase("Right")){
                second = second + Integer.parseInt(det[1]);
            }
            N--;
        }

        if(first < 1 || first > 8 || second < 1 || second > 8){
            System.out.println("Overflow");
        }
        else{
            System.out.println("[" + first + "," + second + "]");
        }
    }
}
