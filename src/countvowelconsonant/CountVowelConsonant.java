/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowelconsonant;

import java.util.Scanner;

/**

Java Program to count the total number of vowels and consonants in a string
 *
 * @author Alireza Hassanpour
 */
public class CountVowelConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vCount = 0, cCount = 0;   
       Scanner sc=  new Scanner(System.in);
        System.out.println("Enter charecter you want to test:");
        String str = sc.next();
        str = str.toLowerCase();    
         for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vCount++;    
            }    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);  
    }
    
}
