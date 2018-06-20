import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Red");
		myArrayList.add("Blue");
		myArrayList.add("Red");
		myArrayList.add("Green");
		myArrayList.add("Purple");
		myArrayList.add("Blue");
		myArrayList.add("Orange");
		myArrayList.add("Gold");
		myArrayList.add("Gold");
		myArrayList.add("Red");
		
		insertFirst(myArrayList, "Green");
		addSecondToLast(myArrayList, "Black");
		System.out.println(myArrayList);
		System.out.println(countElements(myArrayList,"Red"));
		replaceColor(myArrayList, "Blue", "White");
		System.out.println(myArrayList);
	}
	
	//insertFirst method inserts a string at the 0th index in Array List
	public static void insertFirst(ArrayList <String> list, String color) {
		list.add(0, color);
	}
	//insertFirst method inserts a string at the second to last index in Array List
	public static void addSecondToLast(ArrayList <String> list, String color) {
		list.add(list.size() - 1, color);
	}
	//countElements method returns number of occurrences of specific color
	public static int countElements(ArrayList <String> list, String color) {
		int count = 0;
		//size is 10 but index is 9
		for (int i = 1; i < list.size(); i++) {
			if (color.equals(list.get(i))) {
				count++;
			}
		}
		return count;
	}
	//replaceColor method replaces all occurrences of color with second color
	public static void replaceColor(ArrayList<String> list, String color, String newColor) {
		for(int i = 1; i < list.size(); i++) {
			if (color.equals(list.get(i))){
				list.set(i, newColor);
			}
		}
	}
	
	
	
}	

