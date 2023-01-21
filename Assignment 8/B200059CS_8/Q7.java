import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int dec = 0;
        int hex = 1;
        int flag = 0;
        String inp = line.nextLine().trim();
        for(int i=inp.length() - 1; i >= 0; i--){
            if(inp.charAt(i) >= '0' && inp.charAt(i) <= '9'){
                dec += (inp.charAt(i) - 48) * hex;
                hex *= 16;
            }
            else if(inp.charAt(i) >= 'A' && inp.charAt(i) <= 'F'){
                dec += (inp.charAt(i) - 55)*hex;
                hex *= 16;
            }
            else{
                System.out.println("InvalidHexadecimal");
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println(dec);
        }

    }
}
