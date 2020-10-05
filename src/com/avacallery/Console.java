package com.avacallery;

import java.util.List;

public class Console {
    static public void showFloors(List<Floor> floors) {
        for (var floor : floors) {
            System.out.println(floor.getLevel());
        }
        System.out.println("\n");
    }
}
