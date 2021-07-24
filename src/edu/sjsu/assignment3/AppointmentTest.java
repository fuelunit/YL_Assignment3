/*
    Author  : Yipeng Liu
    Project : Assignment 3
    Class   : AppointmentTest
    Date    : 07/15/2021
 */
package edu.sjsu.assignment3;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Arrays;

public class AppointmentTest {
    // startDate and endDate
    private LocalDate startDate = LocalDate.parse("2021-06-01");
    private LocalDate endDate = LocalDate.parse("2021-08-05");
    // test dates
    private LocalDate testDate1 = LocalDate.parse("2021-06-05");
    private LocalDate testDate2 = LocalDate.parse("2021-07-01");
    private LocalDate testDate3 = LocalDate.parse("2021-08-15");

    /**
     * Testing occursOn method
     */
    @Test
    public void occursOnTest() {
        // Example 1
        Appointment appointment1 = new OnetimeAppointment("Class starts",
                startDate);
        // Assert
        Assert.assertFalse(appointment1.occursOn(testDate1));
        Assert.assertFalse(appointment1.occursOn(testDate2));
        Assert.assertFalse(appointment1.occursOn(testDate3));
        // Example 2
        Appointment appointment2 = new DailyAppointment("Class",
                startDate, endDate);
        // Assert
        Assert.assertTrue(appointment2.occursOn(testDate1));
        Assert.assertTrue(appointment2.occursOn(testDate2));
        Assert.assertFalse(appointment2.occursOn(testDate3));

        // Example 3
        Appointment appointment3 = new MonthlyAppointment("Meeting",
                startDate, endDate);
        // Assert
        Assert.assertFalse(appointment3.occursOn(testDate1));
        Assert.assertTrue(appointment3.occursOn(testDate2));
        Assert.assertFalse(appointment3.occursOn(testDate3));
    }

    /**
     * Testing compareTo method
     */
    @Test
    public void compareToTest() {
        Appointment appointment1 = new OnetimeAppointment("Class starts",
                startDate);
        Appointment appointment2 = new DailyAppointment("Class",
                startDate, endDate);
        Appointment appointment3 = new MonthlyAppointment("Meeting",
                startDate, endDate);
        // Assert
        Assert.assertEquals(-2,  appointment1.compareTo(appointment2));
        Assert.assertEquals(-2,  appointment1.compareTo(appointment3));
        Assert.assertEquals(2,   appointment2.compareTo(appointment1));
        Assert.assertEquals(-10, appointment2.compareTo(appointment3));
        Assert.assertEquals(2,   appointment3.compareTo(appointment1));
        Assert.assertEquals(10,  appointment3.compareTo(appointment2));
        //Appointment[] myArr = {};
        //Arrays.sort();
    }
}