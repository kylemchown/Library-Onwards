package files;

import java.util.ArrayList;


public class Runner {

	public static void main(String[] args) {
		
		
		Person a = new Person("a","aa",1);
		Person b = new Person("b","bb",2);
		Person c = new Person("c","cc",3);
		Person d = new Person("d","dd",4);
		Person e = new Person("e","ee",5);
		Person f = new Person("asd","fgh",123);
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(a);
		personList.add(b);
		personList.add(c);
		personList.add(d);
		personList.add(e);
		personList.add(f);
		
		/*Writer w = new Writer();
		w.writeTo(personList, "C:\\Users\\Admin\\Desktop\\Testo\\names.txt");*/
		
		
		Reader r = new Reader();
		ArrayList<Person> personList2 = r.readFrom("C:\\\\Users\\\\Admin\\\\Desktop\\\\Testo\\\\names.txt");
		for(Person i : personList2) {
			System.out.println(i.getName()); 
		}
		


		
	}

}
