/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_demo;

import model.Payment;
import view.inputs;

/**
 *
 * @author benjaminlangston
 */
public class MVC_Demo {
    
    private static Payment currentValues = null;
    private static double monthlyPayment = 0;

    public static double getMonthlyPayment() {
        return monthlyPayment;
    }

    public static void setMonthlyPayment(double monthlyPayment) {
        MVC_Demo.monthlyPayment = monthlyPayment;
    }
    
    

    public static Payment getCurrentValues() {
        return currentValues;
    }

    public static void setCurrentValues(Payment currentValues) {
        MVC_Demo.currentValues = currentValues;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       inputs inputs = new inputs();
       inputs.display();
    }
    
}
