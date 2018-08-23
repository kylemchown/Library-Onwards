import java.util.ArrayList;

public class Room {

	private int size;
	
	Room(int size){
		this.size = size;
	}
	
	public int waste(Paint paint){
		int waste = (paint.coverage() - (size % paint.coverage())) / paint.getM2PerLitre();
		return waste;
	}
	
	public int waste(Paint paint, int size){
		int waste = (paint.coverage() - (size % paint.coverage())) / paint.getM2PerLitre();
		return waste;
	}
	
	public String leastWaste(ArrayList<Paint> paints, int size) {
		int min = 9999999;
		int position = 0;
		int current = -1;
		for (Paint i : paints) {
			int waste = waste(i, size);   //add for loop
			current++;
			if(waste<min) {
				min = waste;
				position = current;
			}
		}
		return (paints.get(position)).getName();
	}
	
	public String cheapest(ArrayList<Paint> paints ) {
		float min = 999999999;
		int position = 0;
		int current = -1;
		double s = this.size;
		for (Paint i : paints) {
			double coverage = i.coverage();
			current++;
			int cans = (int) Math.ceil(s / coverage);
			float cost = i.getPrice() * cans;
			if (cost < min) {
				min = cost;
				position = current;
			}
		}
		return (paints.get(position)).getName();
	}
	
	public String cheapest(ArrayList<Paint> paints, int size ) {
		double min = 999999999;
		int position = 0;
		int current = -1;
		double s = size;
		for (Paint i : paints) {
			double coverage = i.coverage();
			current++;
			int cans = (int) Math.ceil(s / coverage);  //Ahhhhhhh doesn't round properly
			float cost = i.getPrice() * cans;
			if (cost < min) {
				min = cost;
				position = current;
			}
		}
		return (paints.get(position)).getName();
	}
	
	
}
