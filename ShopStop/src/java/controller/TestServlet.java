///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
////package com.doing.more.java;
//
//import controller.AppController;
//import controller.reportInt;
//import org.quickconnectfamily.json.JSONInputStream;
//import org.quickconnectfamily.json.JSONOutputStream;
//
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.HashMap;
//
//
//@WebServlet(name = "JSONEchoService", urlPatterns = {"/json"})
//public class TestServlet extends HttpServlet {
//    private AppController theAppController = new AppController();
//
//    public void init(){
//        theAppController.mapCommand("Speak", new TestClass());
//    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        try {
//            JSONInputStream inFromClient = new JSONInputStream(request.getInputStream());
//            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());
//
//            HashMap<String, Object> dataMap = (HashMap) inFromClient.readObject();
//            dataMap.put("toClient", outToClient);
//
//            String aCommand = (String) dataMap.get("command");
//            theAppController.handleRequest(aCommand, dataMap);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request,response);
//    }
//}