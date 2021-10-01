import java.util.ArrayList;
import java.util.Arrays;

public class Model {
    private ArrayList<Ticket> arr;
    private ArrayList<String> rides;
    public Model(){
        this.arr = new ArrayList<Ticket>();
        this.rides = new ArrayList<>(Arrays.asList("ride 1","ride 2","ride 3"));

    }
    public void addTicket(Ticket ticket){
        arr.add(ticket);
    }
    public ArrayList<String> getRides(){
        return this.rides;
    }
}
