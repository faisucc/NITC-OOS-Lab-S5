package studentdatapackage;

public class StudentData {
    private String id;
    private String name;

    public void insertStudentData(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String returnID(){
        return this.id;
    }

    public String returnName(){
        return this.name;
    }

}
