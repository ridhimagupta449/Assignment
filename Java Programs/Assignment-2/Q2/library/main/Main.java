package library.main;

import library.model.LibraryResource;
import library.model.Book;
import library.model.DigitalResource;
import library.util.InputValidator;

public class Main {

    public static void main(String[] args) {

        LibraryResource[] resources = new LibraryResource[5];

        resources[0] = new Book(
                101,
                "Java Programming",
                "James Gosling"
        );

        resources[1] = new DigitalResource(
                102,
                "Database Systems",
                "Raghu Ramakrishnan"
        );

        resources[2] = new Book(
                103,
                "Data Structures",
                "Mark Allen Weiss"
        );

        resources[3] = new DigitalResource(
                104,
                "Computer Networks",
                "Andrew Tanenbaum"
        );

        resources[4] = new Book(
                105,
                "Operating Systems",
                "Galvin"
        );

        int[] overdueDays = {5, 10, 3, 7, 4};

        double totalFine = 0;

        System.out.println("===== LIBRARY RESOURCE DETAILS =====");

        for (int i = 0; i < resources.length; i++) {

            if (InputValidator.validateResourceId(
                    resources[i].getResourceId())
                    && InputValidator.validateFineDays(overdueDays[i])) {

                if (resources[i] instanceof library.service.Printable) {

                    ((library.service.Printable) resources[i]).printDetails();
                }

                double fine = resources[i].calculateFine(overdueDays[i]);

                System.out.println("Overdue Days: " + overdueDays[i]);
                System.out.println("Fine: Rs. " + fine);

                totalFine = totalFine + fine;

            } else {

                System.out.println("Invalid Resource Details!");
            }
        }

        System.out.println("====================================");
        System.out.println("Total Fine: Rs. " + totalFine);

        LibraryResource.displayTotalResources();
    }
}