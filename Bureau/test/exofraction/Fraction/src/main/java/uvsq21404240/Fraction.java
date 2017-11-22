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
    
    
}
