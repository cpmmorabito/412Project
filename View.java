import java.util.Scanner;

public class View {
    private Controller cntl;
    public View(Controller contr){
        this.cntl = contr;
    }
    public void TicketPrompt(){
        System.out.println("Which ticket do you want to buy:");
        System.out.println("Ticket 1: ride 1, 12:00, $30");
        System.out.println("Ticket 2: ride 2, 12:30, $30");
        System.out.println("Ticket 3: ride 3, 12:45, $30");
        Scanner input = new Scanner(System.in);
        int selection = Integer.parseInt(input.nextLine());
        this.cntl.ticketSelection(selection);
        input.close();
        
    }
}
