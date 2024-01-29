import java.util.Scanner;

class Ifchecking {
	public static void main(String[] args) {
		
		//Created Scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("---Voter Eligibility Test---");

		System.out.println("Enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		scanner.nextLine();

		System.out.println("");
		System.out.println("The answer is checking.......");
		System.out.println("");

		if(age < 18 ) {
			int remAge = 18 - age;
			System.out.println("Sorry " + name + ", \nYou are " + age + " years old. You can't able to Vote. \nYou need " + remAge + " more age to get the eligibility for the voting.");
		} else {
			int extAge = age - 18;
			System.out.println("Hello " + name + ",\nYou are " + age + " years old. You can Vote. \nYou are " + extAge + " year old from the voting eligibilty age.");
		}

		System.out.println("");
		System.out.print("---Submit your 3 most issues one by one---");
		System.out.println("");
		String storeIssue[] = new String[3];
		
		System.out.println("\nEnter your 1st Issue: ");
		storeIssue[0] = scanner.nextLine();
		
		System.out.println("Enter your 2nd Issue: ");
		storeIssue[1] = scanner.nextLine();

		System.out.println("Enter your 3rd Issue: ");
		storeIssue[2] = scanner.nextLine();

		System.out.println("");
		System.out.println("Please confirm Once again by Yes or No : ");
		for(int i = 0; i<storeIssue.length; i++){
			System.out.println(storeIssue[i] );
		}

		System.out.println("");
		System.out.println("Confirm by y or n: ");
		String confirmation = scanner.nextLine();

		if(confirmation.equals("y") || confirmation.equals("Y") || confirmation.equals("yes")) {
			System.out.println("Thank you for your confirmation.");
		} else if (confirmation.equals("n") || confirmation.equals("N") || confirmation.equals("no")){
			System.out.println("Oh Sorry, can you once again run the code????");
		} else {
			System.out.println("Oh Ohh,, Your data is lost. Confirm by Entering y or n");
		}
	}	
}