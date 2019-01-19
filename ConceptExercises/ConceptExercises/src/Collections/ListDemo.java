/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import view.Demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jamesK
 */
public class ListDemo extends Demo {
        
    public ListDemo(String demotype) {
        super(demotype);
        
        // demonstrate ArrayList
        
        // create an ArrayList
         // ArrayList
        List one = new ArrayList();
        one.add("ObiWan");
        one.add("Anakin");
        one.add("Luke");
        one.add("Yoda");
        one.add("Vader");
        System.out.println("List Example");
        System.out.println("Jedi Knights");
        Iterator jedi = one.iterator();
        
        while(jedi.hasNext()) {
        Object element = jedi.next();
        System.out.print(element + "\n");
        }
        
        System.out.print("\n");
    }
}
