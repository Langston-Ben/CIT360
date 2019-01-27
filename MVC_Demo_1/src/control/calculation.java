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
public class calculation {
    
         public static double calcMonthlyPayment() {
    
        Payment payment = MVC_Demo.getCurrentValues();
    
        double amount = payment.getLoanAmount();
        double years = payment.getYears();
        double periods = payment.getPeriods();
        double interest = payment.getInterestRate();
        
        String name = payment.getName();
        
    
   
        
        double eqOne = 1 + (interest / periods);
        
        double eqTwo = years * -periods;
        
        double eqThree = 1 - Math.pow(eqOne,eqTwo);
        
        double monthlyPayment = amount * (interest / periods) / eqThree;
        
        monthlyPayment = Math.round(monthlyPayment * 100.0) /100.0;
        

//        System.out.println(monthlyPayment);
        
        MVC_Demo.setMonthlyPayment(monthlyPayment);
        MVC_Demo.setTheName(name);


return monthlyPayment;
}
    
}
