package sep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class SEP {

    private static File file;
    private static Properties properties;
    //private static int recordNbr;
    private static String newLine = System.lineSeparator();
    private static Scanner scanner = new Scanner(System.in);

    static {

    }

    public static void main(String[] args) throws Exception {

        properties = new Properties();

        while (true) {
            System.out.println("Enter job title (enter 'quit' to quit program):");
            String title = scanner.next();

            switch (title) {
                case "admin":
                    file = new File("./src/sep/credential/admin.txt");
                    break;
                case "production":
                    file = new File("./src/sep/credential/production.txt");
                    break;
                case "customerService":
                    file = new File("./src/sep/credential/customerService.txt");
                    break;
                case "financial":
                    file = new File("./src/sep/credential/financial.txt");
                    break;
                case "services":
                    file = new File("./src/sep/credential/services.txt");
                    break;
                case "subteam":
                    file = new File("./src/sep/credential/subteam.txt");
                    break;
                case "hrassistant":
                    file = new File("./src/sep/credential/hrassistant.txt");
                    break;
                 case "hr":
                    file = new File("./src/sep/credential/hr.txt");
                    break;
                case "quit":
                    System.exit(0);
                default:
                    System.out.println("NO SUCH JOB TITLE!");
                    System.exit(0);
            }
            properties.load(new FileInputStream(file.getAbsolutePath()));

            //Scanner scanner = new Scanner(System.in);
            System.out.println("Enter username:");
            String username = scanner.next();
            System.out.println("Enter password:");

            String password = scanner.next();

            if (!file.exists()) {
                file.createNewFile();
            }

            Boolean doesTheKeyValuePairExist
                    = checkIfKeyValuePairExists(
                            username, password);

            if (!doesTheKeyValuePairExist) {
                System.err.println("Sorry, can't do it!");
            } else {
                System.out.println("Valid stuff, yo!");

                String fileName = "";
                int option;
                switch (title) {
                    case "admin":
                        Admin newadmin = new Admin();
                        newadmin.process();
                        break;
                    case "production":
                        break;
                    case "financial":
                        Financial newfinancial = new Financial();
                        newfinancial.process();
                        break;
                    case "customerService":

                        System.out.println("Please type in client name: ");
                        String clientName = scanner.next();
                        addNewEventPlan(clientName);
                        break;
                    case "services":
                        Services newservice = new Services();
                        newservice.process();
                        break;
                    case "subteam":
                        SubTeam newsubteam = new SubTeam();
                        newsubteam.process();
                        break;
                    case "hrassistant":
                        HRAssistant newhrassistant = new HRAssistant();
                        newhrassistant.process();
                    case "hr":
                        HR newhr = new HR();
                        newhr.process();
                }
                //System.out.println("Please type in record nbr: ");
                //int recordNbr = scanner.nextInt();

                //recordNbr +=1;
                //System.out.println("now: "+recordNbr);
                //properties.setProperty("lastSeq", Integer.toString(recordNbr));
                //TODO change seq number
            }

        }
    }

    /*
    private static void addNewCredentials(
            String username, String password)
            throws IOException {
        FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        buffered_writer.write(newLine + username + ":" + password);
        buffered_writer.close();
    }*/
    private static void addNewEventPlan(String clientName)
            throws IOException {

        //EventPlan eventPlan = new EventPlan(clientName);
        File eventPlan = new File("./eventPlans/" + clientName + "_eventPlan.txt");
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

    private static Boolean checkIfKeyValuePairExists(String username, String password) {
        for (String key
                : properties.stringPropertyNames()) {
            if (key.equals(username) && properties.getProperty(key).equals(password)) {
                return true;
            }
        }

        return false;
    }
    /*
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
    
    private static void comment(String filePath) throws Exception{
        System.out.println("Please enter your comment:");
        String comment = scanner.next();
        File eventPlan = new File(filePath );
        FileWriter writer = new FileWriter(eventPlan.getAbsolutePath(), true);
        BufferedWriter buffered_writer = new BufferedWriter(writer);
        buffered_writer.write(newLine + "comment:" + comment);
        buffered_writer.close();        
    }
    
     */
}
