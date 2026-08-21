package library.model;

import library.service.Printable;

public class DigitalResource extends LibraryResource implements Printable {

    public DigitalResource(int resourceId, String title, String author) {
        super(resourceId, title, author);
    }

    @Override
    public double calculateFine(int overdueDays) {

        return overdueDays * 2;
    }

    @Override
    public void printDetails() {

        System.out.println("--------------------------------");
        System.out.println("Resource Type: Digital Resource");

        displayBasicDetails();

        System.out.println("--------------------------------");
    }
}