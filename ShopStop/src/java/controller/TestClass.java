///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.util.HashMap;
//import org.quickconnectfamily.json.JSONOutputStream;
//
///**
// *
// * @author benjaminlangston
// */
//public class TestClass implements reportInt {
//
//    @Override
//    public void handleIt(HashMap<String, Object> dataMap) {
//        try {
//            JSONOutputStream outToClient
//                    = (JSONOutputStream) dataMap.remove("toClient");
//            System.out.println("Just got:" + dataMap + " from client");
//            dataMap.put("command", "Done");
//            outToClient.writeObject(dataMap);
//            System.out.println("just sent " + dataMap);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
