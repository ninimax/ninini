package sep;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Login extends Employee {

    private static String newLine = System.lineSeparator();

    /**
     *
     * @throws Exception
     */
    @Override
    public void process() throws Exception {
        File file = new File("./src/sep/credential/test.txt");
        Properties properties = new Properties();

        System.out.println("Enter job title (enter 'quit' to quit program):");
        String title = scanner.next();

        switch (title) {
            case "test":
                file = new File("./src/sep/credential/test.txt");
                break;
            case "quit":
                System.exit(0);
            default:
                System.out.println("NO SUCH JOB TITLE!");
                System.exit(0);
        }
        properties.load(new FileInputStream(file.getAbsolutePath()));
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter password:");

        String password = scanner.next();

        if (!file.exists()) {
            file.createNewFile();
        }
        for (String key : properties.stringPropertyNames()) {
            if (key.equals(username) && properties.getProperty(key).equals(password)) {
                System.out.println("Valid stuff, yo!");
                break;
            } else {
                System.err.println("Sorry, can't do it!");
                break;
            }
        }
    }
}
