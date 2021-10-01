public class app {
    public static void main(String[] args) {
        Model md = new Model();
        Controller cntl = new Controller(md);
        View vw = new View(cntl);
        vw.TicketPrompt();
    }
}
