package library;

public abstract class Item {
	private int id;
	private boolean checkedOut = false;
	private int currentOwner = 0;
	private String name;
	
	public static int nextid = 1;

	Item(String name){
		setId(Item.nextid);
		Item.nextid++;
		setName(name);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public int getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(int currentOwner) {
		this.currentOwner = currentOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
