/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.*;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benjaminlangston
 */
public class Encryption {

    public static String MD5(String input) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}


  
//        
//       
//        
//        public static String MD5(String input) {
//           
//            String hashedPassword = BCrypt.hashpw(input, BCrypt.gensalt(12));
//            
//            return(hashedPassword);
//    
//    
//    
//    }
//        
//        public static boolean checkPassword(String password_plaintext, String stored_hash) {
//		boolean password_verified = false;
//
//		if(null == stored_hash || !stored_hash.startsWith("$2a$"))
//			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");
//
//		password_verified = BCrypt.checkpw(password_plaintext, stored_hash);
//
//		return(password_verified);
//	}
//
//    
    
    
    