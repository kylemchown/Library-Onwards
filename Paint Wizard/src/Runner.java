import java.util.ArrayList;

public class Runner {

	// 'Waste' here means the volume of paint left
	
	public static void main(String[] args) {
		
		Paint cheap = new Paint("Cheap", 20, 10, 19.99f);
		Paint average = new Paint("Average", 15, 11, 17.99f);
		Paint deluxe = new Paint("Deluxe", 10, 20, 25f);
		
		ArrayList<Paint> paintList = new ArrayList<>();
		paintList.add(cheap);
		paintList.add(average);
		paintList.add(deluxe);
		
		Room room1 = new Room(300);
		
		System.out.println(room1.waste(cheap));
		System.out.println(room1.waste(cheap, 450));
		
		
		System.out.println(room1.cheapest(paintList, 170));
		System.out.println(room1.leastWaste(paintList, 170));
		
	}

}
