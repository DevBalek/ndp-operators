import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[]args) {
		readFile();
	}
	
	public static void readFile() {
		File myFile =new File("dist/Deneme.java");
		Scanner myReader = null;
		
		if(myFile.canRead()) {						
				
			try {
				myReader = new Scanner(myFile);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			}
			
			work(myReader);
			
		}
	}

	public static void work(Scanner myReader){
		FlagHandler flagHandler = new FlagHandler();
		ReduceService reduceService = new ReduceService();

		while(myReader.hasNextLine()) {
			String line = myReader.nextLine();
			
			//Kontrol Edilecek dosya
			String newLine = reduceService.reduceFile(line, flagHandler);
			
			System.out.println(newLine);
		}

	}
	
}

/*

	String data = "Ahmet Koştu.";
	System.out.println(data.indexOf("/*"));
	
	=> OUTPUT = -1 
*/

