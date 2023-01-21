import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int employeeId;
    String employeeName;
    int salary;

    public void addDet(int empid, String name){
        this.employeeId = empid;
        this.employeeName = name;
    }

    public int CalculateSalary(){
        return this.salary;
    }

}

class PermanentEmployee extends Employee{
    int basicPay;
    int PFAmount;

    public int CalculateSalary(Employee e){
        e.salary = this.basicPay - (int)(0.12*this.basicPay);
        return e.salary;
    }

}

class TemporaryEmployee extends Employee{
    int hoursWorked;
    int hourlyWages;

    public int CalculateSalary(Employee e){
        e.salary = this.hourlyWages*this.hoursWorked;
        return e.salary;
    }
}

public class Q6 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int N = Integer.parseInt(inp);

        ArrayList<Employee> emp = new ArrayList<>();

        while(true){
            if(N == 0)
                break;
            Employee e = new Employee();
            inp = line.nextLine().trim();
            String[] det = inp.split(" ",-2);
            e.addDet(Integer.parseInt(det[1]),det[2]);
            if(det[0].equals("1")){
                PermanentEmployee e1 = new PermanentEmployee();
                e1.basicPay = Integer.parseInt(det[3]);
                e1.CalculateSalary(e);
            }
            else if(det[0].equals("2")){
                TemporaryEmployee e2 = new TemporaryEmployee();
                e2.hoursWorked = Integer.parseInt(det[3]);
                e2.hourlyWages = Integer.parseInt(det[4]);
                e2.CalculateSalary(e);
            }

            emp.add(e);

            N--;
        }

        int empid = Integer.parseInt(line.nextLine().trim());
        int flag = 0;
        for(int i=0; i<emp.size(); i++){
            if(emp.get(i).employeeId == empid){
                System.out.println(emp.get(i).employeeId + " " + emp.get(i).employeeName + " " + emp.get(i).CalculateSalary());
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println("-1");
    }
}
