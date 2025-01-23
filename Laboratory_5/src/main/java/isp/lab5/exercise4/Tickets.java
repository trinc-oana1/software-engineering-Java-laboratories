package isp.lab5.exercise4;

public enum Tickets {
    MOVIE(1,"Cinema city ticket for any movie",35),
    CONCERT(2,"Lady Gaga Concert",300),
    STANDUP(3,"Bordea Comedy Show",150),
    SPORT(4,"Fotball game UCluj-Steaua",200);

    private String displayName;
    private int price;
    private int id;

    Tickets(int id,String displayName, int price){
        this.id = id;
        this.displayName = displayName;
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString() {
        return this.displayName + ", price:" + this.price;
    }
}
