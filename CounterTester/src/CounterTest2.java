
public class CounterTest2 {

	public static void main(String[] args) {
		Counter venue = new Counter();
        
        venue.clickMany(10);
        venue.unclickMany(5);
        int result=venue.getValue();
        System.out.println("Expected anotherVenue:5");
        System.out.println("Actual anotherVenue:"+result);
        
        venue.reset();
        
        venue.clickMany(3);
        venue.unclickMany(4);
        
        result=venue.getValue();
        System.out.println("Expected anotherVenue:-1");
        System.out.println("Actual anotherVenue:"+result);
        
    }


	}


