package sep;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class SEP {

    private static File file;
    private static Properties properties = new Properties();
    private static String newLine = System.lineSeparator();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        SEP mySEP = new SEP();
        mySEP.login();
    }

    public void login() throws Exception {
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
                case "seniorCustomerService":
                    file = new File("./src/sep/credential/seniorCustomerService.txt");
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
                    continue;
            }
            properties.load(new FileInputStream(file.getAbsolutePath()));

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
                        CustomerService newcustomerservice = new CustomerService();
                        newcustomerservice.process();
                        break;
                    case "seniorCustomerService":
                        SeniorCustomerService newseniorcustomerservice = new SeniorCustomerService();
                        newseniorcustomerservice.process();
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
                        break;
                    case "hr":
                        HR newhr = new HR();
                        newhr.process();
                        break;
                }
            }
        }
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
}
