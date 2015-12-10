package Entity;

import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Hotel {
    private int hotelId;
    private String hotelName;
    private String address;
    private String city;
    private double distanceToCity;
    private int rating;
    private Collection<Room> rooms;
    private Collection<Room> acailableRooms;
    private Collection<Booking> bookings;

    public Hotel(int hotelId, String hotelName, String address, String city, double distanceToCity, int rating, Collection<Room> rooms, Collection<Room> acailableRooms, Collection<Booking> bookings) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.city = city;
        this.distanceToCity = distanceToCity;
        this.rating = rating;
        this.rooms = rooms;
        this.acailableRooms = acailableRooms;
        this.bookings = bookings;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getDistanceToCity() {
        return distanceToCity;
    }

    public void setDistanceToCity(double distanceToCity) {
        this.distanceToCity = distanceToCity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        this.rooms = rooms;
    }

    public Collection<Room> getAcailableRooms() {
        return acailableRooms;
    }

    public void setAcailableRooms(Collection<Room> acailableRooms) {
        this.acailableRooms = acailableRooms;
    }

    public Collection<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Collection<Booking> bookings) {
        this.bookings = bookings;
    }
    
    
    
}
