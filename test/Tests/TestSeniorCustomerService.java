/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.SeniorCustomerService;

/**
 *
 * @author Sean
 */
public class TestSeniorCustomerService {
        

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
    }

    public static void TestCase1() throws Exception {
        input = "1\r\n" + "sam_eventPlan.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SeniorCustomerService testSeniorCustomerService = new SeniorCustomerService();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase2() throws Exception {
        input = "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SeniorCustomerService testSeniorCustomerService = new SeniorCustomerService();
            testSeniorCustomerService.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
