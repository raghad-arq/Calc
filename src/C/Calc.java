package C;

public class Calc {	 
 private int x ,y;
		
public int  Add( int r,int a) {
	x = r;
	y=a ;
	
	return x+y ;
}
public static void main (String ar[]) {
	Calc o = new Calc();
	 int e = o.Add(3,5);
	
	 System.out.print(e);
}
}
