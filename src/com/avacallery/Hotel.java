package com.avacallery;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Floor> floors = new ArrayList<Floor>();

    public Hotel(int levels) {
        for (int floor = 0; floor < levels; floor++) {
            floors.add(new Floor(5));
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void showFloors(List<Floor> floors) {
        for (var floor : floors) {
            System.out.println(floor.getLevel() + " ");
        }
        System.out.println("\n");
    }



}
