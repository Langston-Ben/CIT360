/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekthree;

/**
 *
 * @author benjaminlangston
 */

       
import static weekthree.Colors.ThreadColor.ANSI_GREEN;
import static weekthree.Colors.ThreadColor.ANSI_PURPLE;

public class WeekThree {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");

        
        
        System.out.println("\nThis is a demo of an Executor\n");
        Executor executor = new Executor();
        executor.test();
        
        
        System.out.println("\nThis is a demo of an atomic variable\n");
        Atomic_Test atomic = new Atomic_Test();
        atomic.atomicFun();
        
        
    }
}

    
    

