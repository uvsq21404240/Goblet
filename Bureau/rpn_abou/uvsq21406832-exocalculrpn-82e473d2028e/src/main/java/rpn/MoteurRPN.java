package rpn;

public class MoteurRPN {
	Pile RPN;
	
	MoteurRPN(){
		RPN = new Pile(2);
	}
	
	public void enregistrer(double ope) {
		
		RPN.empiler(ope);
		
	}
	
	public void calculer(String symbole) {
		double opeA;
		double opeB;
		Operation O;
		
		opeA = this.RPN.depiler();
		opeB = this.RPN.depiler();
		
		if(symbole.equals("+")) { 
			O = Operation.PLUS; 
			this.RPN.empiler(O.eval(opeB, opeA));
		}
		else if(symbole.equals("-")) {
			O = Operation.MOINS; 
			this.RPN.empiler(O.eval(opeB, opeA));	
		}
		else if(symbole.equals("*")) {
			O = Operation.MULT; 
			this.RPN.empiler(O.eval(opeB, opeA));	
		}
		else {
			O = Operation.DIV; 
				this.RPN.empiler(O.eval(opeB, opeA));
		}
	}
	
	public Pile etatPile() {
		return this.RPN;
	}
}
