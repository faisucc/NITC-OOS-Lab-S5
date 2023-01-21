import java.util.Scanner;

class Room{
    int length;
    int breadth;

    public int perimeter(){
        return (2*(this.length+this.breadth));
    }

    public int area(){
        return this.length*this.breadth;
    }
}

public class Q1 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Enter the length: ");
        String l = line.nextLine().trim();
        System.out.print("Enter the breadth: ");
        String b = line.nextLine().trim();
        Room r = new Room();
        r.length = Integer.parseInt(l);
        r.breadth = Integer.parseInt(b);
        System.out.println("Area of Room: " + r.area());
        System.out.println("Perimeter of Room: " + r.perimeter());
    }
}
