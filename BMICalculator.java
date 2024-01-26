/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;
import java.util.Scanner;

/**
 *
 * @author tebog
 */
public class BMICalculator{

    
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user for input
        System.out.print("Please enter weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Please enter height in Metres: ");
        double height = input.nextDouble();
        
        //declare the constants
        final double kilo_per_pound = 0.45359;
        final double meters_per_inch = 0.0254;
        
        
        //Calculate the bmi
       double bmi= calculateBMI(weight, height);
       
       //Interpret BMI category
       String category = interpretBMI(bmi);
       
       //Display the result
       System.out.printf("Your BMI is: %.2f%n", bmi);
       System.out.println("Category: " + category);
       
       //Close the Scanner
        input.close();
    }
    //Create a function to calculate the BMI
    public static double calculateBMI(double weight, double height){
    //Calculate BMI
    double bmi = weight/(height*height);
    return bmi;
    }
    
    //Create interpreter to interpret the bmi category
    public static String interpretBMI(double bmi){
    //Interpret BMI category
     if (bmi < 18.5){
            return ("Underweight! Try eating more or involve a health practitioner");
        }else if (bmi >= 18.5 && bmi >= 24.9){
           return ("Healthy! Keep it up, so proud of you.");
        }else if(bmi >= 25 && bmi >= 29.9){
           return ("Overweight! Try dieting and few exercises. Alternatively you can consult a doctor.");
        }else if(bmi >=30 && bmi >=39.9){
           return ("Obesity! Go and see a medical doctor, they will know how to help you in this case.");
        }else if (bmi >= 40){
            return("Severe obesity!My advice to you is to get immediate help as in now.");
         }else{
            return("Enter a valid input!");
     }
    
    }
    
}
