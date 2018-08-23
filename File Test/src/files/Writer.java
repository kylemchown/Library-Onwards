package files;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Writer {
	
	public void writeTo(ArrayList<Person> people, String location) {
		BufferedWriter bw = null;
		try {
			
		
		File file = new File(location);
		if (!file.exists()) {
		     file.createNewFile();
		  }
		
		 FileWriter fw = new FileWriter(file);
		 bw = new BufferedWriter(fw);
		 for (Person i: people) {
			 bw.write(i.getName() + "," + i.getJob() + "," + i.getAge());
			 bw.newLine();
		 }
		 System.out.println("File written Successfully");
		}catch (IOException ioe) {
			   ioe.printStackTrace();
		}
		finally {
		    try {
		        bw.close();
		    } catch (IOException h) {
		        h.printStackTrace();
		    }
		}

	}
}
