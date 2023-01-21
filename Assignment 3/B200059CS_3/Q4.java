import java.util.Arrays;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String department;
    int salary;
}

class Manager extends Employee{
    int bonus;
}

public class Q4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        String inputLine = "";
        int N;


        N = input.nextInt();

        Manager[] people = new Manager[N];
        int i = 0;

        int[] totalSalary = new int[N];

        while(true){
            if(N == 0)
                break;
            inputLine = line.nextLine();
            String[] details = inputLine.split(" ", -2);
            people[i] = new Manager();

            people[i].id = Integer.parseInt(details[0]);
            people[i].name = details[1];
            people[i].department = details[2];
            people[i].salary = Integer.parseInt(details[3]);
            people[i].bonus = Integer.parseInt(details[4]);
            totalSalary[i] = people[i].salary + people[i].bonus;
            i++;
            N--;
        }

        Arrays.sort(totalSalary);
        int maxVal = totalSalary[i-1];


        for(int j=0; j<i; j++){
            //System.out.println(people[j].name);
            if(people[j].salary + people[j].bonus == maxVal){
                System.out.println(people[j].id + " " + people[j].name + " " + people[j].department + " " + people[j].salary + " " + people[j].bonus);
            }
        }
    }
}
