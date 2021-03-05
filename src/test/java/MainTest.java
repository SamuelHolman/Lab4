/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Locke
 */
public class MainTest {
    
    public MainTest() {
    }

    

    @Test
    public void testInsuranceEstimator() {
        System.out.println("InsuranceEstimator");
        int age = 33;
        int expResult = 465;
        int result = Main.InsuranceEstimator(age);
        assertEquals(expResult, result);
    }

    @Test
    public void testBankCharges1() {
        System.out.println("BankCharges");
        double checkamount = 18.0;
        double expResult = 11.8;
        double result = Main.BankCharges(checkamount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankCharges2() {
        System.out.println("BankCharges");
        double checkamount = 30.0;
        double expResult = 12.4;
        double result = Main.BankCharges(checkamount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankCharges3() {
        System.out.println("BankCharges");
        double checkamount = 50.0;
        double expResult = 13.0;
        double result = Main.BankCharges(checkamount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankCharges4() {
        System.out.println("BankCharges");
        double checkamount = 70.0;
        double expResult = 12.8;
        double result = Main.BankCharges(checkamount);
        assertEquals(expResult, result, 0.0);
    }
}
