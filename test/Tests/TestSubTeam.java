/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import sep.SubTeam;


public class TestSubTeam {
        

    static String input;
    static InputStream stdin;

    public static void main(String[] args) throws Exception {
        TestCase1();
        TestCase2();
        TestCase3();
        TestCase4();
    }

    public static void TestCase1() throws Exception {
        input = "1\r\n"+"1\r\n" + "sasa_plan.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SubTeam testSubTeam = new SubTeam();
            testSubTeam.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
    
    public static void TestCase2() throws Exception {
        input = "1\r\n"+"2\r\n" + "fsdf_task.txt\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SubTeam testSubTeam = new SubTeam();
            testSubTeam.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
    public static void TestCase3() throws Exception {
        input = "2\r\n"+"1\r\n" + "mzksl\r\n"+"plandetails\r\n"+"9998\r\n"+"nocomment\r\n" + "0\r\n";

        stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SubTeam testSubTeam = new SubTeam();
            testSubTeam.process();

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
            SubTeam testSubTeam = new SubTeam();
            testSubTeam.process();

        } finally {
            System.setIn(stdin);
        }
        System.out.println("\u001B[32m" + "TEST OK");
    }
}
