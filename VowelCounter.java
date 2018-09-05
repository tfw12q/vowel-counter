/* 
*   13 from Chapter 5 
*   Wages and commissions
*   Author: Thomas Wheeler
*   Date:   10/16/2017
*   Filename:   VowelCounter.java
*/


//import statements
import java.util.*;    

// class beginning
class  VowelCounter {
   public static void main(String[] args ) { 
      //Declare variables area
      
      Scanner keyboard = new Scanner(System.in); 
      
      int aCount = 0;
      int eCount = 0;
      int iCount = 0;
      int oCount = 0;
      int uCount = 0;
      
      String list[] = {"a","e","i","o","u"};
      int count[] = new int[5];
      
      String test;
      System.out.println("Enter a sentence to count the vowels");
      test = keyboard.nextLine();
      
      for (int i = 0; i < test.length(); i++){
          
          if (test.charAt(i) == 'a' || test.charAt(i) == 'A'){
             aCount++;
          }
          if (test.charAt(i) == 'e' || test.charAt(i) == 'E'){
             eCount++;
          }
          if (test.charAt(i) == 'i' || test.charAt(i) == 'I'){
             iCount++;
          }
          if (test.charAt(i) == 'o' || test.charAt(i) == 'O'){
             oCount++;
          }
          if (test.charAt(i) == 'u' || test.charAt(i) == 'U'){
             uCount++;
          }                              
      } 
      
         count[0] = aCount;
         count[1] = eCount;
         count[2] = iCount;
         count[3] = oCount;
         count[4] = uCount;

      for (int j = 0; j < list.length; j++){
      
         System.out.println("# of " + list[j] + ": " + count[j]);

      }      

   }// end main method 

      
}// end class