
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Locke
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = keyboard.nextInt();
        age = InsuranceEstimator(age);
        System.out.println("You owe " + age + " dollars for your insurance.");
        
        System.out.println("Enter the amount of checks you deposited");
        double checkamount = keyboard.nextDouble();
        checkamount = BankCharges(checkamount);
        System.out.println("You owe " + checkamount + " dollars for the amount of checks you cashed.");
        
    }
    public static int InsuranceEstimator(int age) {
        int cost = (5 * age) + 300;
        return cost;
    }
    
    public static double BankCharges(double checkamount) {
        if (20 > checkamount){
            checkamount = (checkamount * .1)+10;
            return checkamount;
        } else if(40 > checkamount){
            checkamount = (checkamount * .08)+10;
            return checkamount;
        } else if(60 > checkamount){
            checkamount = (checkamount * .06)+10;
            return checkamount;
        } else {
            checkamount = (checkamount * .04)+10;
            return checkamount;
        }
    }
}


