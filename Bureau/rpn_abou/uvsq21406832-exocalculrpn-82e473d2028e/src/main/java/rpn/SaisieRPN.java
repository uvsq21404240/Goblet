package rpn;

import java.util.Scanner;
import java.util.InputMismatchException;
public class SaisieRPN {
	

	public void Saisie() 
	throws InputMismatchException, ArithmeticException{
		
		Scanner sc = new Scanner(System.in);
		double opeA,opeB;
		String signe;
		MoteurRPN RPN = new MoteurRPN();
		
		//System.out.println(((Object)RPN.RPN).getClass());
		
		//System.out.println("Entrer element");
		
		opeA = sc.nextDouble();
	//	System.out.println(opeA);
		
		if(((Object)opeA).getClass().getName() != "java.lang.Double") {
			throw new InputMismatchException();
		}
		
		sc.nextLine();
		
		//System.out.println("Entrer element");
		opeB = sc.nextDouble();
		if(((Object)opeB).getClass().getName() != "java.lang.Double") {
			throw new InputMismatchException();
		}
		
		sc.nextLine();
		
		//System.out.println("Entrer signe");
		signe = sc.nextLine();
			
		if(!signe.equals("+") &&  !signe.equals("-") && !signe.equals("*") && !signe.equals("/")) {
			throw new InputMismatchException();
		}
		
		
		if(opeB == 0 && signe.equals("/")) {
			throw new ArithmeticException();
		}
		RPN.enregistrer(opeA);
		RPN.enregistrer(opeB);
		RPN.calculer(signe);
		RPN.etatPile().afficherPile();
		
		while(true) {
			
			//System.out.println("Entrer element");
			opeA = sc.nextDouble();
			if(((Object)opeA).getClass().getName() != "java.lang.Double") {
				throw new InputMismatchException();
			}
			
			sc.nextLine();
			
			signe = sc.nextLine();
			
			if(!signe.equals("+") &&  !signe.equals("-") && !signe.equals("*") && !signe.equals("/")) {
				throw new InputMismatchException();
			}
			
			if(opeA == 0 && signe.equals("/")) {
				throw new ArithmeticException();
			}
			RPN.enregistrer(opeA);
			RPN.calculer(signe);
			RPN.etatPile().afficherPile();
			
		}
	}
}
