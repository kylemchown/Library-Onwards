package library;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Audiobook a = new Audiobook(34, "Twilight");
		Audiobook b = new Audiobook(53, "Shiver");
		Audiobook c = new Audiobook(72, "Awoken");
		Book d = new Book(172, "50 Shades of Grey");
		Map e = new Map(50, "Map of Erf");
		
		
		
		ArrayList<Item> abs = new ArrayList<Item>();
		abs.add(a);
		abs.add(d);
		abs.add(b);
		abs.add(e);
		abs.add(c);
		
		/*for(Item i : abs) {
			if(i instanceof Audiobook){
				Audiobook audio = (Audiobook) i;
				System.out.println("" + audio.getId() + ": " + audio.getMinutes() + " minutes");
			}
			if(i instanceof Book) {
				Book book = (Book) i;
				System.out.println("" + book.getId() + ": " + book.getPages() + " pages");
			}
			if(i instanceof Map) {
				Map map = (Map) i;
				System.out.println("" + map.getId() + ": " + map.getSizecm2() + " cm^2");
			}
		}*/
		Library lib = new Library(abs);
		Person abby = new Person("Abby");
		
		System.out.println(a.getCurrentOwner());
		System.out.println(a.isCheckedOut());
		lib.checkout(abby, "Twilight");
		System.out.println(a.getCurrentOwner());
		System.out.println(a.isCheckedOut());
		
	}

}
