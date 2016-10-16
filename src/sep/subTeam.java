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
public class subTeam {
    int option1,option2;
    private static File file;
    private static Properties properties;
    private static  String newLine = System.lineSeparator();
    private static  Scanner scanner = new Scanner(System.in);
    private String fileName;
    public void process() throws Exception{
        while(true){
        System.out.println("What do you want to do?! 1-review file 2-creat file 0-quit");
        option1 = scanner.nextInt();
        switch(option1){
        case 1:
            System.out.println("What kind of file you want to review?! 1-Plans 2-Tasks 0-quit");
            option2 = scanner.nextInt();
            switch(option2){
                case 1:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./plans");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    reviewFile("./plans/" + fileName);
                    break;
                case 2:
                    System.out.println("List of documents in current folder:");
                    getDirectoryList("./tasks");
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    reviewFile("./tasks/" + fileName);
                    break;
                case 0:
            }
            break;
        case 2:
            System.out.println("What kind of file you want to create?! 1-Plan 0-quit");
            option2 = scanner.nextInt();
            switch(option2){
                case 1:
                    System.out.println("Enter fileName:");
                    fileName = scanner.next();
                    addNewPlan(fileName);
                    break;
                case 0:
                    break;
            }
        case 0:
            return;
        }
        }
    }
    private void addNewPlan(String clientName)
        throws IOException{
        File newApplication = new File("./plans/" + clientName + "_plan.txt");
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
    private static void reviewFile(String filePath) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }        
}
