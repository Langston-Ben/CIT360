/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import bean.CategoryModel;
import bean.InvModel;
import bean.OnlineStore;
import bean.Users;
import controller.Encryption;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author benjaminlangston
 */
public class CommonOperationsTest {
    
    public CommonOperationsTest() {
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
    
     @Rollback(true)

    /**
     * Test of getLoginDetails method, of class CommonOperations.
     */
    @Test
    public void testGetLoginDetails() {
        System.out.println("getLoginDetails");
        String pw = "PassWord";
        pw = Encryption.MD5(pw);
        
        Users user = new Users();
        user.setUNAME("blangston");
        user.setUPASSWORD(pw);
        CommonOperations instance = new CommonOperations();
        Users expResult = user;
        Users result = instance.getLoginDetails(user);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class CommonOperations.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String pw = "JungleJim";
        pw = Encryption.MD5(pw);
        
        Users user = new Users();
        user.setFNAME("Tom");
        user.setLNAME("Toenail");
        user.setUNAME("ttoenail");
        user.setUPASSWORD(pw);
        CommonOperations instance = new CommonOperations();
        Users expResult = user;
        Users result = instance.registerUser(user);
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of invMgt method, of class CommonOperations.
     */
    @Test
    public void testInvMgt() {
        System.out.println("invMgt");
        InvModel inv = new InvModel();
        inv.setCategoryId(1);
        inv.setItemName("Test Item");
        inv.setItemDesc("Test Item Description");
        inv.setItemPrice("99.99");
        inv.setItemStock("777");
        CommonOperations instance = new CommonOperations();
        InvModel expResult = inv;
        InvModel result = instance.invMgt(inv);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of categoryMgt method, of class CommonOperations.
     */
    @Test
    public void testCategoryMgt() {
        System.out.println("categoryMgt");
        
        CategoryModel cat = new CategoryModel();
        cat.setCategoryName("Test Category");
        CommonOperations instance = new CommonOperations();
        CategoryModel expResult = cat;
        CategoryModel result = instance.categoryMgt(cat);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of MapList method, of class CommonOperations.
     */
    @Test
    public void testMapList() {
        System.out.println("MapList");
        CommonOperations instance = new CommonOperations();
//        Map<Integer, String> expResult = null;
        Map<Integer, String> result = instance.MapList();
        assertNotNull(result);
//        assertEquals(expResult, result);
       
    }

    /**
     * Test of InventoryReport method, of class CommonOperations.
     */
    @Test
    public void testInventoryReport() {
        System.out.println("InventoryReport");
        CommonOperations instance = new CommonOperations();
//        List expResult = null;
        List result = instance.InventoryReport();
//        assertEquals(expResult, result);
        assertNotNull(result);
       
    }

    /**
     * Test of UserReport method, of class CommonOperations.
     */
    @Test
    public void testUserReport() {
        System.out.println("UserReport");
        CommonOperations instance = new CommonOperations();
//        List expResult = null;
        List result = instance.UserReport();
        assertNotNull(result);
//        assertEquals(expResult, result);
        
    }

    /**
     * Test of saveUserReport method, of class CommonOperations.
     */
  

    /**
     * Test of OnlineReport method, of class CommonOperations.
     */
    @Test
    public void testOnlineReport() throws Exception {
        System.out.println("OnlineReport");
        CommonOperations instance = new CommonOperations();
        Map<String, OnlineStore> expResult = null;
        Map<String, OnlineStore> result = instance.OnlineReport();
        assertNotNull(result);
//        assertEquals(expResult, result);
       
    }
    
}
