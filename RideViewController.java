/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author cjm6757
 */
public class RideViewController {
    
    private Ride ride;

    public RideViewController(Ride ride) {
        this.ride = ride;
    }
    
    public int getRideWait(String rideName){
        if(ride.getIsWait()){
            return ride.getWaitTime();
        } else {
            return 0;
        }
    }
    
    //This is just to facilitate basic function
    //It will be more complex, however more development is needed to know what must be added
    
}
