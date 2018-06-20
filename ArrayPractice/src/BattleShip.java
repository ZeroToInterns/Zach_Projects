
public class BattleShip {
	
	private boolean[][] grid;

	public BattleShip() {
		grid = new boolean[10][10];
	}
	
	//places 1 unit fishing boat at location
	public void placeFishingBoat(int rowNum, int columnNum) {
		grid[rowNum][columnNum] = true;
		}
	
	public void printGrid() {
		for (int i = 0; i < grid.length; i++ ) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	
	public void placeCarrierBoat(int rowNum, int columnNum, String orientation) {
		try {
			if (orientation.equals("horizontal")) {
				for(int i = 0; i< 3; i++) {
					grid[rowNum][columnNum + i] = true;
				}
			}
			else if (orientation.equals("vertical")) {
				for(int i = 0; i< 3; i++) {
					grid[rowNum + i][columnNum] = true;
				}
			}
			else {
				System.out.println("Error");
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Cannot place boat at that spot");
		}
	}
	
	public void attackBoat(int rowNum, int columnNum) {
		if (grid[columnNum][rowNum]) {
			System.out.println("Hit");
		}
		else {
			System.out.println("Miss");
		}
	}
}

	
	

