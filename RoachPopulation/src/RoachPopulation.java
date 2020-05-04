
public class RoachPopulation {
private double countRoach;

    public RoachPopulation(double num) {

        countRoach = num;

    }

    public double get_RoachCount() {

        return countRoach;

    }

    public double breed() {

        return countRoach = countRoach * 2;

    }

    public double spray(double d) {
		
    	
    	return countRoach = countRoach / 3;

    }

    public String toString() {

        return "Roach Count = " + countRoach;

    }

}