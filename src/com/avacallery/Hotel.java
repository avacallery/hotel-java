package com.avacallery;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Floor> floors = new ArrayList<Floor>();

    public Hotel(int levels) {
        for (int floor = 0; floor < levels; floor++) {
            floors.add(new Floor(levels));
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }

}
