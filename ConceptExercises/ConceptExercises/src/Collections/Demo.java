/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import view.*;

/**
 *
 * @author jamesK
 */
public class Demo {
    private String demotype;

    public Demo(String demotype) {
        this.demotype = demotype;
        Welcome welcome = new Welcome(demotype);
        
    }
}
