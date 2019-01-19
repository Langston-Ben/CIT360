/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jamesK
 */
public class Welcome {
    public static void welcomeBanner(String demoType){
        System.out.println("****************************************");
        System.out.println("* Welcome to the " + demoType +" demo. *");
        System.out.println("****************************************");
    }

    public Welcome(String demotype) {
        welcomeBanner(demotype);
    }
}
