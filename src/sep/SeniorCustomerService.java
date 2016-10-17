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
public class SeniorCustomerService extends Employee{
        int option1,option2;
    //private static File file;
    //private static Properties properties;
    private static  String newLine = System.lineSeparator();
    //private static  Scanner scanner = new Scanner(System.in);
    private String fileName;
    public void process() throws Exception{
        while(true){
            System.out.println("What do you want to do! 1-Viwe the event plans 0-quit");
            option1 = scanner.nextInt();
            switch(option1){
                case 1:
                    System.out.println("List of resource reqeusts in current folder:");
                    getDirectoryList("./src/sep/eventPlans");
                    System.out.println("Enter fileName (or 'quit' to quit):");
                    fileName = scanner.next();
                    if (fileName.equals("0")) {
                        break;
                    } else {
                        try {
                           reviewFile("./src/sep/eventPlans/" + fileName);
                        }catch (Exception e) {
                           System.out.println("Error reading file! No such file!");
                        }
                        }
                    break;
                case 0:
                    return;
            }

        }
    }
}
