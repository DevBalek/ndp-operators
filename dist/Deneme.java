public class Deneme { //yorum satiri
	public int x;
	public int y;
	
	public Deneme(int x,int y) { /* blaajsakdfl
	*/
		this.x = x;
		this.y = y; 
	}
	// karahindiba /* aajslkdfkla
	
	/* *
	* x*x + y*y // işlemi x > 0 ve y > 0
	*/
	
	public int x2y2() {
		return x * x + y * y; /*/ falandfkaj */
	} 
	
	/*
	* Karakök işlemi yapan fonksiyon * karakok(x*x + y*y)
	*/
	
	public double karakok() {
		return Math.sqrt((double)x2y2());
	}
	
	// log2(x/++y)
	
	public double log2() {
		++y;
		return Math.log(((double)x)/y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Deneme) {
			return ((Deneme)obj).x == this.x && ((Deneme)obj).y == this.y;
		}
	return false; 
	}
}