/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontpatt;

import java.util.HashMap;

/**
 *
 * @author benjaminlangston
 */
public class AppController {
    public static HashMap<String, calcInt> key = new HashMap <String, calcInt>();

    public AppController() {
    }
    public static void applicationHandler(String symbol, Double input1, Double input2) {
            
        key.put("+", new Add());
        key.put("-", new Minus());
        key.put("*", new Times());
        key.put("/", new Divid());
        
        calcInt organizer = key.get(symbol);
        organizer.execute(input1, input2);
      
    }
}
