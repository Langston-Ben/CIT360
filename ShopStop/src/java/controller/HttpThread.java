/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.ws.rs.core.HttpHeaders.USER_AGENT;
import org.quickconnectionfamily.java.JSONException;
import org.quickconnectionfamily.java.JSONInputStream;
import org.quickconnectionfamily.java.ParseException;

/**
 *
 * @author benjaminlangston
 */
public class HttpThread extends Thread {

    @Override
    public void run() {
        
        try {
            String url = ("https://api.myjson.com/bins/lcyxc");
            
            URL obj = new URL(url);
            
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            // optional default is GET
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            
            JSONInputStream inFromServer = new JSONInputStream(con.getInputStream());
            HashMap<String, Object> iResult =
                    (HashMap<String, Object>) inFromServer.readObject();
        } catch (MalformedURLException ex) {
            Logger.getLogger(HttpThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | ParseException ex) {
            Logger.getLogger(HttpThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
