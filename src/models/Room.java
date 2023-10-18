package models;

import com.sirma.academy.RoomType;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomNumber;
    //make roomType an object of RoomType ?
    private RoomType roomType;
    private double pricePerNight;
    private double cancellationFee;

    public enum Status{
        BOOKED,
        AVAILABLE
    }

    public Room(int roomNumber, RoomType roomType,
                double pricePerNight, Status status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = pricePerNight * 0.25;
    }

    public int getRoomNumber () {
        return roomNumber;
    }

    public void setRoomNumber (int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType () {
        return roomType;
    }

    public void setRoomType (RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight () {
        return pricePerNight;
    }

    public void setPricePerNight (double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getCancellationFee () {
        return cancellationFee;
    }

    public void setCancellationFee (double cancellationFee) {
        this.cancellationFee = cancellationFee;
    }
}
