package com.avacallery;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    int number;
    String type;
    int floor;
    boolean isOccupied;
    boolean needsCleaning;
    String occupant;
    int price;
    String bed;

    public Room(
            int number,
            String type,
            int floor,
            boolean isOccupied,
            boolean needsCleaning,
            String occupant,
            int price,
            String bed) {

        this.number = number;
        this.type = type;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.needsCleaning = needsCleaning;
        this.occupant = occupant;
        this.price = price;
        this.bed = bed;
    }

    static public void reserveRoom(boolean isOccupied, String occupant, boolean needsCleaning) {
        if (isOccupied = true) {
            System.out.println(occupant + "has reserved this room.");
        }
    }

    public String roomInfo() {
        return "Your room number: " + number + "\n" +
                "Your room type: " + type + "\n" +
                "Your floor number: " + floor + "\n" +
                "Name under reservation: " + occupant  + "\n" +
                "Price: " + price + "\n" +
                "Bed size: " + bed;
    };

}
