package org.example;

public class Main {
    public static void main(String[] args) {
        Medication med1 = new Medication("Chiemseer", 2.5, true);
        Medication med2 = new Medication("Tegernseer", 3.0, true);
        Medication med3 = new Medication("Moosner Liesl", 2.8, false);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);

        System.out.println("Count of medications: " + pharmacy.getCount());
        System.out.println("All medications:");
        pharmacy.printAllMedications();

        String medicationNameToFind = "Tegernseer";
        Medication foundMedication = pharmacy.find(medicationNameToFind);
        if (foundMedication != null) {
            System.out.println("\nFound medication: " + foundMedication.getName());
        } else {
            System.out.println("\nMedication not found.");
        }

        String medicationNameToDelete = "Moosner Liesl";
        pharmacy.delete(medicationNameToDelete);
        System.out.println("\nMedication " + medicationNameToDelete + " deleted.");

        System.out.println("\nUpdated count of medications: " + pharmacy.getCount());
        System.out.println("Remaining medications:");
        pharmacy.printAllMedications();
    }
}
