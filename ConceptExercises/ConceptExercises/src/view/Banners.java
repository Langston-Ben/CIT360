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
public class Banners {

    // Default Constructor
    public Banners() {
    }
    
    /*******************************************************************
     * Non-Default Constructor
     * @param demotype
     ******************************************************************/
    public Banners(String demotype) {
        createBanner(demotype);
    }
    
    /*******************************************************************
     * Create a Banner
     * @param title
     ******************************************************************/
    public static void createBanner(String title) {
        String fullTitle = generateTitle(title);
        int stars = fullTitle.length();
        printStars(stars);
        System.out.println(fullTitle);
        printStars(stars);
    }
    
    /*******************************************************************
     * Print Appropriate Length of "*'s" on their own line
     * @param length
     ******************************************************************/
    private static void printStars(int length) {
        
        for (int i = 0; i < length; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    /*******************************************************************
     * Concatenate Banner Title Together
     * @param title
     ******************************************************************/
    private static String generateTitle(String title) {
        String fullTitle = "*          " + title + "          *";
        return fullTitle;
    }
    
    
}
