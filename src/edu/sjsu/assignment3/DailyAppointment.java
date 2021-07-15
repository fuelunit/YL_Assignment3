/*
    Author  : Yipeng Liu
    Project : Assignment 3
    Class   : DailyAppointment (Subclass of Appointment)
    Date    : 07/06/2021
 */
package edu.sjsu.assignment3;

import java.time.LocalDate;

public class DailyAppointment extends Appointment{
    /**
     * The constructor for DailyAppointment
     *
     * @param description
     *      {@code String}
     *
     * @param startDate
     *      {@code LocalDate}
     *
     * @param endDate
     *      {@code LocalDate}
     */
    public DailyAppointment(String description, LocalDate startDate,
                            LocalDate endDate) {
        super(description, startDate, endDate);
    }

    @Override
    public boolean occursOn(LocalDate date) {
        return (date.compareTo(this.startDate) >= 0
                && date.compareTo(this.endDate) <= 0);
    }
}
