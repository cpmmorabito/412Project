public class Ticket {
    private String time;
    private String ride;
    private int price;
    private int ID;

    public Ticket(String time, String ride, int price, int ID){
        this.time = time;
        this.ride = ride;
        this.price = price;
        this.ID = ID;
    }

    public int getTicketPrice(){
        return this.price;
    }
    public int getTicketID(){
        return this.ID;
    }
    public String getTicketRide(){
        return this.ride;
    }
    public String getTicketTime(){
        return this.time;
    }
}
