/** *
* @author Muhammed Furkan Balek | G191210069 | muhammed.balek@ogr.sakarya.edu.tr | github.com/DevBalek 
* @since March 2022
* <p>
	* Yorum Satırlarını temizleme class'ı
* </p> */

public class ReduceService {	

	String reduceFile(String line, FlagHandler flagHandler) {				
		String str="";

		Boolean tracePrint =false;

		for (int i = 0; i < line.length(); i++) {
			String a = "";
			if(i!=line.length()-1)
				a = String.valueOf(line.charAt(i)) + String.valueOf(line.charAt(i+1));
			else
				a = String.valueOf(line.charAt(i));

			if(tracePrint){
				tracePrint=false;
			}else{
				if(!flagHandler.getIsComment()){
					if(a.equals("//")){						
						return str;						
					}else if(a.equals("/*")){
						flagHandler.swapFlag();
						tracePrint=true;
					}else{
						str += line.charAt(i);
					}
				}else{
					if(a.equals("*/")){
						flagHandler.swapFlag();
						tracePrint=true;
					}
				}
			}	
		}	
		return str;
	}
	
}
