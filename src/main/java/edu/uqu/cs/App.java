package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/

    public static void main(String [] args) {
    int numbers=1;
    twisters(numbers);
      Scanner keybord=new Scanner(System.in);
    String str=keybord.nextLine();
    phoneKeypad(str);
    }
public static void twisters(int numbers){ 
     
for(;numbers<=110;numbers++){
if(numbers%2==0){
System.out.print("Tweetle");
if(numbers%4==0){
  System.out.print("Beetle");
  }
if(numbers%6==0){
      System.out.print("Poodle");
      }
    
}
else
{
  System.out.print(numbers);
}
 if(numbers%11==0){
   System.out.print("\n");
 }
}
}
public static void phoneKeypad(String str){
   for(int index=0;index<str.length();index++){
      String capital=str.toUpperCase();
       switch(capital.charAt(index)){
      case 'A':System.out.print("2");
       break;
      case 'B':System.out.print("2");
       break;
      case 'C':System.out.print("2");
      break;
      case 'D':System.out.print("3");
       break;
      case 'E':System.out.print("3");
       break;
      case 'F':System.out.print("3");
      break;
      case 'G':System.out.print("4");
       break;
      case 'H':System.out.print("4");
       break;
      case 'I':System.out.print("4");
      break;
      case 'J':System.out.print("5");
       break;
      case 'K':System.out.print("5");
       break;
      case 'L':System.out.print("5");
      break;
      case 'M':System.out.print("6");
       break;
      case 'N':System.out.print("6");
       break;
      case 'O':System.out.print("6");
      break;
      case 'P':System.out.print("7");
       break;
      case 'Q':System.out.print("7");
       break;
      case 'R':System.out.print("7");
       break;
      case 'S':System.out.print("7");
      break;
      case 'T':System.out.print("8");
       break;
      case 'U':System.out.print("8");
       break;
      case 'V':System.out.print("8");
      break;
      case 'W':System.out.print("9");
       break;
      case 'X':System.out.print("9");
       break;
      case 'Y':System.out.print("9");
       break;
      case 'Z':System.out.print("9");
      break;   
}
}
}
}

