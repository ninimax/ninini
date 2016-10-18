package Tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestEmployee {

    public static void main(String[] args) throws Exception {
        TestreviewFile("./src/sep/plans/sasa_plan.txt");
        TestGetDirectoryList("./src/sep/plans/");
    }

    static void TestreviewFile(String filePath) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
        System.out.println("\u001B[32m" + "TEST OK");
    }

    static void TestGetDirectoryList(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
