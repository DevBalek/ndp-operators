import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[]args) {
		//readFile();
		
		
		
	}
	
	static void readFile() {
		File myFile =new File("dist/Deneme.java");
		Scanner myReader = null;
				
		
		if(myFile.canRead()) {
			
			try {
				myReader = new Scanner(myFile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
			
		}
	}
	
}

/*

	String data = "Ahmet Koştu.";
	System.out.println(data.indexOf("/*"));
	
	=> OUTPUT = -1 
*/

