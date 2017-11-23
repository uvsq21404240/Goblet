package rpn;

import java.util.InputMismatchException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaisieRPN s = new SaisieRPN();
		
		try {
		s.Saisie();
		}
		catch(InputMismatchException e) {
			
			System.out.println("Erreur de saisie");
		}
		catch(ArithmeticException e) {
			System.out.println("Division par zero");
		}
	}

}
