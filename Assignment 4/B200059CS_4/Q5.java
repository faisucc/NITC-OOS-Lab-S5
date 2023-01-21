import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void calculatePension(){
        int pensionAmount = 0;
        if(this.age <= 65)
            pensionAmount = 0;
        else{
            pensionAmount = pensionAmount + 500;
            if(this.age > 70)
                pensionAmount = pensionAmount + 100;
        }
        System.out.println(pensionAmount);
    }
}

public class Q5 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String name = line.nextLine().trim();
        int age = Integer.parseInt(line.nextLine().trim());
        Person p = new Person(name,age);
        p.calculatePension();
    }
}
