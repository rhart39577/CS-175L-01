import java.util.Scanner;


public class GroceryCalculationDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double total = 0;	
			System.out.print("Please enter the cost of your groceries or '0' to quit: ");
			while(scan.hasNextDouble()) 
			{
				double groceryCost = scan.nextDouble();
				if (groceryCost == 0)
				{
					break;
				}
				if (groceryCost < 10)
				{
					System.out.println("You are not eligible for a coupon this time.");
					
				}
				else if ( groceryCost <= 60)
				{
					System.out.println("You win a discount coupon of $ " +( groceryCost * .08)+ ". (8% of your purchase)");
				}
				else if ( groceryCost <= 150)
				{
					System.out.println("You win a discount coupon of $ " +( groceryCost * .10) + ". (10% of your purchase)");
				}
				else if (groceryCost <= 210)
				{
					System.out.println("You win a discount coupon of $ " +( groceryCost * .12)+ ". (12% of your purchase)");
				}
				else 
				{
					System.out.println("You win a discount coupon of $ " +( groceryCost * .14)+ ". (14% of your purchase)");
				}
				System.out.print("Please enter the cost of your groceries or '0' to quit: ");
				total = total+groceryCost;
			}
			
		}	
			
		}
			
			
		
		
		

	


