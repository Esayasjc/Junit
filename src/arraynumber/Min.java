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
    public boolean Min(int result){
        int number[] = {2,3,4,5,6,12,1};
        Arrays.sort(number);
        if(result==number[0])
        {
            System.out.println("The minimum number in the array is " + number[0]);
            return true;
            
        }
        else
        {
            return false;
        }
        
    }
    
}
