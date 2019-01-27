/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Payment;
import mvc_demo.MVC_Demo;

/**
 *
 * @author benjaminlangston
 */
public class storeValues {
    
    public static double storeAmounts(double loanAmount, double numberOfYears,
            double periodsPerYear, double interestRate) {
    
        Payment payment = new Payment();
        
        payment.setLoanAmount(loanAmount);
        payment.setYears(numberOfYears);
        payment.setPeriods(periodsPerYear);
        payment.setInterestRate(interestRate);
        
        MVC_Demo.setCurrentValues(payment);
        
        return 1;  
    }
    
    public static void storeName(String name){
    
       Payment payment = MVC_Demo.getCurrentValues();
       payment.setName(name);
   
    }

   
}
