/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Users;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import operations.CommonOperations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benjaminlangston
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doPost method, of class Login.
     */
    @Test
    public void testDoPost() throws Exception {
        
        String pw;
        pw = Encryption.MD5("PassWord");
        Users user=new Users();
        CommonOperations co=new CommonOperations();
       
        
        user.setUNAME("blangston");
        user.setUPASSWORD(pw);
        
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Login instance = new Login();
        instance.doPost(request, response);
        
    }
    
}
