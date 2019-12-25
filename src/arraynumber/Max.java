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
public class Max {
    
   
    public  boolean Max(int result){
        
    double max = Double.NEGATIVE_INFINITY;
    int number[] = {2,3,4,5,6,12,1};
//        for(int i = 0;i < number.length;i++){
//            if(number[i] > max)
//                max = number[i];
//            
//        }
      Arrays.sort(number);
      if(result==number[number.length-1])
      {
          System.out.println("The maximum number on the array is " +number[number.length-1]);
          return true;
      }
        else
      {
          return false;
      }
        
        
    }
    
}
