package com.sirma.academy;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private double cancellationFee;
    private String status;

    public Room(int roomNumber, RoomType roomType, double pricePerNight,String status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = pricePerNight * 0.1;
        this.status = status;
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

    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }
}
