public class Main {

	public static void main(String[] args) 
	{
		Fraction F1 = new Fraction(1,-3);
		Fraction F2 = new Fraction(2,3);
		
		System.out.println( F1 + " + " + F2 + " = " + Fraction.add(F1,F2) );
		System.out.println( F1.getVal() + F2.getVal() );
		System.out.println( Fraction.add(F1,F2).getVal());
		System.out.println( F1 + " / " + F2 + " = " + Fraction.div(F1,F2) );

	}

}
