package library;
import java.util.ArrayList;

public class Library {
	private ArrayList<Item> itemList;
	
	Library(ArrayList<Item> itemList){
		this.itemList = itemList;
	}
	
	public void checkout(Person person, String itemname) {
		for (Item i : itemList) {
			if (i.getName() == itemname) {
				i.setCheckedOut(true);
				i.setCurrentOwner(person.getId());
			}
		}
	}
}
