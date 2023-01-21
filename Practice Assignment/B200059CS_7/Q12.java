import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

class EmpTax{
    String name;
    int annIncome;

    public double calculateTax(){
        if(this.annIncome >= 250000 && this.annIncome < 1000000)
            return (double)(this.annIncome*0.1);
        else if(annIncome >= 1000000)
            return (double)(this.annIncome*0.2);
        else
            return (double)0;

    }

}

public class Q12 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int N = Integer.parseInt(line.nextLine().trim());
        if(N <= 0){
            System.out.println("INVALID");
            return;
        }
        ArrayList<EmpTax> emp = new ArrayList<>();
        while(true){
            if(N == 0)
                break;
            String inp = line.nextLine().trim();
            String[] det = inp.split(":", -2);
            EmpTax e = new EmpTax();
            e.name = det[0];
            e.annIncome = Integer.parseInt(det[1]);
            emp.add(e);
            N--;
        }

        for(int i=0; i<emp.size(); i++){
            double ans = emp.get(i).calculateTax();
            BigDecimal bd = new BigDecimal(ans);
            BigDecimal ret = bd.setScale(2, RoundingMode.HALF_UP);
            System.out.println(emp.get(i).name + ":" + ret);
        }
    }
}
