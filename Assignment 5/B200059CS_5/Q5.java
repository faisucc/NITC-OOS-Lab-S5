import java.util.Scanner;

class Car{
    String modelName;
    String engineNo;
    int basePrice;
    int additionalPrice;

    public void addDetails(String name, String engno, int bp, int aP){
        this.modelName = name;
        this.engineNo = engno;
        this.basePrice = bp;
        this.additionalPrice = aP;
    }

    public int totalPrice(){
        return (this.basePrice + this.additionalPrice);
    }
}

class Dealer{
    String dealerName;
    float discountPercentage;
    Car car;

    public float onRoadPrice(){
        float finalPrice = 0;
        finalPrice = this.car.totalPrice() - ((this.discountPercentage/100)*this.car.totalPrice());
        return finalPrice;
    }
}

public class Q5 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        String inp = line.nextLine().trim();
        int N = Integer.parseInt(inp);
        while(true){
            if(N==0)
                break;
            inp = line.nextLine().trim();
            String[] det = inp.split(" ",-2);
            Car car = new Car();
            car.addDetails(det[0],det[1],Integer.parseInt(det[2]),Integer.parseInt(det[3]));
            Dealer deal = new Dealer();
            deal.car = car;
            deal.dealerName = det[4];
            deal.discountPercentage = Float.parseFloat(det[5]);

            System.out.println(car.modelName + " " + car.totalPrice() + " " + deal.onRoadPrice());


            N--;
        }
    }

}
