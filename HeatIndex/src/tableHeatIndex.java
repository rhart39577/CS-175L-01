import java.util.Scanner;
public class tableHeatIndex {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("                      National Weather Index");
		System.out.println("                           	 Heat index");
		System.out.println("Relative                   Temperature(F)");
		System.out.println("Humidity(%)");
		System.out.printf("     ");
		for (int temp = 80; temp<=110;temp=temp+2) 
		{
			System.out.printf("%6d",temp);
		}
		System.out.println();
		System.out.println("____________________________________________________________________________________________________________");
		for (int humid = 40; humid <= 100; humid=humid+5)
		{
			System.out.printf("%3d | ",humid);
			for (int a = 80; a <= 110; a=a+2)
				
				
			{
				int result=(int)(-42.379+(2.04901523*a)+(10.14333127*humid)-(0.22475541*a*humid)-(0.00683783*a*a)-(0.05481717*humid*humid)+(0.00122874*a*a*humid)+(0.00085282*a*humid*humid)-(0.00000199*a*a*humid*humid));
				if (result<=137)
				{
					System.out.printf("%6d",result);
				}
				else
				{
					System.out.printf("%6s"," ");
				}
			}
			System.out.println(); 
		}
		boolean start=true;
		while(start==true)
		{
			System.out.print("Enter temperature or 0 to end: ");
			double input=scan.nextDouble();
			if (input==0)
			{
				start=false;
				System.out.println("The program has ended");
				break;
				
			}
			System.out.print("Enter the relative humidity: ");
			double humidInput=scan.nextDouble();
			
			double resultTwo=(int)(-42.379+(2.04901523*input)+(10.14333127*humidInput)-(0.22475541*input*humidInput)-(0.00683783*input*input)-(0.05481717*humidInput*humidInput)+(0.00122874*input*input*humidInput)+(0.00085282*input*humidInput*humidInput)-(0.00000199*input*input*humidInput*humidInput));
			System.out.println("The THI for a temperature of "+input+" and relative of "+humidInput+" is: "+resultTwo);
			
			if (resultTwo<=90)
			{
				System.out.println("Advisory: Caution");
			}
			else if (resultTwo<105)
			{
				System.out.println("Advisory: Extreme Caution");
			}
			else if (resultTwo<126)
			{
				System.out.println("Advisory: Danger");
			}
			else
			{
				System.out.println("Advisory: Extreme Danger");
			}
			
			
		}
		
	}

}
