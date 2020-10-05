package com.avacallery;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Hotel hotel = new Hotel(5);
	hotel.showFloors(hotel.getFloors());
        System.out.println(hotel);
    }
}
