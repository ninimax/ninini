package sep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HR extends Employee {

    int option1;
    private static String newLine = System.lineSeparator();
    private String fileName;

    @Override
    public void process() throws Exception {
        while (true) {
            System.out.println("You can either 1-Review resource request; 2-Review interviewee; 3-Decide to recruit interviewee 0-quit ");
            int option1 = scanner.nextInt();

            if (option1 == 1) {
                System.out.println("List of resource reqeusts in current folder:");
                getDirectoryList("./src/sep/resourcerequest");
                System.out.println("Enter fileName (or 'quit' to quit):");
                fileName = scanner.next();
                if (fileName.equals("0")) {
                    break;
                } else {
                    try {
                        reviewFile("./src/sep/resourcerequest/" + fileName);
                    } catch (Exception e) {
                        System.out.println("Error reading file! No such file!");
                    }
                }
            } else if (option1 == 2) {
                System.out.println("List of interviewee data in current folder:");
                getDirectoryList("./src/sep/interviewee");
                System.out.println("Enter fileName (or 'quit' to quit)");
                fileName = scanner.next();
                if (fileName.equals("quit")) {
                    break;
                } else {
                    try {
                        reviewFile("./src/sep/interviewee/" + fileName);
                    } catch (Exception e) {
                        System.out.println("Error reading file! No such file!");
                    }
                }
            } else if (option1 == 3) {
                System.out.println("You have chosen to decide whether to recruit the new interviewee!");
                System.out.println("Enter file (interviewee's name) name:");
                fileName = scanner.next();
                recruitInterviewee(fileName);
            } else if (option1 == 0) {
                break;
            } else {
                System.out.println("NO SUCH OPTION!");
            }
        }
    }

    public void recruitInterviewee(String intervieweeName)
            throws IOException {
        File newApplication = new File("./src/sep/interviewee/" + intervieweeName + "_interviewee.txt");
        newApplication.createNewFile();

        FileWriter writer = new FileWriter(newApplication.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        System.out.println("Enter decision whether to recruit this interviewee or not (1-yes 0-no): ");
        int decision = scanner.nextInt();
        buffered_writer.write(newLine + "decision:" + decision);
        buffered_writer.close();
    }
}
