package org.unibl.etf.vehicles;

import java.time.LocalDate;

/**
 * Car
 */
public class Car extends Vehicle {
    protected String description;
    protected LocalDate purchase_date;


    public String getDescription() {
        return description;
    }

    public LocalDate getPurchaseDate() {
        return purchase_date;
    }
}
