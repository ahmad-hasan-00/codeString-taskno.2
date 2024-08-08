import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class GuessTheNumber {
     public static void main (String[] args) {
    	 Scanner scanner= new Scanner(System.in);
    	 Random random = new Random();
    	 int minRange =1;  //minimum range of the number
    	 int maxRange=1000;//maximum range of the number
    	 int attemptsLimit=5;//limits of attempts
    	 int score =0;//score acheived by the user
    	 /**
    	  * Operations for random number
    	  */
    	 System.out.println("Welcome to Guess The Number Game!");
     
    	 //while loop
     while(true) {
    	 int randomnumber =random.nextInt(maxRange-minRange+1)+minRange;
    	 System.out.println("I am thinking of a number Between "+minRange+" And "+maxRange);
         System.out.println("You have"+attemptsLimit+"attempts to guess it.");
     
         //for loop inside while loop for Operations of attempts
         for (int attempt=1;attempt<=attemptsLimit;attempt++) {
        	 System.out.println("attempt"+attempt+"Enter your GUess:");
        	 int userGuesss=scanner.nextInt();
        	 
        	 if(userGuesss==randomnumber) {
        		 System.out.println("Coungratulations! You Guessed the number.");
        		 score+= (attemptsLimit-attempt+1)*10; //score Calculation
        		 break;
        	 }
        	 else if(userGuesss<randomnumber) {
        	  System.out.println("The NUmber is Higher.");	 
        	 }
        	 else {
        		System.out.println("The Number is Lower."); 
        	 }
        	 if(attempt== attemptsLimit) {
        		 System.out.println("Sorry, you'have run out of attempts. The correct Number was:"+randomnumber);
        	 }
            }
         //for loop End
         /**
          * Operations for score of The User
          */
         System.out.println("Your Score:"+ score);
         System.out.println("Do YOu want to play again?(yes/no):");
         String playAgain=scanner.next();
         //code if User wants to play again
         if (!playAgain.equalsIgnoreCase("yes")) {
        	 System.out.println("Thanks for playing!");
        	 break;
        	 
         }
       }
     }
}
