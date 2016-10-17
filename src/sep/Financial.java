/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author 44535
 */
public class Financial extends Employee {

    int option1, option2;
    //private static File file;
    //private static Properties properties;
    private static String newLine = System.lineSeparator();
    //private static Scanner scanner = new Scanner(System.in);
    private String fileName;

    public void process() throws Exception {
        while (true) {
            System.out.println("What files do you want to review? 1-event Plan 2- Budget Request 0-quit");
            option1 = scanner.nextInt();
            switch (option1) {
                case 1:
                    System.out.println("What do you want to do?! 1-review 2-comment 0-quit");
                    option2 = scanner.nextInt();
                    switch (option2) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("List of documents in current folder:");
                            getDirectoryList("./src/sep/eventPlans");
                            System.out.println("Enter fileName:");
                            fileName = scanner.next();
                            reviewFile("./src/sep/eventPlans/" + fileName);
                            break;
                        case 2:
                            System.out.println("List of documents in current folder:");
                            getDirectoryList("./src/sep/eventPlans");
                            System.out.println("Enter fileName:");
                            fileName = scanner.next();
                            comment("./src/sep/eventPlans/" + fileName);
                            break;
                        default:
                            System.out.println("No such option!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./src/sep/budgetrequest");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    reviewFile("./src/sep/budgetrequest/" + fileName);
                    break;
                case 0:
                    return;
            }
        }
    }

    private void comment(String filePath) throws Exception {
        System.out.println("Please enter your comment:");
        String comment = scanner.next();
        File eventPlan = new File(filePath);
        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        buffered_writer.write(newLine + "comment:" + comment);
        buffered_writer.close();
    }
}
