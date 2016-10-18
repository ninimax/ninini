package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.Login;

public class TestLogin {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
    }

    public static void TestCase1() throws Exception {
        input = "test\r\n" + "test\r\n" + "111\r\n" + "quit\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Login testLogin = new Login();
            testLogin.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK" + "\u001B[0m");
    }

    public static void TestCase2() throws Exception {
        input = "test\r\n" + "test\r\n" + "123\r\n" + "quit\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Login testLogin = new Login();
            testLogin.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK" + "\u001B[0m");
    }

    public static void TestCase3() throws Exception {
        input = "test\r\n" + "test2\r\n" + "quit\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Login testLogin = new Login();
            testLogin.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK" + "\u001B[0m");
    }
}
