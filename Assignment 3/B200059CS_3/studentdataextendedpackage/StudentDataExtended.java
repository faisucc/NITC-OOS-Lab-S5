package studentdataextendedpackage;
import studentdatapackage.*;

import java.util.TreeMap;

public class StudentDataExtended extends StudentData{
    private String location;

    public void addDetails(String id, String name, String location){
        insertStudentData(id,name);
        this.location = location;
    }

    public void printDetails(TreeMap<String,StudentDataExtended> details){
        StudentDataExtended temp = new StudentDataExtended();
        for(String student: details.keySet()){
            temp = details.get(student);
            System.out.println(student + " " + temp.returnName() + " " + temp.location);
        }
    }
}
