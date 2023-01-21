import java.util.Scanner;

interface HDFC{
    int transactionHDFC(int firstBalance, int cost);
}
interface ICICI{
    int transactionICICI(int firstBalance, int cost);
}

class Flipkart implements HDFC,ICICI{
    public int transactionHDFC(int firstBalance, int cost){
        return firstBalance - cost;
    }

    public int transactionICICI(int firstBalance, int cost){
        return firstBalance - cost;
    }
}

public class Q2 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int N = Integer.parseInt(line.nextLine().trim());
        int total = 0;
        int ret;
        while(true){
            if(N == 0)
                break;
            String[] det = line.nextLine().trim().split(" ", -2);
            if(det[0].equals("HDFC")){
                Flipkart f = new Flipkart();
                ret = f.transactionHDFC(Integer.parseInt(det[1]),Integer.parseInt(det[2]));
                total += Integer.parseInt(det[2]);
                System.out.println(total + " " + ret);
            }
            else if(det[0].equals("ICICI")){
                Flipkart ff = new Flipkart();
                ret = ff.transactionICICI(Integer.parseInt(det[1]),Integer.parseInt(det[2]));
                total += Integer.parseInt(det[2]);
                System.out.println(total + " " + ret);
            }
            N--;
        }
    }
}
