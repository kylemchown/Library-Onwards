package library;

public class Book extends Item {
	private int pages;
	
	Book(int pages, String name){
		super(name);
		this.pages = pages;
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
