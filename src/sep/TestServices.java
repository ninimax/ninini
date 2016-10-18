/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.Services;
/**
 *
 * @author 44535
 */
public class TestServices {
    static String input;
    static InputStream stdin;
    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
        TestCase4();
        TestCase5();
        TestCase6();
        TestCase7();
    }
        public static void TestCase1() throws Exception {
        input = "1\r\n" + "1\r\n"+"sam_eventPlan.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase2() throws Exception {
        input = "1\r\n" + "2\r\n"+"fff_task.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase3() throws Exception {
        input = "1\r\n" + "3\r\n"+"sam_budgetrequest.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase4() throws Exception {
        input = "1\r\n" + "4\r\n"+"reszq_resourcerequest.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase5() throws Exception {
        input = "2\r\n" + "1\r\n"+"task1\r\n"+"Party\r\n"+"birthdaypartywithcake\n"+"chef\r\n" +"high\r\n"+ "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase6() throws Exception {
        input = "2\r\n" + "2\r\n"+"budget1\r\n"+"10000kr\r\n"+"dinner\n"+ "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
        public static void TestCase7() throws Exception {
        input = "2\r\n" + "3\r\n"+"person1\r\n"+"vicechef\r\n"+"kitchen\r\n"+ "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Services testSeniorCustomerService = new Services();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }        
}
