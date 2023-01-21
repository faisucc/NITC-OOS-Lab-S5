import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    String personName;
    int age;
}

class Student extends Person{
    int rollNumber;
    int percentageOfMarks;
}



class PGStudent extends Student{
    String elective;
    int numberOfSubjects;

    public static Comparator<PGStudent> marks = new Comparator<PGStudent>() {
      //  @Override
        public int compare(PGStudent o1, PGStudent o2) {
            int mark1 = o1.percentageOfMarks;
            int mark2 = o2.percentageOfMarks;
            return mark2-mark1;
        }
    };

    public void addStudent(String name, int age, String elective, int percentage){
        this.personName = name;
        this.age = age;
        this.elective = elective;
        this.percentageOfMarks = percentage;
    }

    public void Toppers(ArrayList<PGStudent> students){
        Collections.sort(students,marks);
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).personName);
        }
    }
}

public class Q7 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int N = Integer.parseInt(inp);

        ArrayList<PGStudent> students = new ArrayList<>();

        while(true){
            if(N == 0)
                break;
            inp = line.nextLine().trim();
            String[] det = inp.split(":",-2);
            PGStudent newStud = new PGStudent();
            newStud.addStudent(det[0],Integer.parseInt(det[1]),det[2],Integer.parseInt(det[3]));
            students.add(newStud);
            N--;
        }

        PGStudent temp = new PGStudent();
        temp.Toppers(students);

    }

}
