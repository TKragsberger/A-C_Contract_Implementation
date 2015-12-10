package Domain;

import DataLayer.DBFacade;
import DataLayer.Validater;
import Entity.Booking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Control {
    private Validater validater = new Validater();
    private DBFacade dBFacade = new DBFacade();
    
    public Date getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return date;
    }
    
    public boolean createBooking(int hotelId, int roomId, int guestId, Date periodStart, Date periodEnd){
        Booking newBooking = new Booking(hotelId, guestId, roomId, periodStart, periodEnd, getCurrentDate());
        return dBFacade.createNewBooking(newBooking);
    }
    
    public Booking viewBooking(int passportNumber){
        return null;
    }
}
