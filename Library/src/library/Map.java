package library;

public class Map extends Item {
	private int sizecm2;
	
	Map(int sizecm2, String name){
		super(name);
		this.sizecm2 = sizecm2;
	}

	public int getSizecm2() {
		return sizecm2;
	}

	public void setSizecm2(int sizecm2) {
		this.sizecm2 = sizecm2;
	}
	
	
}
