/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.SEP;

public class TestLogin {

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
    }

    public static void TestCase1() throws Exception {
        input = "admin\r\n" + "admin\r\n" + "111\r\n" + "0\r\n"+"quit\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase2() throws Exception {
        input = "admin\r\n" + "admin\r\n" + "123\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase3() throws Exception {
        input = "quit\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
    /*
    public static void TestCase2() throws Exception {
        input = "production\r\n" + "production\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase3() throws Exception {
        input = "customerService\r\n" + "customerService\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase4() throws Exception {
        input = "seniorCustomerService\r\n" + "seniorCustomerService\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase5() throws Exception {
        input = "financial\r\n" + "financial\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase6() throws Exception {
        input = "services\r\n" + "services\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase7() throws Exception {
        input = "subteam\r\n" + "subteam\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }

    public static void TestCase8() throws Exception {
        input = "hrassistant\r\n" + "hrassistant\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
    
      public static void TestCase9() throws Exception {
        input = "hr\r\n" + "hr\r\n" + "111\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SEP testSEP = new SEP();
            testSEP.login();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }*/

}
