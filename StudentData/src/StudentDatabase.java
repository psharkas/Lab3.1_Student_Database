import java.util.InputMismatchException;
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
		try {
			inputNum = scnr.nextInt();
		} catch(InputMismatchException e) {
			scnr.next();
			System.out.println("You did not enter a number.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You did not enter a number within 1-5.");
		}
		
		System.out.println("Student " + inputNum + " is " + studentName[inputNum-1] + ". What would you like to know about " + studentName[inputNum-1] + "? (enter “hometown” or “age”): ");
		// why do I need this extra scanner new line? stack overflow recommended this and it worked. Can't grab the response without it.
		scnr.nextLine();
		String response = scnr.nextLine();
		
		if (response.equalsIgnoreCase("age")) {
			System.out.println(studentName[inputNum-1] + "is " + studentAge[inputNum-1] + " years old. Would you like to know more? (enter \"yes\" or \"no\"): ");
		}
		else if (response.equalsIgnoreCase("hometown")) {
			System.out.println(studentName[inputNum-1] + " is from " + studentHometown[inputNum-1] + ". Would you like to know more? (enter \"yes\" or \"no\"): ");
		}
		
		

	}

}