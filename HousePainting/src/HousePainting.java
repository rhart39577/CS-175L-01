import java.util.Scanner; 
public class HousePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//input all variables necessary for calculations
		System.out.print("Enter the length of the house: ");
		int houseLength = scan.nextInt();
		System.out.print("Enter the width of the house: ");
		int houseWidth = scan.nextInt();
		System.out.print("Enter the height of the house: ");
		int houseHeight = scan.nextInt();
		
		System.out.print("Enter the number of windows on the house: ");
		int houseWindows = scan.nextInt();
		System.out.print("Enter the length of window: ");
		int houseWindowLength = scan.nextInt();
		System.out.print("Enter the width of window: ");
		int houseWindowWidth = scan.nextInt();
		
		System.out.print("Enter the number of doors on the house: ");
		int houseDoors = scan.nextInt();
		System.out.print("Enter the length of door: ");
		int houseDoorLength = scan.nextInt();
		System.out.print("Enter the width of door: ");
		int houseDoorWidth = scan.nextInt();
		
		System.out.print("Enter the cost the painter charges per SqFT: ");
		int housePainterChargesSqFT = scan.nextInt();
		
		//Print the SqFT
		int houseSqFT = 2*(houseLength * houseWidth);
		System.out.println("Expecting 1200");
		System.out.println("The house SqFT is " + houseSqFT);
		
		//Print the Peak SqFT
		double housePeakSqFT = 2*((houseLength * houseWidth) + .5*(houseLength * (houseHeight - houseWidth)));
		System.out.println("The house peak SqFT is " + housePeakSqFT);
		
		//Print the SqFT +  Peak SqFT
		int realHouseSqFT = (int)(houseSqFT + housePeakSqFT);
		System.out.println("The real house SqFT is " + realHouseSqFT);
		
		//Print Window and Door Dimensions
		int houseWindowDimensions = (houseWindows*houseWindowLength*houseWindowWidth);
		System.out.println("The window dimensions of the house are " + houseWindowDimensions);
		int houseDoorDimensions = (houseDoors*houseDoorLength*houseDoorWidth);
		System.out.println("The door dimensions of the house are " + houseDoorDimensions); 
		
		//Print SqFT to Paint
		int paintSqFT = realHouseSqFT - (houseWindowDimensions + houseDoorDimensions);
		System.out.println("The SqFT to paint the house is " + paintSqFT);
		
		//Print Cost to paint house
		int housePaintCost = paintSqFT * housePainterChargesSqFT;
		System.out.println("The amount it cost to paint the house is " + housePaintCost);
	}

}
