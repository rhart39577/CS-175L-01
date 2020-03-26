import java.util.Scanner;
public class CalculateMyGPA {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("How many classes did you take this semester? ");
		int classes = scan.nextInt();
		double GP1 = 0;
		double GP2 = 0;
		double GP3 = 0;
		double GP4 = 0;
		double GP5 = 0;
		double GPA = 0;
		double credits;
		double totalCredits = 15;
		final String QUIT = "0";
		String info = "";
		String infoArr[]= {""};
		double grade = 0;
		
		for (int i = 1; i <= classes; i++) {
			System.out.print("Enter course " + (i)+ " information seperated by commas (title,credits,letter grade) or type \"Q\" to quit: ");
			info = input.nextLine();
			infoArr = info.split(",");
		
			if (infoArr[0].equals(QUIT)) {
				break;
				}
			else if (infoArr[2].equals("A")) {
				grade = 4;
				}
			else if (infoArr[2].equals("A-")) {
				grade = 3.70;
				}
			else if (infoArr[2].equals("B+")) {
				grade = 3.33;
				}
			else if (infoArr[2].equals("B")) {
				grade = 3.00;
				}
			else if (infoArr[2].equals("B-")) {
				grade = 2.70;
				}
			else if (infoArr[2].equals("C+")) {
				grade = 2.33;
				}
			else if (infoArr[2].equals("C")) {
				grade = 2.00;
				}
			else if (infoArr[2].equals("C-")) {
				grade = 1.70;
				}
			else if (infoArr[2].equals("D+")) {
				grade = 1.33;
				}
			else if (infoArr[2].equals("D")) {
				grade = 1.00;
				}
			else if (infoArr[2].equals("D-")) {
				grade = 0.7;
				}
			else if (infoArr[2].equals("F")) {
				grade = 0;
				}
			credits = Double.parseDouble(infoArr[1]);
			
			System.out.println("Course: " + infoArr[0] + "  Credits: " + infoArr[1] + "  Grade: " + infoArr[2]);
			if (i == 1) {
				GP1 = credits * grade;
				}
			else if (i == 2) {
				GP2 = credits * grade;
				}
			else if (i == 3) {
				GP3 = credits * grade;
				}
			else if (i == 4) {
				GP4 = credits * grade;
				}
			else if (i == 5) {
				GP5 = credits * grade;
				}

				}
			GPA = (GP1 +  GP2 + GP3 +  GP4 +  GP5)/ totalCredits;
			System.out.printf("GPA: %.2f", GPA);
				}

				}
		
		
		
		
		
		
		
	
		
		
		
		

