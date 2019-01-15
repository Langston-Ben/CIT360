/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citwinter;

import java.util.*;

/**
 *
 * @author benjaminlangston
 */
public class Citwinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList
        List one = new ArrayList();
        one.add("ObiWan");
        one.add("Anakin");
        one.add("Luke");
        one.add("Yoda");
        one.add("Vader");
        
        System.out.println("Jedi Knights");
        System.out.println(one);
        
        // Set
        int advance[] = {7,3,9,5,0,6,4};
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set);
        
        //  Map
        Map two = new HashMap();
        two.put("Jimmy Page", "Guitar");
        two.put("Robert Plant", "Vocals");
        two.put("John Bonham", "Drums");
        two.put("John Paul Jones", "Bass & Keyboards");
        
        System.out.println("Led Zeppelin");
        System.out.println( two);
        
        // Tree
        
        // Queue
        
        

    }
    
}
