import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		String[] studentName = {"Naruto Uzumaki", "Sasuke Uchiha", "Itachi Uchiha", "Kakashi Hatake", "Minato Namikaze"};
		String[] studentHometown = {"Detroit, MI", "West Bloomfield, MI", "West Bloomfield, MI", "Troy, MI", "Sterling Heights, MI"};
		int[] studentAge = {22, 21,27, 35, 38};
		
		int inputNum = 0;
		System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-5): ");
		
		boolean cont1 = true;
		boolean cont2 = true;
		
		do {
			try {
				inputNum = scnr.nextInt();
			} catch(InputMismatchException e) {
				scnr.next();
			} 
			
			try {
				System.out.println("Student " + inputNum + " is " + studentName[inputNum-1] + ". What would you like to know about " + studentName[inputNum-1] + "? (enter “hometown” or “age”): ");
				scnr.nextLine();
				cont1 = false;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("You did not enter a number within 1-5. Please try again");
			}
		}while(cont1);

		String response = scnr.nextLine();
		
		do {
			try {
				if (response.equalsIgnoreCase("age")) {
					System.out.println(studentName[inputNum-1] + "is " + studentAge[inputNum-1] + " years old. Would you like to know more? (enter \"yes\" or \"no\"): ");
					String response2 = scnr.nextLine();
					
					boolean moreInfoValidation = true;
					do {
						if (response2.equalsIgnoreCase("no")) {
							cont2 = false;
							moreInfoValidation = false;
							System.out.println("Thanks!");
						}
						else if(response2.equalsIgnoreCase("yes")) {
							System.out.println("What would you like to know, \"hometown\" or \"age\" ?");
							response = scnr.nextLine();
							moreInfoValidation = false;
						}
						else {
							System.out.println("That was not a valid input. Enter \"yes\" or \"no\".");
							response2 = scnr.nextLine();
						}
					}while(moreInfoValidation);				
				}
				else if (response.equalsIgnoreCase("hometown")) {
					System.out.println(studentName[inputNum-1] + " is from " + studentHometown[inputNum-1] + ". Would you like to know more? (enter \"yes\" or \"no\"): ");
					String response2 = scnr.nextLine();
					boolean moreInfoValidation = true;
					
					do {
						if (response2.equalsIgnoreCase("no")) {
							cont2 = false;
							moreInfoValidation = false;
							System.out.println("Thanks!");
						}
						else if(response2.equalsIgnoreCase("yes")) {
							System.out.println("What would you like to know, \"hometown\" or \"age\" ?");
							response = scnr.nextLine();
							moreInfoValidation = false;
						}
						else {
							System.out.println("That was not a valid input. Enter \"yes\" or \"no\".");
							response2 = scnr.nextLine();
						}
					}while(moreInfoValidation);
				}
				else {
					System.out.println("That data does not exist. Please Try again. (enter \"hometown\" or \"age\") ");
					response = scnr.nextLine();
				}
			}
			catch(InputMismatchException e){
				scnr.next();
				System.out.println("That data does not exist. Please Try again. (enter \"hometown\" or \"age\") ");
			}
		}while (cont2);
	}
}
