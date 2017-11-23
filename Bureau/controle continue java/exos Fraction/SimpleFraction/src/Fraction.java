public final class Fraction
{
	//Classe immuable : on peut pas changer la valeur des attributs
    private final int num;
    private final int den;
	private final int ZERO = new Fraction();
    private final int UN = new Fraction(1,1);

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
    
    public void reduc()
    {
        int d = pgcd(num,den);
        num /= d;
        den /= d;
    }
    
    public static Fraction add(Fraction F1, Fraction F2)
    {
    	Fraction Res = new Fraction();
        if (F1.den == F2.den) {
            Res.num = F1.num + F2.num;
            Res.den = F1.den;
        } else {
            Res.num = F1.num*F2.den + F2.num*F1.den;
            Res.den = F1.den * F2.den;
        }
        return Res;
    }
    
    public static Fraction div(Fraction F1, Fraction F2)
    {
        if (F2.getVal() == 0)
            throw new ArithmeticException();
        
        Fraction Res = new Fraction();
        Res.num = F1.num * F2.den;
        Res.den = F1.den * F2.num;
        
        return Res;
    }

    
    public static boolean egale(Fraction F1, Fraction F2)
    {
        F1.reduc();
        F2.reduc();
        
        if ( F1.num == F2.num && F1.den == F2.den )
            return true;
        return false;
    }
    
    public String toString()
    {
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
