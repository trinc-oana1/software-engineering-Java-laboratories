package isp.lab11;

import java.util.ArrayList;
import java.util.List;

public class ATC {

    List<Aircraft> aircraftList = new ArrayList<>();
    public void addAircraft(String id){

        Aircraft aircraft = new Aircraft(id);
        aircraftList.add(aircraft);
        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        aircraftList.forEach((a) ->{


            if(a.id.equals(id)){
                a.reciveAtcCommand(command);
                synchronized (a) {
                    a.notify();
                }
            }
        });
        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){

        System.out.println("Display aircrfats.");
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft.getId());
        }
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    public AtcCommand() {

    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}

class TakeoffCommand extends AtcCommand{

    public int altitude;
    public TakeoffCommand(int altitude){
        super();
        this.altitude=altitude;
    }
}
class LandCommand extends AtcCommand{

    public LandCommand(String command) {
        super(command);
    }
}