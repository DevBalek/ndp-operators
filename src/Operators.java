
public class Operators {
	private int singleOperators;
	private int coupleOperators;
	private int numericOperators;
	private int relationalOperators;
	private int logicalOperators;
	
	Operators(){
		singleOperators=0;
		coupleOperators=0;
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
						if (afterA.equals("+")||afterA.equals("=")) {
							tracePrint = true;
							increaseNumericOperators();		
							increaseCouple();				
						}else{
							increaseNumericOperators();
							increaseSingle();
						}
					break;

					case "-":
					if (afterA.equals("-")||afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;
					
					case "*":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;

					case "/":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;

					case "%":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;
					
					case "&":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else if(afterA.equals("&")){
						tracePrint = true;
						increaseLogicalOperators();
						increaseCouple();
					}
					else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;

					case "|":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else if (afterA.equals("|")){
						tracePrint = true;
						increaseLogicalOperators();
						increaseCouple();
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;

					case "^":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseNumericOperators();		
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;
					
					case "=":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						increaseCouple();				
					}else{
						increaseNumericOperators();
						increaseSingle();
					}
					break;
					
					case "<":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						increaseCouple();				
					}else{
						increaseRelationalOperators();
						increaseSingle();
					}
					break;

					case ">":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						increaseCouple();				
					}else{
						increaseRelationalOperators();
						increaseSingle();
					}
					break;

					case "!":
					if (afterA.equals("=")) {
						tracePrint = true;
						increaseRelationalOperators();
						increaseCouple();				
					}else{
						increaseLogicalOperators();
						increaseSingle();
					}
					break;

					default:
						break;
				}
			}


		}

	}

	private void increaseCouple(){	coupleOperators++;	}

	private void increaseSingle(){	singleOperators++;	}

	private void increaseNumericOperators() {	numericOperators++;	}
	
	private void increaseRelationalOperators() {	relationalOperators++;	}
	
	private void increaseLogicalOperators() {	logicalOperators++;  }

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