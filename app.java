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
        Ride tilt = new Ride(false, "Tilt-a-Whirl", 15, true, "The Tilt-a-whirl is a classic carnival ride.");
        Ride coaster = new Ride(false, "Lightning Bolt", 55, true, "The Lightning bolt is an inversion coaster.");
        Ride ferris = new Ride(false, "Ferris Wheel", 0, false, "The Ferris Wheel is a token attraction.");
        Ride parade = new Ride(true, "Afternoon Parade", 0, false, "The Afternoon Parade occurs daily at 1 PM.");
        RideViewController tester = new RideViewController(tilt);
        tester.addRide(coaster);
        tester.addRide(ferris);
        tester.addRide(parade);
        RideView view = new RideView(tester);
        
        view.displayWaitTime(tilt.getRideName());
        view.displayWaitTime(coaster.getRideName());
        view.displayWaitTime(ferris.getRideName());
        view.displayWaitTime("Not a real ride");
        view.displayWaitTime(parade.getRideName());
    }
}
