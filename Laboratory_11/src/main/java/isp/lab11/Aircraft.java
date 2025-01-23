package isp.lab11;

public class Aircraft implements Runnable {

    private int altitude;
    public String id;
    public Aircraft(String id){

        this.id=id;
    }

    public void reciveAtcCommand(AtcCommand cmd){

        if(cmd instanceof TakeoffCommand){
            this.altitude= ((TakeoffCommand) cmd).altitude;

        }

        else if( cmd instanceof LandCommand){

        }


    }
    public void run(){
        System.out.println("On stand");

        // wait for TAKEOF_CMD
        synchronized (this){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        System.out.println("taxing");
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){}
        System.out.println("Taking off");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
        System.out.println("ascending");

        int currentAltitude = 0;
        while(currentAltitude<altitude)
        {

            currentAltitude += 1000;

            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){}

        }


        System.out.println("cruising");

        //waiting for LAND_CMD
        System.out.println("descending");
        while(currentAltitude >0)
        {
            currentAltitude -=1000;

            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){}
        }
        System.out.println("Landed");
    }

    public String getId() {
        return id;
    }
}