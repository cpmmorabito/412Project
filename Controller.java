public class Controller{
    private Model md;
    public Controller(Model model){
        this.md = model;
    }
    public void ticketSelection(int selection){
        if(selection == 1){
            md.addTicket(new Ticket("12:00","ride 1",30,1));
        }else if(selection == 2){
            md.addTicket(new Ticket("12:30","ride 2",30,2));
        }else if(selection == 3){
            md.addTicket(new Ticket("12:45","ride 3",30,3));
        }else{
            System.out.println("not a ticket");
        }
    }
}