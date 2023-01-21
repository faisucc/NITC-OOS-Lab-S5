import com.sun.source.tree.Tree;

import java.util.*;

class Student{
    String studentName;
    int rollNo;
    int englishScore;
    int hindiScore;
    int mathsScore;
    int scienceScore;
    int ssScore;

    public void addStudent(){
        Scanner line = new Scanner(System.in);
        String input = line.nextLine().trim();
        String[] inputDetails = input.split(" ",-2);
        this.studentName = inputDetails[0];
        this.rollNo = Integer.parseInt(inputDetails[1]);
        this.englishScore = Integer.parseInt(inputDetails[2]);
        this.hindiScore = Integer.parseInt(inputDetails[3]);
        this.mathsScore = Integer.parseInt(inputDetails[4]);
        this.scienceScore = Integer.parseInt(inputDetails[5]);
        this.ssScore = Integer.parseInt(inputDetails[6]);
    }

    public static Comparator<Student> englishMarks = new Comparator<Student>() {
        //@Override
        public int compare(Student o1, Student o2) {
            int mark1 = o1.englishScore;
            int mark2 = o2.englishScore;
            return mark2 - mark1;
        }
    };

    public static Comparator<Student> hindiMarks = new Comparator<Student>() {
        //@Override
        public int compare(Student o1, Student o2) {
            int mark1 = o1.hindiScore;
            int mark2 = o2.hindiScore;
            return mark2 - mark1;
        }
    };

    public static Comparator<Student> scienceMarks = new Comparator<Student>() {
        //@Override
        public int compare(Student o1, Student o2) {
            int mark1 = o1.scienceScore;
            int mark2 = o2.scienceScore;
            return mark2 - mark1;
        }
    };

    public static Comparator<Student> mathsMarks = new Comparator<Student>() {
        //@Override
        public int compare(Student o1, Student o2) {
            int mark1 = o1.mathsScore;
            int mark2 = o2.mathsScore;
            return mark2 - mark1;
        }
    };

    public static Comparator<Student> ssMarks = new Comparator<Student>() {
        //@Override
        public int compare(Student o1, Student o2) {
            int mark1 = o1.ssScore;
            int mark2 = o2.ssScore;
            return mark2 - mark1;
        }
    };

    public void subjectTopper(ArrayList<Student> students){
        //take input for subject code
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();

        //ArrayList<Integer> marks = new ArrayList<>();

        if(inp.equals("101")){
            Collections.sort(students,englishMarks);
            int first = students.get(0).englishScore;
            for(Student x : students){
                if(first != x.englishScore)
                    break;
                System.out.println(x.studentName + " " + x.rollNo);
            }
            return;
        }

        if(inp.equals("102")){
            Collections.sort(students,hindiMarks);
            int first = students.get(0).hindiScore;
            for(Student x : students){
                if(first != x.hindiScore)
                    break;
                System.out.println(x.studentName + " " + x.rollNo);
            }
            return;
        }

        if(inp.equals("103")){
            Collections.sort(students,mathsMarks);
            int first = students.get(0).mathsScore;
            for(Student x : students){
                if(first != x.mathsScore)
                    break;
                System.out.println(x.studentName + " " + x.rollNo);
            }
            return;
        }

        if(inp.equals("104")){
            Collections.sort(students,scienceMarks);
            int first = students.get(0).scienceScore;
            for(Student x : students){
                if(first != x.scienceScore)
                    break;
                System.out.println(x.studentName + " " + x.rollNo);
            }
            return;
        }

        if(inp.equals("105")){
            Collections.sort(students,ssMarks);
            int first = students.get(0).ssScore;
            for(Student x : students){
                if(first != x.ssScore)
                    break;
                System.out.println(x.studentName + " " + x.rollNo);
            }
            return;
        }

    }

    public void classTopper(ArrayList<Student> students){
        TreeMap<Integer,Student> maxMarks = new TreeMap<>();
        int sum = 0;
        for(int i=0; i<students.size(); i++){
            sum += students.get(i).englishScore + students.get(i).ssScore + students.get(i).scienceScore + students.get(i).mathsScore + students.get(i).hindiScore;
            maxMarks.put(-1*sum,students.get(i));
            sum = 0;
        }

        int first = maxMarks.firstKey();
        for(int x : maxMarks.keySet()){
            if(x != first)
                break;
            Student temp = maxMarks.get(x);
            System.out.println(temp.studentName + " " + temp.rollNo);
        }
        return;

    }

}

public class Q8 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String inp = "";

        while(true){
            inp = line.nextLine().trim();
            if(inp.equals("a")){
                Student newStudent = new Student();
                newStudent.addStudent();
                students.add(newStudent);
            }
            else if(inp.equals("s")){
                Student temp = new Student();
                temp.subjectTopper(students);
            }
            else if(inp.equals("c")){
                Student temp = new Student();
                temp.classTopper(students);
            }
            else if(inp.equals("t")){
                break;
            }

        }
    }
}
