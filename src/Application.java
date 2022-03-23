import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[]args) {
		calculateOperatorCount(new File("dist/Deneme.java"));		
	}
	
	public static void calculateOperatorCount(File myFile) {		
		Scanner myReader = null;
		
		if(myFile.canRead()) {						
				
			try {
				myReader = new Scanner(myFile);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			}
			
			FlagHandler flagHandler=new FlagHandler();
			Operators operators =new Operators();
			work(myReader,flagHandler,operators);
			
			System.out.println("Single Operator: "+ operators.getSingleOperators() );
			System.out.println("Couple Operator: "+ operators.getCoupleOperators() );
			System.out.println("Numeric Operator: "+ operators.getNumericOperators() );
			System.out.println("Relational Operator: "+ operators.getRelationalOperators() );
			System.out.println("Logical Operator: "+ operators.getLogicalOperators() );
			
		}
	}

	public static void work(Scanner myReader,FlagHandler flagHandler,Operators operators){		
		ReduceService reduceService = new ReduceService();		

		while(myReader.hasNextLine()) {
			String line = myReader.nextLine();			
			//Kontrol Edilecek dosya
			String newLine = reduceService.reduceFile(line, flagHandler);
			operators.controlLine(newLine);	
		
			System.out.println(newLine);
 		}		 

	}
	
}

/*

	String data = "Ahmet Koştu.";
	System.out.println(data.indexOf("/*"));
	
	=> OUTPUT = -1 
*/

