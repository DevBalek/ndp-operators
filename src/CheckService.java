
public class CheckService {
	
	int indexOfFirstSlashStar(String line) {
		return line.indexOf("/*");
	}
	
	int indexOfFirstStarSlash(String line) {
		return line.indexOf("*/");
	}
	
	int indexOfRowComment(String line) {
		return line.indexOf("//");
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