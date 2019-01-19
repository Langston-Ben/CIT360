/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashMap;
import java.util.Map;
import view.Demo;

/**
 *
 * @author jamesK
 */
public class MapDemo extends Demo {
    
    public MapDemo(String demotype) {
        super(demotype);
         //  Map
        System.out.println("Map Example");
        Map two = new HashMap();
        two.put("Jimmy Page", "Guitar");
        two.put("Robert Plant", "Vocals");
        two.put("John Bonham", "Drums");
        two.put("John Paul Jones", "Bass & Keyboards");
        
        System.out.println("Led Zeppelin is: \n");
        
        two.forEach((k,v) -> System.out.println("Band Member - " + k 
                + ", Instrument - " + v + "\n"));
        
        
    }
    
}
