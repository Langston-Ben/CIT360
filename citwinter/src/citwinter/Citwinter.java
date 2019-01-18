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
        System.out.println("List Example");
        System.out.println("Jedi Knights");
        Iterator jedi = one.iterator();
        
        while(jedi.hasNext()) {
        Object element = jedi.next();
        System.out.print(element + "\n");
        }
        
        System.out.print("\n");
        
        // Set
        System.out.println("Set Example");
        int advance[] = {7,3,9,5,0,6,4};
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set + "\n");
        
        //  Map
        System.out.println("Map Example");
        Map two = new HashMap();
        two.put("Jimmy Page", "Guitar");
        two.put("Robert Plant", "Vocals");
        two.put("John Bonham", "Drums");
        two.put("John Paul Jones", "Bass & Keyboards");
        
        System.out.println("Led Zeppelin is: \n");
        
        two.forEach((k,v) -> System.out.println("Band Member - " + k + ", Instrument - " + v + "\n"));
     
        
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
        
        // Queue
        System.out.println("\nQueue Example");
        Queue<String> pausedQueue = new LinkedList<>();
        
        pausedQueue.add("Jeff");
        pausedQueue.add("Jim");
        pausedQueue.add("Sam");
        pausedQueue.add("Ben");
        pausedQueue.add("Susan");
        
        pausedQueue.forEach(name -> {
           System.out.println(name);
        });
        
        
        
        

    }
    
}
