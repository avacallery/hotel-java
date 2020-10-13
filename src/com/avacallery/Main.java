package com.avacallery;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(100, "Deluxe", 2, true, false, "Ava Callery", 100, "King");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name under reservation: ");
        String input = scanner.nextLine();
        room.occupant = input;
        System.out.println(input + ":" + "\n" + room.roomInfo());
        System.out.println(room.occupant);
//
//	    Hotel hotel = new Hotel(5);
//	    Console.showFloors(hotel.getFloors());
//        System.out.println(hotel);
    }

}
