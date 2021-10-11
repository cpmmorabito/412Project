/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author cjm6757
 */
public class RideViewController {
    
    private Ride ride;
    private ArrayList<Ride> rideList = new ArrayList<>();

    public RideViewController(Ride ride) {
        this.ride = ride;
        rideList.add(ride);
    }
    
    public void addRide(Ride ride){
        rideList.add(ride);
    }
    
    public int getRideWait(String rideName){
        if(doesRideExist(rideName)){
            this.ride = rideList.get(getRide(rideName));
            if(!ride.getIsShowType()){
                if(ride.getIsWait()){
                return ride.getWaitTime();
                } else {
                    return 0;
                }
            } else {
                return -2;
            }
        } else {
            return -1; 
        }
    }
    
    public boolean doesRideExist(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
    public int getRide(String name){
        for(int i = 0; i < rideList.size(); i++){
            if(rideList.get(i).getRideName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    
    //This is just to facilitate basic function
    //It will be more complex, however more development is needed to know what must be added
    
}
