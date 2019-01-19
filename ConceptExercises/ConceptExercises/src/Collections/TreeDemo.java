/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Iterator;
import java.util.TreeSet;
import view.Demo;

/**
 *
 * @author jamesK
 */
public class TreeDemo extends Demo {
    
    public TreeDemo(String demotype) {
        super(demotype);
        
        // Tree
        System.out.println("TreeSet Example");
        TreeSet three = new TreeSet();
        three.add("Black");
        three.add("White");
        three.add("Green");
        three.add("Orange");
        three.add("Yellow");
        three.add("Red");
        three.add("Purple");
        
        Iterator list = three.iterator();
        
        while(list.hasNext()) {
        Object element = list.next();
        System.out.print(element + "\n");
        }
        
        
    }
    
}
