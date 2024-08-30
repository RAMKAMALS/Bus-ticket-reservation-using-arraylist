package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busno;
    Date date;

    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passenger Name: ");
        passengerName = sc.nextLine();
        System.out.println("Enter the Bus No: ");
        busno = sc.nextInt();
        System.out.println("Enter Date (dd/MM/yyyy): ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Ensure strict date parsing

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busno) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busno == busno && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
}
