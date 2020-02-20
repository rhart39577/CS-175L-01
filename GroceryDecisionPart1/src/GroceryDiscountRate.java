import java.util.Scanner;

public class GroceryDiscountRate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		double groceryCost = scan.nextDouble();
		double couponCost1 = (groceryCost * .08);
		double couponCost2 = (groceryCost * .10);
		double couponCost3 = (groceryCost * .12);
		double couponCost4 = (groceryCost * .14);
		{
		if (groceryCost < 10)
			System.out.println("You are not eligible for a coupon this time.");
		
		else if (groceryCost >= 10 && groceryCost <= 60)
			System.out.println("You win a discount of " +couponCost1+ ". (8% of your purchase)");
		
		else if (groceryCost >= 60 && groceryCost <= 150)
			System.out.println("You win a discount of " +couponCost2+ ". (10% of your purchase)");
		
		else if (groceryCost >= 150 && groceryCost <= 210)
			System.out.println("You win a discount of " +couponCost3+ ". (12% of your purchase)");
		
		else 
			System.out.println("You win a discount of " +couponCost4+ ". (14% of your purchase)");
	
		}
	}
	

}
