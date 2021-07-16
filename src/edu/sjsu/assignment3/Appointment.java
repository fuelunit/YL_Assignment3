/*
    Author  : Yipeng Liu
    Project : Assignment 3
    Class   : Appointment (Superclass)
    Date    : 07/06/2021
 */
package edu.sjsu.assignment3;

import java.time.LocalDate;

public class Appointment implements Comparable<Appointment> {
    protected String description;
    protected LocalDate startDate;
    protected LocalDate endDate;

    /**
     * The constructor for Appointment
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
    public Appointment(String description, LocalDate startDate,
                       LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Gets the description
     * @return A {@code String} description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the startDate
     * @return A {@code LocalDate}
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * Gets the endDate
     * @return A {@code LocalDate}
     */
    public LocalDate getEndDate() {
        return this.endDate;
    }

    /**
     * An appointment object can check if it occurs on a date
     * using occursOn method. The detailed algorithm depends
     * on the type of appointment.
     *
     * @param date
     *      {@code LocalDate}
     *
     * @return boolean
     */
    public boolean occursOn(LocalDate date) {
        return (date.compareTo(this.startDate) >= 0
                && date.compareTo(this.endDate) <= 0);
    }

    @Override
    public int compareTo(Appointment o) {
        if (!this.startDate.equals(o.getStartDate())) {
            return this.startDate.compareTo(o.getStartDate());
        } else if (!this.endDate.equals(o.getEndDate())) {
            return this.endDate.compareTo(o.getEndDate());
        } else {
            return this.description.compareTo(o.getDescription());
        }
    }
}
