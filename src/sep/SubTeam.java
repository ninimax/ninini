package sep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SubTeam extends Employee {

    int option1, option2;
    private static String newLine = System.lineSeparator();
    private String fileName;

    public void process() throws Exception {
        while (true) {
            System.out.println("What do you want to do?! 1-review file 2-creat file 0-quit");
            option1 = scanner.nextInt();
            switch (option1) {
                case 1:
                    System.out.println("What kind of file you want to review?! 1-Plans 2-Tasks 0-quit");
                    option2 = scanner.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("List of documents in current folder:");
                            getDirectoryList("./src/sep/plans");
                            System.out.println("Enter fileName:");
                            fileName = scanner.next();
                            reviewFile("./src/sep/plans/" + fileName);
                            break;
                        case 2:
                            System.out.println("List of documents in current folder:");
                            getDirectoryList("./src/sep/tasks");
                            System.out.println("Enter fileName:");
                            fileName = scanner.next();
                            reviewFile("./src/sep/tasks/" + fileName);
                            break;
                        case 0:
                    }
                    break;
                case 2:
                    System.out.println("What kind of file you want to create?! 1-Plan 0-quit");
                    option2 = scanner.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("Enter fileName:");
                            fileName = scanner.next();
                            addNewPlan(fileName);
                            continue;
                        case 0:
                            break;
                    }
                case 0:
                    return;
            }
        }
    }

    private void addNewPlan(String clientName)
            throws IOException {
        File newApplication = new File("./src/sep/plans/" + clientName + "_plan.txt");
        newApplication.createNewFile();

        FileWriter writer = new FileWriter(newApplication.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);

        buffered_writer.write(newLine + "clientName:" + clientName);

        System.out.println("Please enter plan's details:");
        String details = scanner.next();
        buffered_writer.write(newLine + "plan's details:" + details);

        System.out.println("Please enter required amount:");
        String requiredAmount = scanner.next();
        buffered_writer.write(newLine + "requiredAmount:" + requiredAmount);

        System.out.println("Please enter comment for extra budget(if need it):");
        String comment = scanner.next();
        buffered_writer.write(newLine + "comment:" + comment);

        buffered_writer.close();
    }
}
