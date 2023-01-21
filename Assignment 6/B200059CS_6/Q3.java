import org.w3c.dom.css.Rect;

import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }

    public int Area(){
        return (this.length*this.breadth);
    }

    public int Perimeter(){
        return(2*(this.length+this.breadth));
    }
}

class Square extends Rectangle{

    Square(int x) {
        super(x, x);
    }
}

public class Q3 {
    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        String[] det = inp.split(" ", -2);
        if(det.length == 1){
            Square s = new Square(Integer.parseInt(det[0]));
            System.out.println("Square Perimeter " + s.Perimeter());
            System.out.println("Square Area " + s.Area());
        }
        else{
            Rectangle r = new Rectangle(Integer.parseInt(det[0]),Integer.parseInt(det[1]));
            System.out.println("Rectangle Perimeter " + r.Perimeter());
            System.out.println("Rectangle Area " + r.Area());
        }
    }
}
