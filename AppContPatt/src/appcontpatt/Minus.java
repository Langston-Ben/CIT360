/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontpatt;

/**
 *
 * @author benjaminlangston
 */
public class Minus implements calcInt {
    
     @Override
    public void execute(Integer input1, Integer input2) {
                Integer sub = input1 - input2;
                System.out.println(sub);
    }
}
