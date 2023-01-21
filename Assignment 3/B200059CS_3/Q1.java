import java.util.Scanner;

class LL {
    Node head;
    static class Node{
        char data;
        Node next;
        Node(char x){
            data = x;
            next = null;
        }
    }

    public LL insertNode(LL L, char x){
        Node temp = new Node(x);

        if(L.head == null){
            L.head = temp;
            return L;
        }

        Node current = L.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = temp;
        return L;
    }

    public void printList(LL L){
        Node temp = L.head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

}

class ReverseMain extends LL{
    public LL reverseList(LL L){
        Node prev = null;
        Node head = L.head;
        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        L.head = prev;
        return L;
    }
}

public class Q1 {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int numberOfNodes = num.nextInt();
        int counter = numberOfNodes;
        int i = 1;
        char data;
        LL L = new LL();


        while(true){
            if(counter == 0)
                break;
            System.out.print("Enter the data in Node" + (i) + " : ");
            i++;
            data = line.next().charAt(0);
            L = L.insertNode(L,data);
            counter--;
        }
        ReverseMain newList = new ReverseMain();
        newList.reverseList(L);
        L.printList(L);
    }

}
