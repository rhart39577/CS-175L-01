
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ROW = 4;
		final int COLUMN = 4;
		
	
		int[][] counts = {
				
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1},
				{0,0,0,1},
				
				
		};
		System.out.println("The sum of the second row is: " +counts[0][1]);
		
		
		System.out.println("Sum of third colum is: ");
		
		for (int i=0; i < counts[0].length; i++)
		{
			int sum = 0;
			
			for(int j = 0; j < counts.length; j++)
			{
				sum = sum + counts[j][2];
			}
			System.out.printf("%4d", sum);
			System.out.println("    ");
		}
		
		System.out.println("Sum of all elements is: ");
		
		for (int i=0; i < counts[0].length; i++)
		{
			int sum = 0;
			
			for(int j = 0; j < counts.length; j++)
			{
				sum = sum + counts[j][i];
			}
			System.out.printf("%4d", sum);
		}

		}
		}


