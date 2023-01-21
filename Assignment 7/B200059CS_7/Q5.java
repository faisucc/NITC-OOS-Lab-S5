import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

interface OrderStudents{
    void OrderByRollNumber(ArrayList<Student> students);
    void OrderByName(ArrayList<Student> students);
}


class Student implements OrderStudents{
    String name;
    int rollno;
    String address;

    Comparator<Student> cmpRollNo = new Comparator<>() {

        public int compare(Student o1, Student o2) {
            return (o1.rollno - o2.rollno);
        }
    };

    Comparator<Student> cmpName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return (o1.name.compareTo(o2.name));
        }
    };

    public void OrderByRollNumber(ArrayList<Student> students){
        Collections.sort(students,cmpRollNo);
        for(Student temp : students){
            System.out.println(temp.rollno + " " + temp.name + " " +  temp.address);
        }
    }

    public void OrderByName(ArrayList<Student> students){
        Collections.sort(students,cmpName);
        for(Student temp : students){
            System.out.println(temp.rollno + " " + temp.name + " " +  temp.address);
        }
    }
}
public class Q5 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int N = Integer.parseInt(line.nextLine().trim());
        while(true){
            if(N == 0)
                break;
            String[] det = line.nextLine().trim().split(" ", -2);
            Student s = new Student();
            s.rollno = Integer.parseInt(det[0]);
            s.name = det[1];
            s.address = det[2];
            students.add(s);
            N--;
        }

        Student temp = new Student();
        //System.out.println("//Sorted by Rollno");
        temp.OrderByRollNumber(students);
        System.out.println();
        //System.out.println("//Sorted by Name");
        temp.OrderByName(students);
    }
}
