import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

class Students {
    String name;
    int rollNo;
    int height;
}

public class Q3 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int n = Integer.parseInt(inp);
        int y;

        TreeMap<Integer,String> studs = new TreeMap<>();
        ArrayList<Students> details = new ArrayList<>();


        while(true){
            if(n == 0)
                break;
            inp = line.nextLine().trim();
            StringBuilder newInp = new StringBuilder(inp);
            newInp.deleteCharAt(0);
            newInp.deleteCharAt(newInp.length()-1);
            String finalInp = newInp.toString();

            String[] det = finalInp.split(",",-2);
            if(studs.containsKey(Integer.parseInt(det[2]))){
                String insertedName = studs.get(Integer.parseInt(det[2]));
                if(insertedName.compareTo(det[0]) > 0){
                    studs.put(Integer.parseInt(det[2]),det[0]);
                    for(int i=0; i<details.size(); i++){
                        if(details.get(i).height == Integer.parseInt(det[2]))
                            details.get(i).name = det[0];
                    }
                }
            }
            else{
                studs.put(Integer.parseInt(det[2]),det[0]);
                Students newStud = new Students();
                newStud.name = det[0];
                newStud.rollNo = Integer.parseInt(det[1]);
                newStud.height = Integer.parseInt(det[2]);
                details.add(newStud);
            }

            n--;
        }

        System.out.println(studs.size());
        y = studs.size();
        for(int x : studs.keySet()){
            if(y == 1)
                break;
            System.out.print(studs.get(x) + ",");
            y--;
        }
        int lastIndex = studs.lastKey();
        System.out.print(studs.get(lastIndex));
    }

}
