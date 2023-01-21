import studentdatapackage.*;
import studentdataextendedpackage.*;


import java.util.Scanner;
import java.util.TreeMap;

public class Q6 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        Scanner line = new Scanner(System.in);

        String inputLine = "";
        TreeMap<String,StudentDataExtended> studentDetails = new TreeMap<>();
        StudentDataExtended students;

        System.out.print("Enter the number of students : ");
        int noOfStudents = number.nextInt();
        int counter = noOfStudents;
        int i = 0;

        while(true){
            if(counter == 0)
                break;
            System.out.println("Enter the details of Student " + (i+1) + "  (id, name, location):");
            students = new StudentDataExtended();
            inputLine = line.nextLine();
            String[] inputDetails = inputLine.split(" ", -2);
            students.addDetails(inputDetails[0],inputDetails[1],inputDetails[2]);
            studentDetails.put(inputDetails[0],students);
            counter--;
            i++;
        }

        System.out.println("The Student Details are: ");
        StudentDataExtended temp = new StudentDataExtended();
        temp.printDetails(studentDetails);

    }
}
