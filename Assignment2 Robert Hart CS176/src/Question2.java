import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		System.out.println("Enter integers ending with Q: ");
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt())
		{
			values.add(in.nextInt());
		}
		
		System.out.println(values);
		
		int largest = values.get(0);
		for(int i=0; i < values.size(); i++)
		{
			if(largest < values. get(i))
			{
				largest = values.get(i);
				
			}
			
		}
		
		System.out.println("Largest of the values is: " +largest); 
		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i));
			if (values.get(i) == largest) {
				System.out.print("<== Largest Value");
			}
			System.out.println();
		}
		int smallest = values.get(0);
		for(int i=0; i < values.size(); i++)
		{
			if(smallest > values. get(i))
			{
				smallest = values.get(i);
				
			}
			
		}
		
		System.out.println("Smallest of the values is: " +smallest); 
		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i));
			if (values.get(i) == smallest) {
				System.out.print("<== Smallest Value");
			}
			System.out.println();
		}
		
	
			
		}
		

	}


