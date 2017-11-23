package uvsq21404240;
public final class Fraction
{
	//Classe immuable : on peut pas changer la valeur des attributs (pas la peine de mettre final dans la declaration de la classe car les attributs le sont deja)
    private final int num;
    private final int den;
	public static Fraction ZERO = new Fraction();
    public static Fraction UN = new Fraction(1,1);

    public Fraction(int n, int d){
        num = n;
        if (d == 0)
            throw new ArithmeticException();
        else
        	den = d;
    }
    public Fraction(int n){
        num = n;
        den = 1;
    }
    public Fraction(){
        num = 0;
        den = 1;
    }

    public int getNum(){return num;}
    public int getDen(){return den;}
    public double getVal(){
        return ( (double) num ) / ( (double) den );
    }
    
    private int pgcd(int a, int b)
    {
        if (a == b) return a;
        if (a > b ) return pgcd(a-b, b);
                    return pgcd (a, b-a);
    }
    
    public Fraction reduc()
    {
        int d = pgcd(this.num,this.den);
        
        return new Fraction(this.num / d, this.den / d);
    }
    
    public static Fraction add(Fraction F1, Fraction F2)
    {
    	if (F1.den == F2.den){
            Fraction Res = new Fraction(F1.num + F2.num, F1.den);
            return Res.reduc();
        }
        else {
			return new Fraction(F1.num*F2.den + F2.num*F1.den, F1.den * F2.den);
			//return Res.reduc();
		}
    }
    
    public static Fraction div(Fraction F1, Fraction F2)
    {
        if (F2.getVal() == 0)
            throw new ArithmeticException();
        
        return new Fraction(F1.num * F2.den, F1.den * F2.num);
    }

    
    public static boolean egale(Fraction F1, Fraction F2)
    {
        Fraction F11 = F1.reduc();
        Fraction F22 = F2.reduc();
        
        if ( F11.num == F22.num && F11.den == F22.den )
            return true;
        return false;
    }
    
    public String toString()
    {
		if (this.den == 1)
			return ( this.num + "" );
		if (this.den == -1)
			return ("-"+this.num);
		return ( this.num + "/" + this.den ) ;
    }
    
    public static String compare(Fraction F1, Fraction F2)
    {
        if (F1.num*F2.den == F2.num*F1.den)
            return (F1.toString() + " = " + F2.toString());
        if (F1.num*F2.den < F2.num*F1.den)
            return (F1.toString() + " < " + F2.toString() );
        return (F1.toString() + " > " + F2.toString() );
    }
}
