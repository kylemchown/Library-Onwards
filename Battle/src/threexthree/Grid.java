package threexthree;
//import java.util.Arrays;

public class Grid {
	private String[][] grid;
	
	/*Grid(){
		String[]  rows = {"e","e","e"};
		String[][] cols = {rows,rows,rows};
		this.grid = cols;
	}*/
	Grid(){
		String[] col1 = {"e", "e","e"};
		String[] col2 = {"e","e","e"};
		String[] col3 = {"e","e","e"};
		String[][] rows = {col1, col2, col3};
		this.grid = rows;
	}
	

	public String[][] getGrid() {
		return grid;
	}

	public void setGrid(String[][] grid) {
		this.grid = grid;
	}
	
	public void addShip(Ship ship, int col, int row, boolean horiz) {
		int length = ship.getLength();
		if(horiz && col-1+length > grid[0].length) {
			System.out.println("Invalid Position");
		}
		else if(row-1+length>grid[0].length) {
			System.out.println("Invalid Position");
		}
		
		else if(horiz) {
			for (int i = col - 1; i<col-1+length; i++) {
				grid[row-1][i] = "f";
			}
		}
		else {
			for (int i = row - 1; i<row-1+length; i++)
				grid[i][col-1] = "f";
		}
	}
}
