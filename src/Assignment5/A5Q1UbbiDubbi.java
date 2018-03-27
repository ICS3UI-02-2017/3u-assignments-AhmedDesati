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
            for (int i = 0; i < length; i++) {

                // look for a vowel in the word the user typed in
                if (TransWord.charAt(i) == 'a'
                        || TransWord.charAt(i) == 'e'
                        || TransWord.charAt(i) == 'i'
                        || TransWord.charAt(i) == 'o'
                        || TransWord.charAt(i) == 'u') {

                    // if there is a vowel before a vowel dont add ub to it 
                    if (!(TransWord.charAt(i - 1) == 'a'
                            || TransWord.charAt(i - 1) == 'e'
                            || TransWord.charAt(i - 1) == 'i'
                            || TransWord.charAt(i - 1) == 'o'
                            || TransWord.charAt(i - 1) == 'u')) {


                        // break the word at the vowel and add a ub to it


                        String start = TransWord.substring(0, i);
                        String end = TransWord.substring(i);
                        TransWord = start + "ub" + end;

                        // update the length of the translated word
                        length = TransWord.length();
                        // show the user their translated word  

                        

                        // keep updating the position of the vowel so the system can keep searching for a vowel and add ub before it

                        i = i + 2;


                    }
                }
            }System.out.println(Word + " In ubbi dubbi is " + TransWord);break;
       }
    }
}
