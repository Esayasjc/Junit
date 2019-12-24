/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumber;

/**
 *
 * @author Esayas
 */
public class Max {
    
   
    public static boolean Max(int [] number){
        
    double max = Double.NEGATIVE_INFINITY;
        for(int i = 0;i < number.length;i++){
            if(number[i] > max)
                max = number[i];
            
        }
        
        System.out.println("The maximum number on the array is " + max);
        return true;
    }
    
}
