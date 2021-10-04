/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author cjm6757
 */
public class app {
    public static void main(String[] args) {
        Ride test = new Ride(false, "Test", 15, true, "This is just a test.");
        RideViewController tester = new RideViewController(test);
        RideView view = new RideView(tester);
        
        view.displayWaitTime();
    }
}
