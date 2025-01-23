package isp.lab6.exercise2;
import java.util.Objects;
public class Vehicle {

        // Instance variables
        private String vin;
        private String licensePlate;
        private String make;
        private String model;
        private int year;

        // Constructor
        public Vehicle(String vin, String licensePlate, String make, String model, int year) {
            this.vin = vin;
            this.licensePlate = licensePlate;
            this.make = make;
            this.model = model;
            this.year = year;
        }



    // Getters and setters

    public String getVin() {return vin;}
    public void setVin(String vin) {this.vin = vin;}



    public String getLicensePlate() {return licensePlate;}
    public void setLicensePlate(String licensePlate) {this.licensePlate = licensePlate;}



    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}



    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}



    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}


    // equals method to compare two Account objects


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vehicle vehicle = (Vehicle) o;
            return Objects.equals(vin, vehicle.vin);
        }

        @Override
        public int hashCode() {
            return Objects.hash(vin);
        }

        // toString method to display the Account object as a string
        @Override
        public String toString() {
            return "Vehicle Identification Number: " + vin + "\n" +
                    "License plate: " + licensePlate + "\n" +
                    "Make: " + make + "\n" +
                    "Model: " +model + "\n" +
                    "Year: " +year + "\n";
        }
}

