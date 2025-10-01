package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MovieReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Full name: ");
        String fullname = scanner.nextLine();

        System.out.println("Date of show(MM/dd/yyyy): ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateAsString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateAsString, formatter);

        System.out.println("Number of Ticket(s): ");
        int ticketamount = scanner.nextInt();

        System.out.printf("""
                Name: %s
                Date: %s
                Number of Ticket(s): %d
                
                
                """, fullname,date,ticketamount);

        System.out.printf("""
                %d ticket(s) reserved for %s under %s
                """,ticketamount,date,fullname);
    }
}
