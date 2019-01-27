/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekthree;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author benjaminlangston
 * 
 * 
 */


public class Executor implements Runnable {
    
    
    private String command;

    public Executor() {
    }
    
    public Executor(String s) {
    
        this.command = s; 
    }
     
    @Override
    public void run() {
    
        System.out.println(Thread.currentThread().getName() + " Start " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End ");
        
    }
    private void processCommand() {
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println("Jim, we have a problem");
        }
    }
    
    
    public void test() {
        System.out.println("Testing 6 Threads with 12 commands");
        
        ExecutorService executor = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 12; i++) {
        Runnable counter = new Executor(" " + i);
        executor.execute(counter);
        
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        
        }
            
        System.out.println("Test Completed");
    }
    
    
    
}
