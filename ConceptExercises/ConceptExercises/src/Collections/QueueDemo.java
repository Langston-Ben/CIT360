/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.LinkedList;
import java.util.Queue;
import view.Demo;

/**
 *
 * @author jamesK
 */
public class QueueDemo extends Demo {
    
    public QueueDemo(String demotype) {
        super(demotype);
        
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
