package isp.lab5.exercise3;

public class Sensor {
    private String installLocation;
    private String name;
    public Sensor(String installLocation, String name)
    {
        this.installLocation = installLocation;
        this.name = name;
    }

    public void setInstallLocation(String installLocation) {this.installLocation = installLocation;}
    public String getInstallLocation() {return installLocation;}


    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public String toString() {
        return "Location of installation = " +installLocation+ ", name = " +name;
    }
}
