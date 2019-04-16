/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package testingapp;

import java.util.List;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.Test;
import static org.junit.Assert.*;


public class AssertionExamples {
    
    @Test
    public void assertionExamples() {
    
    String one = "car";
    String two = "car";
    String three = null;
    String four = "car";
    String five = "car";
    
    int nOne = 7;
    int nTwo = 3;
    
    String[] arrayOne = {"Peter", "James", "John"};
    String[] arrayTwo = {"Peter", "James", "John"};
    
    System.out.println("assertEquals Test");
    assertEquals(one,two);
    
    assertTrue(nTwo < nOne);
    
    assertFalse(nTwo > nOne);
    
    assertNotNull(one);
    
    assertNull(three);
    
    assertSame(four, five);
    
    assertNotSame(one, three);
    
    assertArrayEquals(arrayOne, arrayTwo);
    
    List<String> bands = Arrays.asList("Cream", "Led Zeppelin", "Pearl Jam", "Deep Purple");
    
    assertThat(bands, hasItems("Cream", "Led Zeppelin"));
   
}
    
}