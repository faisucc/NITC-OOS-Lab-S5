import java.util.Scanner;
import java.util.TreeMap;

abstract class Student{

    abstract public int getFeeDetails(TreeMap<String,String> students, String rNo);
    abstract public void setFeeDetails(TreeMap<String,String> students);
}

class Undergraduate extends Student{

    public void setFeeDetails(TreeMap<String,String> students){
        for(String x : students.keySet()){
            String temp = students.get(x);
            String[] det = temp.split(" ", -2);
            if(det[det.length-1].equals("UG")){
                temp += " 45000";
                students.put(x,temp);
            }
        }
    }

    public int getFeeDetails(TreeMap<String,String> students, String rNo){
        int ret = 0;
        for(String x : students.keySet()){
            if(x.equalsIgnoreCase(rNo)){
                String temp = students.get(x);
                String[] req = temp.split(" ",-2);
                ret = Integer.parseInt(req[req.length-1]);
            }
        }
        return ret;
    }
}

class Postgraduate extends Student{

    public void setFeeDetails(TreeMap<String,String> students){
        for(String x : students.keySet()){
            String temp = students.get(x);
            String[] det = temp.split(" ", -2);
            if(det[det.length-1].equals("PG")){
                temp += " 25000";
                students.put(x,temp);
            }
        }
    }

    public int getFeeDetails(TreeMap<String,String> students, String rNo){
        int ret = 0;
        for(String x : students.keySet()){
            if(x.equalsIgnoreCase(rNo)){
                String temp = students.get(x);
                String[] req = temp.split(" ",-2);
                ret = Integer.parseInt(req[req.length-1]);
            }
        }
        return ret;
    }
}

public class Q5 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String feesLine = line.nextLine().trim();
        String[] fees = feesLine.split(" ",-2);
        TreeMap<String,String> students= new TreeMap<>();

        int k = Integer.parseInt(line.nextLine().trim());
        while(true){
            if(k == 0)
                break;
            String deets = line.nextLine().trim();
            String[] det = deets.split(" ", -2);
            students.put(det[1],deets);
            k--;
        }

        String rno = line.nextLine().trim();
        for(String x : students.keySet()){
            if(x.equalsIgnoreCase(rno)){
                String temp = students.get(x);
                String[] deet = temp.split(" ",-2);
                if(deet[deet.length-1].equals("UG")){
                    Undergraduate u = new Undergraduate();
                    u.setFeeDetails(students);
                    System.out.println(u.getFeeDetails(students,rno));
                }
                else if(deet[deet.length-1].equals("PG")){
                    Postgraduate p = new Postgraduate();
                    p.setFeeDetails(students);
                    System.out.println(p.getFeeDetails(students,rno));
                }
            }
        }

    }

}
