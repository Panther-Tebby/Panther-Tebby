/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.calculator;

import java.util.*;


/**
 *
 * @author tebog
 */
public class FactorialCalculator {
    
    /**
     * A recursive function named calculate Factorial
     * Takes an integer parameter, n.
     * Implementing the calculate Factorial function to calculate and return the factorial of n
    
    */
    
    //Recursive function to calculate and return the factorial of n
   public static int calculateFactorial(int n){
       
        if (n == 0){
        return 1;
        }else{
        return n * calculateFactorial(n-1);
        }
    
    }

   
     public static void main(String[] args) {
         // Prompt the user for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        
        
        try {
            long factorial;
            //Read the input as an integer
             int n = input.nextInt();
             
             //Provide If-Statement to catch the error
            if( n < 0){
                System.out.println("The factorial of a negative number is undefined.");
            }else{
                //call the function to calculate the factorial
            factorial = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is " + factorial);
            }
        }catch( Exception e){
        System.out.println("Invalid input. Please enter a number that is not negative.");
        }finally{
        input.close();
        }
        
        
    }
    
}
