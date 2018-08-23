package threexthree;

public class Runner {

	public static void main(String[] args) {
		
		Grid grid = new Grid();
		for (String[] i : grid.getGrid()) {
			for (String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		Ship ship = new Ship(2);
		grid.addShip(ship, 3, 3, false);
		
		for (String[] i : grid.getGrid()) {
			for (String j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
