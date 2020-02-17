import java.util.Scanner;


public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the information for the regular car: ");
		String regularCarInfo = scan.nextLine();
		System.out.println("Enter the information for the hybrid car: ");
		String hybridCarInfo = scan.nextLine();
		System.out.println("Enter the miles traveled in a year: ");
		double milesTraveledPerYear = scan.nextDouble();
		System.out.println("Enter the cost per gallon of gas: ");
		double costPerGallon = scan.nextDouble();
		
		//Calculating the cumulative cost of each car for year one
		double yearOneRegularCost = (int)(((milesTraveledPerYear / Integer.parseInt(regularCarInfo.substring(21,23)))) * (costPerGallon)) + (Integer.parseInt(regularCarInfo.substring(15,20)));
		double yearOneHybridCost = (int)(((milesTraveledPerYear / Integer.parseInt(hybridCarInfo.substring(19,21)))) * (costPerGallon)) + (Integer.parseInt(hybridCarInfo.substring(13,18)));
		System.out.println("Cost to own "+regularCarInfo.substring(0, 14)+" after year 1: "+yearOneRegularCost+" for "+hybridCarInfo.substring(0, 12)+" : "+yearOneHybridCost);
		
		//Calculating the cumulative cost of each car for year Two
		double yearTwoRegularCost = 2 * (int)(((milesTraveledPerYear / Integer.parseInt(regularCarInfo.substring(21,23)))) * (costPerGallon)) + (Integer.parseInt(regularCarInfo.substring(15,20)));
		double yearTwoHybridCost = 2 * (int)(((milesTraveledPerYear / Integer.parseInt(hybridCarInfo.substring(19,21)))) * (costPerGallon)) + (Integer.parseInt(hybridCarInfo.substring(13,18)));
		System.out.println("Cost to own "+regularCarInfo.substring(0, 14)+" after year 2: "+yearTwoRegularCost+" for "+hybridCarInfo.substring(0, 12)+" : "+yearTwoHybridCost);
		
		//Calculating the cumulative cost of each car for year Three
		double yearThreeRegularCost = 3 * (int)(((milesTraveledPerYear / Integer.parseInt(regularCarInfo.substring(21,23)))) * (costPerGallon)) + (Integer.parseInt(regularCarInfo.substring(15,20)));
		double yearThreeHybridCost = 3 * (int)(((milesTraveledPerYear / Integer.parseInt(hybridCarInfo.substring(19,21)))) * (costPerGallon)) + (Integer.parseInt(hybridCarInfo.substring(13,18)));
		System.out.println("Cost to own "+regularCarInfo.substring(0, 14)+" after year 3: "+yearThreeRegularCost+" for "+hybridCarInfo.substring(0, 12)+" : "+yearThreeHybridCost);
		
		//Calculating the cumulative cost of each car for year Four
		double yearFourRegularCost = 4 * (int)(((milesTraveledPerYear / Integer.parseInt(regularCarInfo.substring(21,23)))) * (costPerGallon)) + (Integer.parseInt(regularCarInfo.substring(15,20)));
		double yearFourHybridCost = 4 * (int)(((milesTraveledPerYear / Integer.parseInt(hybridCarInfo.substring(19,21)))) * (costPerGallon)) + (Integer.parseInt(hybridCarInfo.substring(13,18)));
		System.out.println("Cost to own "+regularCarInfo.substring(0, 14)+" after year 4: "+yearFourRegularCost+" for "+hybridCarInfo.substring(0, 12)+" : "+yearFourHybridCost);
				
		//Calculating the cumulative cost of each car for year Five
		double yearFiveRegularCost = 5 * (int)(((milesTraveledPerYear / Integer.parseInt(regularCarInfo.substring(21,23)))) * (costPerGallon)) + (Integer.parseInt(regularCarInfo.substring(15,20)));
		double yearFiveHybridCost = 5 * (int)(((milesTraveledPerYear / Integer.parseInt(hybridCarInfo.substring(19,21)))) * (costPerGallon)) + (Integer.parseInt(hybridCarInfo.substring(13,18)));
		System.out.println("Cost to own "+regularCarInfo.substring(0, 14)+" after year 5: "+yearFiveRegularCost+" for "+hybridCarInfo.substring(0, 12)+" : "+yearFiveHybridCost);
		
		if (yearFiveHybridCost < yearFiveRegularCost)
			System.out.println("The Toyota Prius pays back after 5 years");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
