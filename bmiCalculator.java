import java.util.Scanner;

public class bmiCalculator {

	public static void main(String[] args) {
		System.out.println("Hello. Welcome to BMI Calculator. What is your name?");
		
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println ("Hello " + name + ". Tell me please, what is your height? Type it please in meters. Do not forget to use dot instead of coma (F.e. - 1.5)");
		
		Scanner scanner1 = new Scanner (System.in);
		String height = scanner1.nextLine();
		System.out.println("So, your height is " + height + ". What is you weight then? Type it please in kilograms.");
		
		Scanner scanner2 = new Scanner (System.in);
		String weight = scanner2.nextLine();
		System.out.println(" Your weight is " + weight + " kilograms, when yours height is " + height + " meters.");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		
		double bmiSummary = (weight1/(height1*height1));
		
		System.out.println("So, your BMI is " + bmiSummary + ".");
		
		if (bmiSummary <25) {
			System.out.println("Your BMI is in good shape :). Remember to take care of your health!");
		} else {
			System.out.println("Your BMI is too big! Think a little about taking some exercises!");
			
		}
		
		

	}

}
