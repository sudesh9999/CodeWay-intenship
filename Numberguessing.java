import java.util.Random;
import java.util.Scanner;

public class Numberguessing {

	public static void main(String[] args) {
		//to get input from user//
		Scanner sc=new Scanner(System.in);
		//random method instance//
		Random rm=new Random();
		//initallize the range//
		int min=1;
		int max=100;
		int attemptsLimt=8;//set the maximum no of attempts allowed//
		int rounds=0;
		int score=0;
		System.out.println("Welcome to The number guessing game!");
		do {
			int generetNumber= rm.nextInt(max - min+1)+min;
			int attempts=0;
			System.out.println("\nRounds" +(rounds+1) +":Guess the number between"  + min +"and"+ max);
		while ( attempts < attemptsLimt ) {
			System.out.println("Enter your guess: ");
			int userGuess = sc.nextInt();
			if(userGuess == generetNumber) {
				System.out.println("Congratulation!you selected the correct no in" +(attempts +1)+"attempts.");
			score += attempts +1;
			break;
			}
			else if(userGuess < generetNumber) {
				System.out.println("it's low! Try again. ");
			}else {
				System.out.println("it's High! Try again.");
			}
			attempts++;
		}
		if(attempts == attemptsLimt) {
			System.out.println("sorry, you have reached maximum no of attempts. The number was:" +generetNumber);
		}
		rounds++;
		System.out.println("Do you want to paly again?(yes/no):");
		String playAgain =sc.next();
		if (!playAgain.equalsIgnoreCase("yes")) {
			break;
		}
		}
		while(true);
		System.out.println("\nGame over! Your Total Score is:" +score+ " points.");
		sc.close();
			}
			}


