/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package controller;

import java.util.HashMap;
import java.util.List;
import operations.CommonOperations;

/**
 *
 * @author benjaminlangston
 */

public class AppController {
    public static HashMap<String, reportInt> key = new HashMap <String, reportInt>();

    public AppController() {
    }
    public static void applicationHandler(String selection) {
        

            
        key.put("1", (reportInt) new InventoryReport());
//        key.put("-", new DeleteItem());
//        key.put("*", new AddCategory());
//        key.put("/", new DeleteCategory());
        
        reportInt organizer = key.get(selection);
        organizer.execute();
      
    }
    
    }
//import java.util.HashMap;
//public class AppController {
//
//    private HashMap<String, reportInt> handlerMap = new HashMap();
//
//    public void handleRequest(String command, HashMap<String, Object> data) {
//        reportInt aCommandHandler = handlerMap.get(command);
//        if (aCommandHandler != null) {
//            aCommandHandler.handleIt(data);
//        }
//    }
//
//    public void mapCommand(String aCommand, reportInt acHandler) {
//        handlerMap.put(aCommand, acHandler);
//}
//}
    
    

    

