import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private String empId;
    private String name;

    public void setEmpId(String id){
        this.empId = id;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getEmpId(){
        return this.empId;
    }

    public String getName(){
        return this.name;
    }
}
public class Q2 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int N = Integer.parseInt(line.nextLine().trim());

        ArrayList<Employee> emp = new ArrayList<>();
        int i = 0;
        while(true){
            if(N == 0)
                break;
            System.out.print("Enter EmpId of Object " + (i+1) + ": ");
            String n = line.nextLine().trim();
            System.out.print("Enter Name of Object " + (i+1) + ": ");
            String m = line.nextLine().trim();

            Employee e = new Employee();
            e.setEmpId(n);
            e.setName(m);
            emp.add(e);

            i++;
            N--;
        }
        System.out.println("The Employees are: ");
        for(int j=0; j<emp.size(); j++){
            System.out.println(emp.get(j).getName() + "(ID: " + emp.get(j).getEmpId() + ")");
        }

    }
}
