package isp.lab3.exercise3;
import java.util.Objects;
public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int count =0;


    public Vehicle(String model, String type, int speed, char fuelType)
    {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        count++;
    }

    public String getModel() { return model; }
    public void setModel(String model) {this.model = model;}

    public String getType() { return type; }
    public void setType(String type) {this.type = type;}

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) {this.speed = speed;}

    public char getFuelType() { return fuelType; }
    public void setFuelType(char fuelType) { this.fuelType = fuelType;}

    public static int getCount() {return count;}

    public String toString() { return model + " (" +type+ ") " +"speed "+speed+ " fuel type "+ fuelType; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && Objects.equals(model, vehicle.model) && Objects.equals(type, vehicle.type);
    }


    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'D' );
        Vehicle v2 = new Vehicle("Volkswagen", "Golf", 200, 'B' );



        v1.getModel();
        v1.setModel("Dacia");

        v2.getModel();
        v2.setModel("Volkswagen");

         v1.getType();
         v1.setType("Logan");

         v2.getType();
         v2.setType("Golf");

        v1.getSpeed();
        v1.setSpeed(150);

        v2.getSpeed();
        v2.setSpeed(200);

        v1.getFuelType();
        v1.setFuelType('D');

        v2.getFuelType();
        v2.setFuelType('B');

        System.out.println("There are " + Vehicle.getCount() + " cars");

        if(v1.equals(v2)){
            System.out.println("The 2 vehicles are equal!");
        }else{
            System.out.println("The 2 vehicles are not equal!");
        }

        System.out.println("Nr of vehicle objects created: " + count);
    }

    }


