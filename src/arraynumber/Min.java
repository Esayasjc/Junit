/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumber;

import java.util.Arrays;

/**
 *
 * @author Esayas
 */
 public class Min {
    public static int Min(int [] number){
        
        Arrays.sort(number);
        System.out.println("The minimum number in the array is " + number[0]);
        
        return 1;
    }
    
}
