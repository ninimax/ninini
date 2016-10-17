/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import sep.HRAssistant;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestHRAssistant {

    public static void main(String[] args) throws Exception {
        String input = "1\r\n" + "1\r\n" + "z_eventPlan.txt\r\n" + "0\r\n";

        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            HRAssistant testFinancial = new HRAssistant();
            testFinancial.process();

        } finally {
            System.setIn(stdin);
        }
    }
}
