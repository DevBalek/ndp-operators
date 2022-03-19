import java.io.File;

public class Operators {
	
	private File file;
	
	Operators(File file){
		this.file = file;
	}
	
	int numericOperators() {
		file.canExecute();
		return 0;
	}
	
	int relationalOperators() {		
		return 0;
	}
	
	int logicalOperators() {
		return 0;
	}
}


/*

	Sayısal Operator
	+
	++
	-
	--
	*
	/
	%
	&
	|
	^
	=
	+=
	-=
	/=
	*=
	%=
	&=
	|=
	^=
	
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