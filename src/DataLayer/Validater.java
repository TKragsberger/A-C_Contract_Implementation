/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import Entity.Booking;

/**
 *
 * @author Thomas
 */
public class Validater {
    public boolean validateHotel(int hotelId){
        return true;
    }
    
    public boolean validateRoom(int hotelId, int roomId){
        return true;
    }
    
    public boolean validateGuest(int guestId){
        return true;
    }
    
    public boolean validateNewBooking(Booking booking){
        return true;
    }
}
