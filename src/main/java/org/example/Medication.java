package org.example;

public class Medication {
    private final String name;
    private final double price;
    private final boolean availability;

    public Medication(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public final String getName() {
        return name;
    }

    public final double getPrice() {
        return price;
    }

    public final boolean getAvailability() {
        return availability;
    }
}
