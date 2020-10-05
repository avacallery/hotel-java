package com.avacallery;

public class Room {
    int number;
    String type;
    int floor;
    boolean isOccupied;
    boolean needsCleaning;
    String occupant;
    int price;

    public Room(
            int number,
            String type,
            int floor,
            boolean isOccupied,
            boolean needsCleaning,
            String occupant,
            int price) {

        this.number = number;
        this.type = type;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.needsCleaning = needsCleaning;
        this.occupant = occupant;
        this.price = price;
    }

    public boolean reserveRoom(boolean isOccupied, String occupant, boolean needsCleaning) {
        if (isOccupied = true) {
            System.out.println(occupant + "has reserved this room.");
        }
        return false;
    }
}
