import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

interface ShapeArea{
    double area();
}

class Circle implements ShapeArea{
    double val;
    Circle(double x){
        this.val = x;
    }
    public double area(){
        return (double)(3.14*this.val*this.val);
    }
}

class Square implements ShapeArea{
    double val;
    Square(double x){
        this.val = x;
    }

    public double area(){
        return (double)(this.val*this.val);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        String shape = line.nextLine().trim();
        DecimalFormat d = new DecimalFormat("##.##");
        if (shape.equalsIgnoreCase("Circle")) {
            Circle c = new Circle(Double.parseDouble(line.nextLine().trim()));
            System.out.println(d.format(c.area()));
        }
        else if(shape.equalsIgnoreCase("Square")){
            Square s= new Square(Double.parseDouble(line.nextLine().trim()));
            System.out.println(d.format(s.area()));
    }

    }
}
