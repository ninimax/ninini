/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.awt.Robot;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class TestLogin {

    public static void main(String[] args) {
        String data = "Hello, World!\r\n"+"Hello, World!\r\n";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
        } finally {
            System.setIn(stdin);
        }
    }
}
