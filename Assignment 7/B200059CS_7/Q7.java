import java.text.DecimalFormat;
import java.util.*;

interface TaxCalculatable{
    double calculateTax(Car c);
}

class Vehicle implements TaxCalculatable{
    String modelNumber;
    double rateBought;
    String fuelType;
    int numberOfWheels;

    public double calculateTax(Car c){
        double ret = 0;
        if(c.fuelType.equalsIgnoreCase("petrol")){
            ret = (double)(c.rateBought*0.1*c.numberOfPassengers*0.5);
        }
        else if(c.fuelType.equalsIgnoreCase("diesel")){
            ret = (double)(c.rateBought*0.1*c.numberOfPassengers*0.4);
        }
        return ret;
    }

    public double calculateTax(Truck t){
        double ret = 0;
        if(t.fuelType.equalsIgnoreCase("petrol")){
            ret = (double)(t.rateBought*0.1*t.loadLimit*0.002*0.5);
        }
        else if(t.fuelType.equalsIgnoreCase("diesel")){
            ret = (double)(t.rateBought*0.1*t.loadLimit*0.002*0.4);
        }
        return ret;
    }

}

class Car extends Vehicle{
    int numberOfPassengers;

    public double calculateTax(){
        double ret = 0;
        if(this.fuelType.equalsIgnoreCase("petrol")){
            ret = (double)(this.rateBought*0.1*this.numberOfPassengers*0.5);
        }
        else if(this.fuelType.equalsIgnoreCase("diesel")){
            ret = (double)(this.rateBought*0.1*this.numberOfPassengers*0.4);
        }
        return ret;
    }

}

class Truck extends Vehicle{
    int loadLimit;

    public double calculateTax(){
        double ret = 0;
        if(this.fuelType.equalsIgnoreCase("petrol")){
            ret = (double)(this.rateBought*0.1*this.loadLimit*0.002*0.5);
        }
        else if(this.fuelType.equalsIgnoreCase("diesel")){
            ret = (double)(this.rateBought*0.1*this.loadLimit*0.002*0.4);
        }
        return ret;
    }

}

public class Q7 {

    public static void main(String[] args){
        Scanner line = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("##.##");
        //ArrayList<Vehicle> vehicles = new ArrayList<>();
        TreeMap<Double,Vehicle> vehicles = new TreeMap<>();
        String inp = "";
        String chc = "";

        System.out.println("1. Add Vehicle");
        System.out.println("2. Display Vehicles");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        inp = line.nextLine().trim();

        while(!inp.equals("3")){

            if(inp.equals("1")){
                System.out.println("a. Car");
                System.out.println("b. Truck");
                System.out.print("Enter your choice: ");
                chc = line.nextLine().trim();
                if(chc.equals("a")){
                    Car c = new Car();
                    System.out.print("ModelNumber: ");
                    c.modelNumber = line.nextLine().trim();
                    System.out.print("Rate: ");
                    c.rateBought = Double.parseDouble(line.nextLine().trim());
                    System.out.print("FuelType(Petrol/Diesel): ");
                    c.fuelType = line.nextLine().trim();
                    System.out.print("Passengers: ");
                    c.numberOfPassengers = Integer.parseInt(line.nextLine().trim());
                    c.numberOfWheels = 4;
                    vehicles.put(-1*Double.valueOf(d.format(c.calculateTax())),c);
                }
                else if(chc.equals("b")){
                    Truck t = new Truck();
                    System.out.print("ModelNumber: ");
                    t.modelNumber = line.nextLine().trim();
                    System.out.print("Rate: ");
                    t.rateBought = Double.parseDouble(line.nextLine().trim());
                    System.out.print("FuelType(petrol,diesel): ");
                    t.fuelType = line.nextLine().trim();
                    System.out.print("LoadLimit: ");
                    t.loadLimit = Integer.parseInt(line.nextLine().trim());
                    t.numberOfWheels = 6;
                    vehicles.put(-1*Double.valueOf(d.format(t.calculateTax())),t);
                }
            }

            else if(inp.equals("2")){
                for(Double x : vehicles.keySet()){
                    System.out.println(vehicles.get(x).modelNumber + " " + vehicles.get(x).fuelType + " " + d.format(-1*x));
                }
            }

            System.out.println();

            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicles");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            inp = line.nextLine().trim();

        }
    }
}
