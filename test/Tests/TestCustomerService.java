package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.CustomerService;

public class TestCustomerService {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
    }

    public static void TestCase1() throws Exception {
        input = "1\r\n" + "customer49\r\n" + "ceremony\r\n" + "2015/08/08\r\n" + "2015/08/09\r\n" + "200\r\n" + "breakfast\r\n" + "200000\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            CustomerService testCustomerService = new CustomerService();
            testCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase2() throws Exception {
        input = "2\r\n" + "Jimmy\r\n" + "0723516273\r\n" + "GammlaStan\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            CustomerService testCustomerService = new CustomerService();
            testCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase3() throws Exception {
        input = "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            CustomerService testCustomerService = new CustomerService();
            testCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
