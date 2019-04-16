/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekthree;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.concurrent.atomic.*;

/**
 *
 * @author benjaminlangston
 */
//class Atomic_Test {
//    
//   
//    
//}
//
//class AtomicVisit {
//
//public static AtomicLong visit = new AtomicLong(5);
//
//}

public class Atomic_Test extends Thread {
    
     public static AtomicInteger visit = new AtomicInteger(100);

    @Override
    public void run() {
        System.out.println(getName() + " : " + Atomic_Test.visit.incrementAndGet());
    }

    public void atomicFun() {
        
     
        for (int i = 0; i < 30; i++) {
            Thread fun = new Atomic_Test();
          
            fun.start();
            
    
    }
        
       

}
}