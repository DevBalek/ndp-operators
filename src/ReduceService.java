
public class ReduceService {	

	String reduceFile(String line, FlagHandler flagHandler) {				
		String str="";

		Boolean tracePrint =false;

		for (int i = 0; i < line.length(); i++) {

			String a = line.charAt(i) + "" + line.charAt(i+1);

			if(tracePrint){
				tracePrint=false;
			}else{
				if(!flagHandler.getIsComment()){
					if(a=="//"){
						return str;
					}else if(a=="/*"){
						flagHandler.swapFlag();
						tracePrint=true;
					}else{
						str += line.charAt(i);
					}
				}else{
					if(a=="*/"){
						flagHandler.swapFlag();
						tracePrint=true;
					}
				}
			}	
		}	
		return str;
	}
	
}
