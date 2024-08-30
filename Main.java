package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1, true, 2));          // seat is only two for checking..
        buses.add(new Bus(2, false, 40));
        buses.add(new Bus(3, true, 45));

        ArrayList<Booking> bookings = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int userOpt = 1;

        // Display bus information
        for (Bus b : buses) {
            b.displayBusInfo();
        }

        while (userOpt == 1) {
            System.out.println("Enter 1 to continue and 2 to exit:");
            userOpt = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed.");
                } else {
                    System.out.println("Sorry, no availability for the selected bus on the chosen date. Try another.");
                }
            }
        }

        sc.close();
    }
}
