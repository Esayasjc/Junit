/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import arraynumber.*;
/**
 *
 * @author Esayas
 */
public class arrayTest {
    ArrayNumber arn;
    Max max;
    Min min;
    public arrayTest() {
    }
    @Before
    public void setUp() {
        arn = new ArrayNumber();
        max = new Max();
        min = new Min();
    }
    @Test
    public void TestCheck(){
        
        int number[] = {2,3,4,5,6,45,12,45,1,78,41,99,100,54};
        assertEquals(true, arn.contains(number,6));
        
    }
    @Test 
    public void TestMin(){
        
       
        assertEquals(true, min.Min(1));
        
    }
    @Test
    public void TestMax(){
        
        
        assertEquals(true, max.Max(12));
        
    }
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
