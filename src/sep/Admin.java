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
public class Admin extends Employee {
    int option1,option2;
    //private static File file;
    //private static Properties properties;
    private static  String newLine = System.lineSeparator();
    //private   Scanner scanner = new Scanner(System.in);
    private String fileName;
    
    public void process() throws Exception{
        while(true){
            System.out.println("What do you want to do! 1-reviw 2-Make decision 0-quit");
            option1 = scanner.nextInt();
            switch(option1){
                case 1:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./src/sep/eventPlans");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    try{
                    reviewFile("./src/sep/eventPlans/" + fileName);}
                    catch(Exception e){
                    System.out.println("Error reading file! No such file!");
                    }
                    break;
                case 2:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./src/sep/eventPlans");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    decision("./src/sep/eventPlans/" + fileName);
                    break;
                case 0:
                    return;
                default:System.out.println("No such option!");
            }
                    
        }
    }

    public  void decision(String filePath) throws Exception{
        
        System.out.println("Please enter your decision:");
        String decision = scanner.next();
        File eventPlan = new File(filePath );
        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        buffered_writer.write(newLine + "decision:" + decision);
        buffered_writer.close();        
    }    
}