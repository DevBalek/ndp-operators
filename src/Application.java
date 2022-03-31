/** *
* @author Muhammed Furkan Balek | G191210069 | muhammed.balek@ogr.sakarya.edu.tr | github.com/DevBalek 
* @since March 2022
* <p>
	* Uygulama class'ı
* </p> */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[]args) {
		System.out.println("Program running...->\n");
		
		System.out.println("ARGUMENTS TYPE: java -jar application.jar YOUR_DIRECTORY");
		System.out.println("INPUT Arguments ->"+ args[0]+"<- Arguments");
		
		calculateOperatorCount(new File(args[0].toString()));		
		
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
			Lexical operators =new Lexical();
			work(myReader,flagHandler,operators);
			
			System.out.println("\nOperators: ");
			System.out.println("Single Operator: "+ operators.getSingleOperators() );
			System.out.println("Couple Operator: "+ operators.getCoupleOperators() );
			System.out.println("Numeric Operator: "+ operators.getNumericOperators() );
			System.out.println("Relational Operator: "+ operators.getRelationalOperators() );
			System.out.println("Logical Operator: "+ operators.getLogicalOperators() );
			System.out.println("\nOperands: ");
			//System.out.println("Single Operands: " + operators.getSingleOperands());
			//System.out.println("Couple Operands: " + operators.getCoupleOperands());
			System.out.println("Sum of Operands: " + operators.getOperandInfo());
			
			
		}
	}

	public static void work(Scanner myReader,FlagHandler flagHandler,Lexical operators){		
		ReduceService reduceService = new ReduceService();		

		while(myReader.hasNextLine()) {
			String line = myReader.nextLine();			
			//Kontrol Edilecek dosya
			String newLine = reduceService.reduceFile(line, flagHandler);
			operators.controlLine(newLine);	
			
			//System.out.println(newLine);
 		}		 

	}
	
}

/*

	String data = "Ahmet Koştu.";
	System.out.println(data.indexOf("/*"));
	
	=> OUTPUT = -1 
*/

