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
public class admin {
    int option1,option2;
    //private static File file;
    //private static Properties properties;
    private static  String newLine = System.lineSeparator();
    private static  Scanner scanner = new Scanner(System.in);
    private String fileName;
    public void process() throws Exception{
        while(true){
            System.out.println("What do you want to do! 1-reviw 2-Make decision 0-quit");
            option1 = scanner.nextInt();
            switch(option1){
                case 1:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./eventPlans");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    reviewFile("./eventPlans/" + fileName);
                    break;
                case 2:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./eventPlans");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    decision("./eventPlans/" + fileName);
                    break;
                case 0:
                    return;
                default:System.out.println("No such option!");
            }
                    
        }
    }
    private static void reviewFile(String filePath) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }   
    
    private static void getDirectoryList(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }   
    private static void decision(String filePath) throws Exception{
        System.out.println("Please enter your decision:");
        String decision = scanner.next();
        File eventPlan = new File(filePath );
        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        buffered_writer.write(newLine + "decision:" + decision);
        buffered_writer.close();        
    }    
}