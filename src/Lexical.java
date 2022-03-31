/** *
* @author Muhammed Furkan Balek | G191210069 | muhammed.balek@ogr.sakarya.edu.tr | github.com/DevBalek 
* @since March 2022
* <p>
	* Operatorlerle ilgili işlemleri yapan class
* </p> */

public class Lexical {
	private int singleOperators;
	private int coupleOperators;

	private int singleOperands;
	private int coupleOperands;

	private int numericOperators;
	private int relationalOperators;
	private int logicalOperators;
	private int operandInfo;
	


	Lexical(){
		singleOperators=0;				
		coupleOperators=0;

		singleOperands=0;
		coupleOperands=0;


	 	numericOperators = 0;
		relationalOperators = 0;
		logicalOperators = 0;		
	}
	
	

	void controlLine(String line){
		Boolean tracePrint = false;

		for (int i = 0; i < line.length(); i++) {
			String a = String.valueOf(line.charAt(i));
			String afterA = "";

			if(i!=line.length()-1)
				afterA = String.valueOf(line.charAt(i+1));

			if(tracePrint){
				tracePrint=false;
			}else{
				switch (a) {
					case "+":
					if (afterA.equals("+")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseSingle();
						increaseSingleOperands();								
					}else if(afterA.equals("=")){
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}
					else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "-":
					if (afterA.equals("-")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseSingle();	
						increaseSingleOperands();			
					}else if(afterA.equals("=")){
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}
					else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;
					
					case "*":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();
						increaseCoupleOperands();				
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "/":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "%":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;
					
					case "&":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}else if(afterA.equals("&")){
						tracePrint = true;
						increaseLogicalOperators();
						// increaseCouple();
						increaseCoupleOperands();
					}
					else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "|":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}else if (afterA.equals("|")){
						tracePrint = true;
						increaseLogicalOperators();
						// increaseCouple();
						increaseCoupleOperands();
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "^":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();		
						increaseCoupleOperands();		
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;
					
					case "=":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						// increaseCouple();	
						increaseCoupleOperands();			
					}else{
						increaseNumericOperators();
						increaseCouple();
						increaseCoupleOperands();
					}
					break;
					
					case "<":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						// increaseCouple();	
						increaseCoupleOperands();			
					}else{
						increaseRelationalOperators();
						// increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case ">":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						// increaseCouple();	
						increaseCoupleOperands();			
					}else{
						increaseRelationalOperators();
						// increaseCouple();
						increaseCoupleOperands();
					}
					break;

					case "!":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						// increaseCouple();	
						increaseCoupleOperands();			
					}else{
						increaseLogicalOperators();
						// increaseSingle();
						increaseSingleOperands();
					}
					break;

					default:
						break;
				}
			}

			

		}
		
		
		updateOperandInfo();

	}


	void updateOperandInfo(){	setOperandInfo((2 * getCoupleOperands()) + getSingleOperands());	}
	
	private void increaseCouple(){	coupleOperators++;	}

	private void increaseSingle(){	singleOperators++;	}

	private void increaseNumericOperators() {	numericOperators++;	}
	
	private void increaseRelationalOperators() {	relationalOperators++;	}
	
	private void increaseLogicalOperators() {	logicalOperators++;  }

	private void increaseSingleOperands(){	singleOperands++;	}

	private void increaseCoupleOperands(){	coupleOperands++; }

	public int getCoupleOperators() {
		return coupleOperators;
	}
	public int getLogicalOperators() {
		return logicalOperators;
	}
	public int getNumericOperators() {
		return numericOperators;
	}
	public int getRelationalOperators() {
		return relationalOperators;
	}
	public int getSingleOperators() {
		return singleOperators;
	}
	public int getOperandInfo() {
		return operandInfo;
	}

	public int getCoupleOperands() {
		return coupleOperands;
	}

	public int getSingleOperands() {
		return singleOperands;
	}


	public void setOperandInfo(int operandInfo) {
		this.operandInfo = operandInfo;
	}

	public void setSingleOperands(int singleOperands) {
		this.singleOperands = singleOperands;
	}

	public void setCoupleOperands(int coupleOperands) {
		this.coupleOperands = coupleOperands;
	}

}


/*

	Sayısal Operator
!	+		++		+=
!	-		--		-=
!	*		*=
!	/		/=	
!	%		%=
!	&		&=
!	|		|=
!	^		^=
!	=
	
	İlişkisel Operator
	<
	<=
	>
	>=
	==
	!=
	
	Mantıksal Operator
	&&
	||
	!

*/