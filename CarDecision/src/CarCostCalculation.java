import java.util.Scanner; 
public class CarCostCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Input all variables necessary for calculations of regular and hybrid cars
		System.out.println("Enter the cost of the regular car: ");
		int regularCarCost = scan.nextInt();
		System.out.println("Enter the miles per gallon of the regular car: ");
		int regularMPG = scan.nextInt();
		System.out.println("Enter the cost of the hybrid car: ");
		int hybridCarCost = scan.nextInt();
		System.out.println("Enter the miles per gallon of the hybrid car: ");
		int hybridMPG = scan.nextInt();
		System.out.println("Enter the amount of miles traveled within a year: ");
		int milesTraveled = scan.nextInt();
		System.out.println("Enter the cost of gas per gallon: ");
		double costPerGallon = scan.nextDouble();
		
		//Calculating the cumulative cost of each car for year one
		int yearOneRegular = (int)(((milesTraveled / regularMPG)) * (costPerGallon)) + (regularCarCost);
		System.out.print("Cost to own after year 1 for the regular car: " + yearOneRegular);
		int yearOneHybrid = (int)(((milesTraveled / hybridMPG)) * (costPerGallon)) + (hybridCarCost);
		System.out.println(" " + "for a hybrid car: " + yearOneHybrid);
		
		//Calculating the cumulative cost of each car for year two
		int yearTwoRegular = 2 * (int)(((milesTraveled / regularMPG)) * (costPerGallon)) + (regularCarCost);
		System.out.print("Cost to own after year 2 for the regular car: " + yearTwoRegular);
		int yearTwoHybrid = 2 * (int)(((milesTraveled / hybridMPG)) * (costPerGallon)) + (hybridCarCost);
		System.out.println(" " + "for a hybrid car: " + yearTwoHybrid);
		
		//Calculating the cumulative cost of each car for year three
		int yearThreeRegular = 3 * (int)(((milesTraveled / regularMPG)) * (costPerGallon)) + (regularCarCost);
		System.out.print("Cost to own after year 3 for the regular car: " + yearThreeRegular);
		int yearThreeHybrid = 3 * (int)(((milesTraveled / hybridMPG)) * (costPerGallon)) + (hybridCarCost);
		System.out.println(" " + "for a hybrid car: " + yearThreeHybrid);
		
		//Calculating the cumulative cost of each car for year four
		int yearFourRegular = 4 * (int)(((milesTraveled / regularMPG)) * (costPerGallon)) + (regularCarCost);
		System.out.print("Cost to own after year 4 for the regular car: " + yearFourRegular);
		int yearFourHybrid = 4 * (int)(((milesTraveled / hybridMPG)) * (costPerGallon)) + (hybridCarCost);
		System.out.println(" " + "for a hybrid car: " + yearFourHybrid);
		
		//Calculating the cumulative cost of each car for year five
		int yearFiveRegular = 5 * (int)(((milesTraveled / regularMPG)) * (costPerGallon)) + (regularCarCost);
		System.out.print("Cost to own after year 5 for the regular car: " + yearFiveRegular);
		int yearFiveHybrid = 5 * (int)(((milesTraveled / hybridMPG)) * (costPerGallon)) + (hybridCarCost);
		System.out.println(" " + "for a hybrid car: " + yearFiveHybrid);
		
		//Comparing the cost to own a regular car versus a hybrid car after five years
		if (yearFiveHybrid < yearFiveRegular);
		System.out.println("The hybrid car pays back after 5 years");
		

	}

}
