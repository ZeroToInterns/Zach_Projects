import java.util.*;

public class GroceryList {

	private String[] groceryList;
	
	public GroceryList() {
		groceryList = new String[50];
	}
	
	public GroceryList(int length) {
		groceryList = new String[length];
	}
	
	public GroceryList(String[] list) {
		groceryList = new String[list.length];
		//copying contents of list into groceryList
		for (int i = 0; i < list.length; i++) {
			groceryList[i] = list[i];
		}
	}
	
	public int findLongestItem() {
		int maxLength = 0;
		//loop through entire array
		for(int i = 0; i < groceryList.length;i++) {
			int itemLength = groceryList[i].length();
			if (itemLength > maxLength) {
				maxLength = itemLength;
			}
		}
		return maxLength;
	}
	
	public int findShortestItem() {
		int shortestLength = groceryList[0].length();
		for(int i = 0; i < groceryList.length;i++) {
			int itemLength = groceryList[i].length();
			if(itemLength < shortestLength) {
				shortestLength = itemLength;
			}
		}
		return shortestLength;
	}
}
