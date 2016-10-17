/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HRAssistant extends Employee {

    int option1, option2;
    private static String newLine = System.lineSeparator();
    private String fileName;

    /**
     *
     * @throws Exception
     */
    @Override
    public void process() throws Exception {
        while (true) {
            System.out.println("You can either 1-Review resource request; 2-Review interviewee; 3-Add interviewee 0-quit ");
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
                System.out.println("You have chosen to add new interviewee!");
                System.out.println("Enter file (interviewee's name) name:");
                fileName = scanner.next();
                addNewInterviewee(fileName);
            } else if (option1 == 0) {
                break;
            } else {
                System.out.println("NO SUCH OPTION!");
            }
        }
    }

    private void addNewInterviewee(String intervieweeName)
            throws IOException {
        File newApplication = new File("./src/sep/interviewee/" + intervieweeName + "_interviewee.txt");
        newApplication.createNewFile();

        FileWriter writer = new FileWriter(newApplication.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);

        buffered_writer.write(newLine + "name:" + intervieweeName);

        System.out.println("Enter interviewee's age: ");
        int age = scanner.nextInt();
        buffered_writer.write(newLine + "age:" + age);
        System.out.println("Enter interviewee's gender (1-male 2-female): ");
        int gender = scanner.nextInt();
        buffered_writer.write(newLine + "gender:" + gender);
        System.out.println("Enter interviewee's expected position: ");
        String expectedPosition = scanner.next();
        buffered_writer.write(newLine + "expectedPosition:" + expectedPosition);

        buffered_writer.close();
    }
}
