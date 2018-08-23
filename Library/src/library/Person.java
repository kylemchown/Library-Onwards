package library;

public class Person {
	private int id;
	private String name;
	public static int peopleID = 1;
	
	Person(String name){
		this.name = name;
		this.id = peopleID;
		peopleID++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
