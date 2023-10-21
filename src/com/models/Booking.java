package com.models;

import java.time.LocalDateTime;

public class Booking {
    public User user;
    public Room room;
    public LocalDateTime startDate;
    public LocalDateTime endDate;

    public Booking(User user, Room room, LocalDateTime startDate, LocalDateTime endDate) {
        this.user = user;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public User getUser() {
        return this.user;
    }

    public Room getRoom() {
        return this.room;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
