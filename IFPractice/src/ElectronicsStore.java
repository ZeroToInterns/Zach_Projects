
public class ElectronicsStore {

	public static double getPrice(String item, boolean isDamaged) {
		double price;  
		if (item == "Ipad") {
			price = 350.99; 
			}
		else if (item == "Macbook") { 
			price = 1100.00;
			}
		else if (item == "Iphone") { 
			price = 600.00;
			}
		else if (item == "TV") {
			price = 1525.30;
			}
		else if (item == "Charger") {
			price = 15.75;
			}	
		else {
			price = 0.00;
		}
		
		if (isDamaged) {
			price = price/2;
		}
		else {
		}
		return price;
	}
}
