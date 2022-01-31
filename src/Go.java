import java.util.*;

public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//guessNumber();
		computerGuess2();
		//System.out.println(Math.floor(Math.random()*(16-14)+14));
	}
	
	private static void guessNumber() {
		int number  =  (int) Math.floor(Math.random()*16);
		Scanner input = new Scanner(System.in);
		int guess = 0;
		while (guess != number) {
			System.out.println("Enter you guess (1-15)");
			guess = input.nextInt();

			if (guess > number + 2) {
				System.out.println("too high");
			} else if (guess < number - 2) {
				System.out.println("too low");
			}
			else if (guess != number){
				System.out.println("Close enough");
			}
		}
		System.out.println("nice it's " +number);
	}
	
	private static void computerGuess() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lucky number from 1-15");
		int luckyNumber = input.nextInt();
		int computerGuess = 0;
		while (luckyNumber != computerGuess) {
			computerGuess =  (int) Math.floor(Math.random()*16);
			if (computerGuess > luckyNumber + 2) {
				System.out.println("too high " + computerGuess);
			} else if (computerGuess < luckyNumber - 2) {
				System.out.println("too low " + computerGuess);
			}
			else if (luckyNumber != computerGuess){
				System.out.println("Close enough");
			}
		}
		System.out.println("Your lucky number is " +computerGuess);
	}
	
	private static void computerGuess2() {
		boolean answer = true;
		Scanner input = new Scanner(System.in);
		
		while (answer = true) {
			System.out.println("Game? (Yes/No)");
			String response = input.next();
			if("Yes".toLowerCase().equals(response.toLowerCase())) {
				answer = true;
			}else {
				break;
			}
			System.out.println("Enter your lucky number from 1-15");
			
			int luckyNumber = input.nextInt();
			if (luckyNumber > 15 || luckyNumber < 1) {
				System.out.println("Invalid input");
			}
			else {
				int number[] = { 1, 2, 10, 3, 4, 15, 5, 14, 6, 7, 8, 9, 11, 12, 13 };

				// sorting array asc
				for (int i = 0; i < number.length; i++) {
					int temp = 0;
					for (int j = 0; j < number.length; j++)
						if (number[i] < number[j]) {
							temp = number[i];
							number[i] = number[j];
							number[j] = temp;
						}
				}

				// getting max option
				int maxOption = number[number.length - 1];
				int guess = 0;
				int minOption = number[0];

				while (guess != luckyNumber) {
					guess = (int) Math.floor(Math.random() * ((maxOption + 1) - minOption) + minOption);
					if (guess == luckyNumber) {
						break;
					} else if (guess > luckyNumber) {
						System.out.println("Lower than " + guess);
						maxOption = guess - 1;
					} else {
						System.out.println("greater than " + guess);
						minOption = guess + 1;
					}
				}
				System.out.println("I beat you it's " + guess);
			}
		}
	}
}
