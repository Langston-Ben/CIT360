/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;


import java.util.HashSet;
import java.util.Set;
import view.Demo;

/**
 *
 * @author jamesK
 */
public class SetDemo extends Demo {
    
    public SetDemo(String demotype) {
        super(demotype);
        
        System.out.println("Set Example");
        int advance[] = {7,3,9,5,0,6,4};
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set + "\n");
        
        
    }
    
}
