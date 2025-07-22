package tasks;
import java.util.Random;
import java.util.Scanner;
public class Random_Number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Random rand=new Random();
	final int no_of_times_guess=15;
	String choice="";
	do {
	int number_to_guess=rand.nextInt(100)+1;
	int guess=0;
	System.out.println("Enter a number to Guess: ");
	for(int i=0;i<no_of_times_guess;i++) {
		
		guess=s.nextInt();
		if(guess==number_to_guess) {
			System.out.println("Number Found!!!");
			break;
			
		}
		else if(guess<number_to_guess) {
			System.out.println("Number is too low Try again!");
		}
		else if(guess>number_to_guess) {
			System.out.println("Number is too high Try again!");
		}
		
	}
	System.out.print("Do you want to play again? (yes/no): ");
    choice = s.next();
    }while(choice.toLowerCase().equals("yes"));
	 System.out.println("Thanks for playing!");
	 s.close();
}
}
