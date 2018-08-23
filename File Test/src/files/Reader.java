package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	
	public ArrayList<Person> readFrom(String location) {
		BufferedReader reader = null;
		ArrayList<Person> peopleList2 = new ArrayList<Person>();

		try {
		    File file = new File(location);
		    reader = new BufferedReader(new FileReader(file));

		    String line;
		    while ((line = reader.readLine()) != null) {
		        String temp = line;
		        String[] parts = temp.split(",");
		        String name = parts[0];
		        String job = parts[1];
		        int age = Integer.parseInt(parts[2]);
		        peopleList2.add(new Person(name, job, age));
		        
		    }

		} catch (IOException l) {
		    l.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException l) {
		        l.printStackTrace();
		    }
		}
		return peopleList2;
	}
}
