/*
    Author  : Yipeng Liu
    Project : Assignment 3
    Class   : Main
    Date    : 07/06/2021
 */
package edu.sjsu.assignment3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Part 2 Tests:
        System.out.println("=== Assignment 3 Part 2 Tests ===");
        // startDate and endDate
        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-05");
        // test dates
        LocalDate testDate1 = LocalDate.parse("2021-06-05");
        LocalDate testDate2 = LocalDate.parse("2021-07-01");
        LocalDate testDate3 = LocalDate.parse("2021-08-15");
        // Example 1
        System.out.println("--- Example 1 ---");
        Appointment appointment1 = new OnetimeAppointment("Class starts",
                startDate);
        System.out.println("Test Date 1 is "
                + appointment1.occursOn(testDate1)); // false
        System.out.println("Test Date 2 is "
                + appointment1.occursOn(testDate2)); // false
        System.out.println("Test Date 3 is "
                + appointment1.occursOn(testDate3)); // false
        // Example 2
        System.out.println("--- Example 2 ---");
        Appointment appointment2 = new DailyAppointment("Class",
                startDate, endDate);
        System.out.println("Test Date 1 is "
                + appointment2.occursOn(testDate1)); // true
        System.out.println("Test Date 2 is "
                + appointment2.occursOn(testDate2)); // true
        System.out.println("Test Date 3 is "
                + appointment2.occursOn(testDate3)); // false (after the end date)
        // Example 3
        System.out.println("--- Example 3 ---");
        Appointment appointment3 = new MonthlyAppointment("Meeting",
                startDate, endDate);
        System.out.println("Test Date 1 is "
                + appointment3.occursOn(testDate1)); // false (day of month not same)
        System.out.println("Test Date 2 is "
                + appointment3.occursOn(testDate2)); // true
        System.out.println("Test Date 3 is "
                + appointment3.occursOn(testDate3)); // false (after the end date)
        // Part 3 Tests:
        System.out.println("=== Assignment 3 Part 3 Tests ===");
        System.out.println("appointment1 compared to appointment 2: "
                + appointment1.compareTo(appointment2));
        // Part 4 Tests:
        System.out.println("=== Assignment 3 Part 4 Tests ===");

    }
}
