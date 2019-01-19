/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Collections.*;
import view.*;
import java.util.Scanner;

/**
 *
 * @author waabb
 */
public class Switch {

    public Switch() {
        menu();
    }

    
    public void menu() {
        Scanner userInput = new Scanner(System.in);
        String menuOption = "A";
        
        do {
            System.out.println("Enter a Number: ");
            System.out.println("1 - List Demonstration");
            System.out.println("2 - Map Demonstration");
            System.out.println("3 - Queue Demonstration");
            System.out.println("4 - Set Demonstration");
            System.out.println("5 - Tree Demonstration");
            System.out.println("Q - Quit");
            
            String input = userInput.next().toUpperCase();
            menuOption = input.concat(input);

            // switch statement
            switch (input) {
                case "1":
                    ListDemo listDemo = new ListDemo("list");
                    break;
                case "2":
                    MapDemo mapDemo = new MapDemo("map");
                    break;
                case "3":
                    QueueDemo queDemo = new QueueDemo("queue");
                    break;
                case "4":
                    SetDemo setDemo = new SetDemo("set");
                    break;
                case "5":
                    TreeDemo treeDemo = new TreeDemo("tree");
                    break;
                case "Q":
                    System.out.println("GoodBye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (menuOption != "Q");

    }

}
