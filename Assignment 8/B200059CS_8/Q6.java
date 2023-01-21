import java.util.ArrayList;
import java.util.Scanner;

class Queue{
    int front;
    int rear;
    ArrayList<Integer> q;

    public void enqueue(int x){
        this.q.add(x);
        this.rear++;
        System.out.println("Success");
    }

    public int dequeue(){
        if(this.front == this.rear + 1){
            //System.out.println("EmptyQueue");
            return -1;
        }

        System.out.println(this.q.get(front));
        this.front++;

        return 0;
    }
}

public class Q6 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        int ret = 0;
        Queue q = new Queue();
        q.front = 0;
        q.rear = -1;
        q.q = new ArrayList<>();
        while(ret != -1){
            String[] inp = line.nextLine().trim().split(" ", -2);
            if(inp[0].equals("E")){
                q.enqueue(Integer.parseInt(inp[1]));
            }
            else if(inp[0].equals("D")){
                ret = q.dequeue();
                if(ret == -1){
                    System.out.println("EmptyQueue");
                    break;
                }
            }
        }
    }
}
