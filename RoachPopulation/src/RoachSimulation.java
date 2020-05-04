
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoachPopulation bugs = new RoachPopulation(10);
		double x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Initial Roach population is %3.0f", x);
		
		bugs.breed();
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 1 breeding is %3.0f", x);
		
		bugs.spray(.50);
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 1 50 percent spraying is %3.0f", x);
		
		bugs.breed();
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 2 breeding is %3.0f", x);
		
		bugs.spray(.60);
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 2 60 percent spraying is %3.0f", x);
		
		bugs.breed();
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 3 breeding is %3.0f", x);
		
		bugs.spray(.70);
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 3 70 percent spraying is %3.0f", x);
		
		bugs.breed();
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 4 breeding is %3.0f", x);
		
		bugs.spray(.80);
		x = bugs.get_RoachCount();
		System.out.println(" ");
		System.out.printf("The Roach population after cycle 4 80 percent spraying is %3.0f", x);
		

	}

}
