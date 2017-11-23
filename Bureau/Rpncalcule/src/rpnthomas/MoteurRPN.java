package rpnthomas;

public class MoteurRPN {
Pile a;
	
	MoteurRPN(){
		a = new Pile();
	}
	public void enregistrer(double b)
	{
		try {
			a.empiler(b);
			a.affichage();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void calculer(Operation o) {
		try {
			double opeA = a.depiler();
			double opeB = a.depiler();
		
			a.empiler(o.eval(opeA, opeB));
			a.affichage();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
