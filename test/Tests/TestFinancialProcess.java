package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.Financial;

public class TestFinancialProcess {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCaseOne();
        TestCaseFive();
        TestCaseTwo();
        TestCaseThree();
        TestCaseFour();
    }

    /*
    Test case one:
    "1"- event plan -> "1"-review ->"sam_eventPlan.txt" -> "0"-quit -> "0" quit
     */
    public static void TestCaseOne() throws Exception {
        input = "1\r\n" + "1\r\n" + "sam_eventPlan.txt\r\n" + "0\r\n";

        stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Financial testFinancial = new Financial();
            testFinancial.process();

        } finally {
            System.setIn(stdin);
        }
    }

    public static void TestCaseFive() throws Exception {
        input = "1\r\n" + "1\r\n" + "sam_eventPlan.txt\r\n" + "0\r\n";

        stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Financial testFinancial = new Financial();
            testFinancial.process();

        } finally {
            System.setIn(stdin);
        }
    }

    /*
    Test case two:
    "1"- event plan -> "2"-comment -> "sam_eventPlan.txt" ->"goodplan" ->"0"-quit -> "0"-quit
     */
    public static void TestCaseTwo() throws Exception {
        String input = "\r\n" + "1\r\n" + "2\r\n" + "sam_eventPlan.txt\r\n" + "goodplan\r\n" + "0\r\n";
        System.setIn(System.in);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Financial testFinancial = new Financial();
        testFinancial.process();
        System.out.println("\u001B[32m" + "TEST OK");
        System.setIn(System.in);
    }

    /*
    Test case three:
    "1"- event plan -> "0"-quit 
     */
    public static void TestCaseThree() throws Exception {
        String input = "1\r\n" + "0\r\n" + "0\r\n";
        System.setIn(System.in);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Financial testFinancial = new Financial();
        testFinancial.process();

        System.out.println("\u001B[32m" + "TEST OK");
        System.setIn(System.in);
    }

    /*
    Test case four:
    "2"- budget request -> "sam_budgetrequest.txt"-> "0"-quit -> "0"-quit
     */
    public static void TestCaseFour() throws Exception {
        String input = "2\r\n" + "sam_budgetrequest.txt\r\n" + "0\r\n" + "0\r\n";

        InputStream stdin = System.in;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Financial testFinancial = new Financial();
        testFinancial.process();
        System.out.println("\u001B[32m" + "TEST OK");
        System.setIn(stdin);

    }

}
