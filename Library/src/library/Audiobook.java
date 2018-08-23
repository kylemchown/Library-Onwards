package library;

public class Audiobook extends Item {
	private int minutes;
	
	Audiobook(int minutes, String name){
		super(name);
		this.minutes = minutes;
		
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
}
