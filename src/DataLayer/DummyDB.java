/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import Entity.Booking;
import Entity.Guest;
import Entity.Hotel;
import Entity.Room;
import java.util.Collection;

/**
 *
 * @author Thomas
 */
public class DummyDB {
    private Validater validate = new Validater();
    public boolean createNewBooking(Booking booking){
        if(validate.validateNewBooking(booking)){
            
            return true;
        }
        else 
            return false;
        
    }
    
    public Collection<Hotel> getAllHotels(){
        return null;
    }
    
    public Collection<Room> getHotelRooms(int hotelId){
        return null;
    }
    
    public Guest getGuestDetails(int guestId){
        return null;
    }
    
    public Collection<Booking> getHotelBookings(int hotelId){
        return null;
    }
}
