/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author Desaa3902
 */
public class A5Q1UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        // make a scanner

        Scanner input = new Scanner(System.in);

        // make a loop to keep repeating the translator


        while (true) {
            // ask the user for a word to translate
            System.out.println(" enter a word to translate to ubbi dubbi ");

            // make a string to store the word the user types in

            String Word = input.nextLine();

            //sanitize the input so no upper case letters will be given

            Word = Word.toLowerCase();
              
                      String TransWord = " " + Word;
           
                               int length = TransWord.length();
                         
              // make a for loop to continue looking for vowels 
              for (int position = 0; position < length; position++) {

                    // look for a vowel in the word the user typed in
                    if (TransWord.charAt(position) == 'a'
                     || TransWord.charAt(position) == 'e'
                     || TransWord.charAt(position) == 'i'
                     || TransWord.charAt(position) == 'o'
                     || TransWord.charAt(position) == 'u') { 

         
                 if (!(TransWord.charAt( position -1) == 'a'
                   || TransWord.charAt(position -1) == 'e'
                   || TransWord.charAt(position -1) == 'i'
                   || TransWord.charAt(position -1) == 'o'
                   || TransWord.charAt(position -1) == 'u')) {
                      
 
             // break the word at the vowel and add a ub to it
  
                       
                        String start = TransWord.substring(0, position);
                        String end = TransWord.substring(position);
                        TransWord = start + "ub" + end;
                    // show the user their translated word  
                
                        
                        System.out.println( Word + " In ubbi dubbi is " + TransWord);
                        position = position +2;
            } 
           }
          }
         }
        }
}