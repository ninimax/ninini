package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.Admin;

public class TestAdmin {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
    }

    public static void TestCase1() throws Exception {
        input = "1\r\n" + "sam_eventPlan.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Admin testAdmin = new Admin();
            testAdmin.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase2() throws Exception {
        input = "2\r\n" + "sam_eventPlan.txt\r\n" + "rejected\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Admin testAdmin = new Admin();
            testAdmin.process();

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
            Admin testAdmin = new Admin();
            testAdmin.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
