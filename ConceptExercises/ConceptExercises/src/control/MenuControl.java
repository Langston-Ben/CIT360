/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Collections.*;
import java.util.Scanner;
import view.*;

/**
 *
 * @author jamesK
 */
public class MenuControl {

    private final Scanner userInput;
    private String menuOption;

    /************************************************************************
     * CONSTRUCTOR
     ***********************************************************************/
    public MenuControl() {
    
        this.userInput = new Scanner(System.in);
        this.menuOption = "A";
        mainMenu();
    }

    /************************************************************************
     * MAIN MENU
     ***********************************************************************/
    public void mainMenu() {
        do {
            Menus.mainMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;

            // switch statement
            switch (input) {
                case "1":
                    Banners.createBanner("Collections");
                    collectionsMenu();
                    break;
                case "2":
                    Banners.createBanner("Threads, Executors, Runnables");
                    threadsMenu();
                    break;
                case "3":
                    Banners.createBanner("Application Controller Pattern");
                    applicationControllerPatternMenu();
                    break;
                case "4":
                    Banners.createBanner("MVC");
                    mvcMenu();
                    break;
                case "5":
                    Banners.createBanner("Hibernate");
                    hibernateMenu();
                    break;
                case "6":
                    Banners.createBanner("QCJSON & JSON");
                    sonMenu();
                    break;
                case "7":
                    Banners.createBanner("Android HttpURLConnection");
                    androidMenu();
                    break;
                case "8":
                    Banners.createBanner("Servlets");
                    servletsMenu();
                    break;
                case "9":
                    Banners.createBanner("JUnit Tests");
                    junitTestsMenu();
                    break;
                case "10":
                    Banners.createBanner("System Level Tests");
                    systemLevelTestsMenu();
                    break;
                case "11":
                    Banners.createBanner("Use Case Diagrams");
                    useCaseDiagramsMenu();
                    break;
                case "12":
                    Banners.createBanner("Use Case Documents");
                    useCaseDocumentsMenu();
                    break;
                case "13":
                    Banners.createBanner("State Diagrams");
                    stateDiagramsMenu();
                    break;
                case "14":
                    Banners.createBanner("Sequence Diagrams");
                    sequenceDiagramsMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
                    break;
                default:
                    Banners.createBanner("Invalid Input");
                    break;
            }
        } while (!"Q".equals(menuOption));
    }

    /************************************************************************
     * COLLECTIONS MENU
     ***********************************************************************/
    public void collectionsMenu() {
        do {
            Menus.collectionsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;

            // switch statement
            switch (input) {
                case "1":
                    ListDemo listDemo = new ListDemo("List");
                    break;
                case "2":
                    MapDemo mapDemo = new MapDemo("Map");
                    break;
                case "3":
                    QueueDemo queDemo = new QueueDemo("Queue");
                    break;
                case "4":
                    SetDemo setDemo = new SetDemo("Set");
                    break;
                case "5":
                    TreeDemo treeDemo = new TreeDemo("Tree");
                    break;
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
                default:
                    Banners.createBanner("Invalid Input");
                    break;
            }
        } while (!"B".equals(menuOption));

    }
    
    /************************************************************************
     * THREADS, EXECUTORS, & RUNNABLES MENU
     ***********************************************************************/
    public void threadsMenu() {
        do {
            Menus.threadexecutorrunnableMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * APPLICATION CONTROLLER PATTERN MENU
     ***********************************************************************/
    public void applicationControllerPatternMenu() {
        do {
            Menus.applicationcontrollerpatternMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * MVC MENU
     ***********************************************************************/
    public void mvcMenu() {
        do {
            Menus.mvcMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * HIBERNATE MENU
     ***********************************************************************/
    public void hibernateMenu() {
        do {
            Menus.hibernateMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * QCJSON & JSON MENU
     ***********************************************************************/
    public void sonMenu() {
        do {
            Menus.qjsonjsonMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * ANDROID HTTPURLCONNECTION MENU
     ***********************************************************************/
    public void androidMenu() {
        do {
            Menus.androidhttpurlconnectionMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * SERVLETS MENU
     ***********************************************************************/
    public void servletsMenu() {
        do {
            Menus.servletsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * JUNIT TESTS MENU
     ***********************************************************************/
    public void junitTestsMenu() {
        do {
            Menus.junittestsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * SYSTEM LEVEL TESTS MENU
     ***********************************************************************/
    public void systemLevelTestsMenu() {
        do {
            Menus.systemleveltestsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * USE CASE DIAGRAMS MENU
     ***********************************************************************/
    public void useCaseDiagramsMenu() {
        do {
            Menus.usecasediagramsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * USE CASE DOCUMENTS MENU
     ***********************************************************************/
    public void useCaseDocumentsMenu() {
        do {
            Menus.usecasedocumentsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * STATE DIAGRAMS MENU
     ***********************************************************************/
    public void stateDiagramsMenu() {
        do {
            Menus.statediagramsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
    
    /************************************************************************
     * SEQUENCE DIAGRAMS MENU
     ***********************************************************************/
    public void sequenceDiagramsMenu() {
        do {
            Menus.sequencediagramsMenu();
            String input = userInput.next().toUpperCase();
            menuOption = input;
            
            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
}
