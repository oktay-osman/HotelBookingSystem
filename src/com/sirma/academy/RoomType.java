package com.sirma.academy;

public class RoomType {
    private String type;
    private String[] amenities;
    private int maxOccupancy;

    public RoomType (String type) {
        this.type = type;
        if(this.type.equals("Deluxe")) {
            this.amenities = new String[]{"Air conditioning", "TV", "Sea view", "Balcony", "Hair dryer", "Mini fridge"};
            this.maxOccupancy = 3;
        } else if (this.type.equals("Suite")) {
            this.amenities = new String[]{"Air conditioning", "TV", "Hair dryer","Terrace"};
            this.maxOccupancy = 2;
        } else if (this.type.equals("Single")) {
            this.amenities = new String[]{"TV", "Blowing fan"};
            this.maxOccupancy = 1;
        }
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String[] getAmenities () {
        return amenities;
    }

    public void setAmenities (String[] amenities) {
        this.amenities = amenities;
    }

    public int getMaxOccupancy () {
        return maxOccupancy;
    }

    public void setMaxOccupancy (int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
