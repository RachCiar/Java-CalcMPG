/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileage;

/**
 *
 * @author rciarl8967
 */
import java.util.Scanner;

public class Mileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  double milesDriven;
  double gallons;
  double milesPerGallon;
 
          
  Scanner keyboard = new Scanner(System.in);
  
  
  //Calculate the miles driven
   System.out.println("This program will calculate mileage. ");
   System.out.println();
   
   //Display number of miles driven
   System.out.println("Please input the number of miles driven: ");
   milesDriven = keyboard.nextDouble();
   System.out.println();
   
   //Display how many gallons used
   System.out.println("How many gallons did you use? ");
   gallons = keyboard.nextDouble();
   System.out.println();
   
   //Calculate the miles per gallon
   milesPerGallon = milesDriven/gallons;
   System.out.println("The total miles per gallon are: " + milesPerGallon);
   System.out.println();
   
   
   
   
    }
    
}
