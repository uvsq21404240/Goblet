package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void MoteurRPNtest() {
		
		MoteurRPN M = new MoteurRPN();
		assertTrue("Echec test création pile", ((Object)M.RPN).getClass().getName() == "rpn.Pile");

	}

	@Test
	public void enregistrerTest() {
		
		MoteurRPN M = new MoteurRPN();
		double test = 12;
		M.enregistrer(test);
		assertTrue("Echec enregistrement opérande", M.RPN.depiler() == test);
	}
	
	@Test
	public void calculerTest() {
	
		MoteurRPN M = new MoteurRPN();
		
		double a,b,res;
		
		a = 6;
		b = 13;
		
		M.enregistrer(a);
		M.enregistrer(b);
		
		M.calculer("+");
		res = a+b;
		
		assertTrue("Echec calcul signe \"+\" ",M.RPN.depiler() == res);
		
		M.enregistrer(a);
		M.enregistrer(b);
		M.calculer("-");
		res = a-b;
		
		assertTrue("Echec calcul signe \"-\" ",M.RPN.depiler() == res);
		
		M.enregistrer(a);
		M.enregistrer(b);
		M.calculer("/");
		res = a/b;
		
		assertTrue("Echec calcul signe \"/\" ",M.RPN.depiler() == res);
		
		M.enregistrer(a);
		M.enregistrer(b);
		M.calculer("*");
		res = a*b;
		
		assertTrue("Echec calcul signe \"*\" ",M.RPN.depiler() == res);
		
	}

}