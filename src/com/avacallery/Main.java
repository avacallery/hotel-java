package com.avacallery;

public class Main {

    public static void main(String[] args) {
	Hotel hotel = new Hotel(5);
	Console.showFloors(hotel.getFloors());
        System.out.println(hotel);
    }

}
