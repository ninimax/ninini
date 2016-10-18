package sep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerService extends Employee {

    int option1, option2;
    private static String newLine = System.lineSeparator();
    private String fileName;

    public void process() throws Exception {
        while (true) {
            System.out.println("What do you want to do! 1-Creat event plan 2-Client registration 0-quit");
            option1 = scanner.nextInt();
            switch (option1) {
                case 1:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./src/sep/eventPlans");
                    System.out.println("Enter client's name:");
                    fileName = scanner.next();
                    addNewEventPlan(fileName);
                    break;
                case 2:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./src/sep/clientregistration");
                    System.out.println("Enter client's name:");
                    fileName = scanner.next();
                    addNewClientRegistration(fileName);
                    break;
                case 0:
                    return;
            }
        }
    }

    private void addNewEventPlan(String clientName) throws IOException {
        File eventPlan = new File("./src/sep/eventPlans/" + clientName + "_eventPlan.txt");
        eventPlan.createNewFile();

        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);

        buffered_writer.write(newLine + "clientName:" + clientName);

        System.out.println("Please enter eventType:");
        String eventType = scanner.next();
        buffered_writer.write(newLine + "eventType:" + eventType);

        System.out.println("Please enter dateFrom (YYYY/MM/DD):");
        String dateFrom = scanner.next();
        buffered_writer.write(newLine + "dateFrom:" + dateFrom);

        System.out.println("Please enter dateTo (YYYY/MM/DD):");
        String dateTo = scanner.next();
        buffered_writer.write(newLine + "dateTo:" + dateTo);

        System.out.println("Please enter nbrOfAttendees:");
        String nbrOfAttendees = scanner.next();
        buffered_writer.write(newLine + "nbrOfAttendees:" + nbrOfAttendees);

        System.out.println("Please enter preferences (no preference / decorations / breakfast / parties / hot drinks");
        String preference = scanner.next();
        buffered_writer.write(newLine + "preference:" + preference);

        System.out.println("Please enter budgetExpectation:");
        String budgetExpectation = scanner.next();
        buffered_writer.write(newLine + "budgetExpectation:" + budgetExpectation);

        buffered_writer.close();
    }

    private void addNewClientRegistration(String clientName)
            throws IOException {
        File eventPlan = new File("./src/sep/clientregistration/" + clientName + "_clientregistration.txt");
        eventPlan.createNewFile();

        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);

        buffered_writer.write(newLine + "clientName:" + clientName);

        System.out.println("Please enter client's phone number:");
        String phone = scanner.next();
        buffered_writer.write(newLine + "phone:" + phone);

        System.out.println("Please enter client's address:");
        String address = scanner.next();
        buffered_writer.write(newLine + "address:" + address);

        buffered_writer.close();
    }
}
