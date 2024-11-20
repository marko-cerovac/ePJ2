package org.unibl.etf.vehicles;

import java.time.LocalDateTime;

/**
 * Brakedown
 */
public class Brakedown {

    LocalDateTime time;
    String description;

    public Brakedown(LocalDateTime time, String description) {
        this.time = time;
        this.description = description;
    }

    public String description() {
        return description;
    }

    public LocalDateTime when() {
        return time;
    }
}
