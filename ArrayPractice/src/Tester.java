
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleShip game1 = new BattleShip();
		game1.placeFishingBoat(0, 0);
		game1.placeCarrierBoat(2, 3, "vertical");
		game1.attackBoat(5, 0);
		game1.printGrid();


	}

}
