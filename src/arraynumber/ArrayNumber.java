/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Esayas
 */
public class ArrayNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here4
        int number[] = {2,3,4,5,6,45,12,45,1,78,41,99,10,54};
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Insert any number: ");
        int a = scan.nextInt();
        
        if(contains(number, a)){
            System.out.println("Number " + a + " is on the array");
        }else
            System.out.println(a + " is not on the array");
        
        // max value found 
        
//        Min min = new Min();
//        min.Min(2);
//        
//        Max max = new Max();
//        max.Max(1);
        
        
        }
    

    public static boolean contains(int[] number, int a) {
              
        boolean result = false;
        
        for (int i : number){
            if(i == a){
                result = true;
                break;
            }
        }
        return result;
    }

    
}
    

// Group 5 Section 1
//1.Danait Tadesse 				eitm/ur117599/09 
//2.Esayas Mulatu 				eitm/ur117667/09
//3.Natnael Aschalew				eitm/ur117589/09 
//4.Natnael serse				eitm/ur117678/09
//5.Shishay berhe 				eitm/ur117493/09

