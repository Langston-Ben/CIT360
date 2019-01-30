/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontpatt;

import java.util.*;


/**
 *
 * @author benjaminlangston
 */

public class AppContPatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
            Scanner input = new Scanner(System.in);
            Integer input1;
            Integer input2;
            
            String symbol;
            
            System.out.println("Please enter a number");
            input1 = Integer.parseInt(input.nextLine());
            
            System.out.println("Enter the function you would like to do: \n"
                    + "(+, -, *, /");
            symbol = input.nextLine();
            
            System.out.println("Please enter another number");
            input2 = Integer.parseInt(input.nextLine());
            
            System.out.println("The Answer is: ");
            AppController.applicationHandler(symbol, input1, input2);
            
    }
    
}
