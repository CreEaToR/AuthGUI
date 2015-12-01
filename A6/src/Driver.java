
public class Driver {

	public static void main(String args[]){
		
		
		Day day = new Day("Monday");
		System.out.println("Current " + day);
		System.out.println("Next day " + day.nextDay());
		System.out.println("Previous Day " + day.previousDay());
		System.out.println("Calculated day " + day.calculateDay(4));
		
		
	}
}
