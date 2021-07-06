/*
    Author  : Yipeng Liu
    Project : Assignment 3
    Class   : OnetimeAppointment (Subclass of Appointment)
    Date    : 07/06/2021
 */
package edu.sjsu.assignment3;

import java.time.LocalDate;

public class OnetimeAppointment extends Appointment {
    /**
     * The constructor for OneTimeAppointment
     *
     * @param description
     *      {@code String}
     *
     * @param startDate
     *      {@code LocalDate}
     */
    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }
}
