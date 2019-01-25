/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.calculation;
import java.util.Scanner;
import model.Payment;
import mvc_demo.MVC_Demo;

/**
 *
 * @author benjaminlangston
 */
public class inputs {
    
    public static Payment displayinputs() {
    
//    public void MonthlyPayment () {
    
        Payment payment = new Payment();
        
        System.out.println();
        System.out.println("This program will determine your monthly loan payment.");
        // prompt to enter the users name
        System.out.println("\nPlease enter name:");
        
        // create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        // read the value of the next line typed in the console
        String name = inFile.nextLine();
        payment.setName(name);
        
        // prompt to enter the loan amount
        System.out.println("\nLoan Amount in US dollars:");
        
        // get the value entered for the loan amount
        double loanAmount = inFile.nextDouble();
        payment.setLoanAmount(loanAmount);
        
        // prompt to enter the years of the loan
        System.out.println("\nNumber of Years:");
        
        // get the value entered for years of the loan
        double numberOfYears = inFile.nextDouble();
        payment.setYears(numberOfYears);
        
         // prompt to enter the periods per year
        System.out.println("\nPeriods per year:");
        
        // get the value entered for years of the loan
        double periodsPerYear = inFile.nextDouble();
        payment.setPeriods(periodsPerYear);
        
        // prompt to enter the interest rate
        System.out.println("\nInterest rate (decimal form):");
        
         // get the value entered for the interest rate
        double interestRate = inFile.nextDouble();
        payment.setInterestRate(interestRate);
        
        MVC_Demo.setCurrentValues(payment);
        
        calculation.calcMonthlyPayment();
        
       
        
        double toPay = MVC_Demo.getMonthlyPayment();
        
        System.out.println("\n\n" + name + "\nyour monthly payment will be: \n" +toPay);
         
        return payment;
        
       
      
        
    
    
}

    public void display() {
       inputs inputs = new inputs();
       inputs.displayinputs();
    }
}