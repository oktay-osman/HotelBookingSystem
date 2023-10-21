package com.models;

import com.constants.RoomProperties;
import com.models.enums.RoomStatus;
import com.models.enums.RoomType;

import java.io.Serializable;
import java.math.BigDecimal;

public class Room implements Serializable {
    private int roomNumber;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private BigDecimal pricePerNight;
    private BigDecimal cancellationFee;
    private Integer maxOccupancy;
    private String roomAmenities;

    public Room(int roomNumber, RoomType roomType,
                BigDecimal pricePerNight, BigDecimal cancellationFee) {
        this.roomNumber = roomNumber;
        setRoomType(roomType);
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        setRoomStatus(RoomStatus.AVAILABLE);
        setProperties();
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRoomAmenities() {
        return roomAmenities;
    }


    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setProperties() {
        if(this.roomType == RoomType.SINGLE) {
            this.maxOccupancy = RoomProperties.SINGLE_ROOM_MAX_OCCUPANCY;
            this.roomAmenities = RoomProperties.SINGLE_ROOM_AMENITIES;
        } else if (this.roomType == RoomType.DOUBLE) {
            this.maxOccupancy = RoomProperties.DOUBLE_OR_SUITE_ROOM_MAX_OCCUPANCY;
            this.roomAmenities = RoomProperties.DOUBLE_ROOM_AMENITIES;
        } else if(this.roomType == RoomType.SUITE) {
            this.maxOccupancy = RoomProperties.DOUBLE_OR_SUITE_ROOM_MAX_OCCUPANCY;
            this.roomAmenities = RoomProperties.SUITE_ROOM_AMENITIES;
        } else {
            this.maxOccupancy = RoomProperties.DELUXE_ROOM_MAX_OCCUPANCY;
            this.roomAmenities = RoomProperties.DELUXE_ROOM_AMENITIES;
        }
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
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

    public BigDecimal getPricePerNight () {
        return pricePerNight;
    }

    public void setPricePerNight (BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public BigDecimal getCancellationFee () {
        return cancellationFee;
    }

    public void setCancellationFee (BigDecimal cancellationFee) {
        this.cancellationFee = cancellationFee;
    }
}
