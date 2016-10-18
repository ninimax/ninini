package Tests;

import sep.HRAssistant;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestHRAssistant {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
        TestCase4();
    }

    public static void TestCase1() throws Exception {
        input = "1\r\n" + "reszq_resourcerequest.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            HRAssistant testHRAssistant = new HRAssistant();
            testHRAssistant.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase2() throws Exception {
        input = "2\r\n" + "mk_interviewee.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            HRAssistant testHRAssistant = new HRAssistant();
            testHRAssistant.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase3() throws Exception {
        input = "3\r\n" + "hugo\r\n" + "21\r\n" + "1\r\n" + "developer\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            HRAssistant testHRAssistant = new HRAssistant();
            testHRAssistant.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase4() throws Exception {
        input = "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            HRAssistant testHRAssistant = new HRAssistant();
            testHRAssistant.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
