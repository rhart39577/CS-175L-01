import java.util.Scanner;

public class GroceryDiscountRate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double couponCost1 = (.08);
		double couponCost2 = (.10);
		double couponCost3 = (.12);
		double couponCost4 = (.14);
		{
			System.out.print("Please enter the cost of your groceries or '0' to quit: ");
			double groceryCost = scan.nextDouble();	
			
		if (groceryCost < 10)
		{
			System.out.println("You are not eligible for a coupon this time.");
		}
		else if (groceryCost <= 60)
		{
			System.out.println("You win a discount of " +(couponCost1 * groceryCost)+ ". (8% of your purchase)");
		}
		else if (groceryCost <= 150)
		{
			System.out.println("You win a discount of " +(couponCost2 * groceryCost)+ ". (10% of your purchase)");
		}
		else if (groceryCost <= 210)
		{
			System.out.println("You win a discount of " +(couponCost3 * groceryCost)+ ". (12% of your purchase)");
		}
		else 
		{
			System.out.println("You win a discount of " +(couponCost4 * groceryCost)+ ". (14% of your purchase)");
		}
		}
	}
	

}
