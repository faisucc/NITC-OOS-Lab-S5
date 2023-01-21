import java.lang.reflect.Array;
import java.util.*;

interface SortVotes{
    void ascendDisplay(HashMap<String,Integer> details);
    void descendDisplay(HashMap<String,Integer> details);
}

class ElectionPost implements SortVotes{
    String nameOfThePost;
    ArrayList<String> listOfCandidates;
    ArrayList<String> votesEntered;

    Comparator<String> cmpName = new Comparator<>() {
        @Override
        public int compare(String o1, String o2) {
            return (o1.compareTo(o2));
        }
    };

    public void display(){
        System.out.println(nameOfThePost);
        for(String x : listOfCandidates){
            System.out.println(x);
        }
    }

    public int compareAscend(String o1, String o2, HashMap<String,Integer> details){
        return details.get(o1).compareTo(details.get(o2));
    }


    public void ascendDisplay(HashMap<String,Integer> details){
        //LinkedHashMap<String,Integer> sortedDetails = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : details.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for(Integer x : list){
            for(Map.Entry<String,Integer> entry : details.entrySet()){
                if(entry.getValue() == x){
                    //sortedDetails.put(entry.getKey(),x);
                    System.out.println(entry.getKey() + " - " + x);
                }
            }
        }

        //System.out.println(sortedDetails);
    }

    public void descendDisplay(HashMap<String,Integer> details){
        //LinkedHashMap<String,Integer> sortedDetails = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : details.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(Integer x : list){
            for(Map.Entry<String,Integer> entry : details.entrySet()){
                if(entry.getValue() == x){
                    //sortedDetails.put(entry.getKey(),x);
                    System.out.println(entry.getKey() + " - " + x);
                }
            }
        }

        //System.out.println(sortedDetails);
    }


}
public class Q4 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        ElectionPost e = new ElectionPost();
        e.nameOfThePost = line.nextLine().trim();
        int N = Integer.parseInt(line.nextLine().trim());
        ArrayList<String> candidates = new ArrayList<>();
        ArrayList<String> voters = new ArrayList<>();
        HashMap<String,Integer> details = new HashMap<>();
        while(N > 0){
            String name = line.nextLine().trim();
            candidates.add(name);
            N--;
        }
        e.listOfCandidates = candidates;
        int x;
        int M = Integer.parseInt(line.nextLine().trim());
        while(M > 0){
            String voted = line.nextLine().trim();
            voters.add(voted);
            try{
                x = details.get(voted);
            } catch (NullPointerException exp){
                x = 0;
            }
            x++;
            details.put(voted,x);
            M--;
        }
        e.votesEntered = voters;
        System.out.println(e.nameOfThePost);
        for(String y : e.listOfCandidates){
            System.out.println(y);
        }

        e.ascendDisplay(details);
        e.descendDisplay(details);
    }
}
