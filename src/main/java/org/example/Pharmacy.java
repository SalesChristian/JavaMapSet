package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private final Map<String, Medication> medicationMap;

    public Pharmacy() {
        this.medicationMap = new HashMap<>();
    }

    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medicationMap.get(medicationName);
    }

    public void delete(String medicationName) {
        medicationMap.remove(medicationName);
    }

    public void printAllMedications() {
        for (Map.Entry<String, Medication> entry : medicationMap.entrySet()) {
            Medication medication = entry.getValue();
            System.out.println("Name: " + medication.getName() + ", Price: " + medication.getPrice() + ", Availability: " + medication.getAvailability());
        }
    }
}
