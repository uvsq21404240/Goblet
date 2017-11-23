package rpnthomas;

import java.util.Scanner;
public class SaisieRPN {
	
	private Scanner sc;
	private MoteurRPN cal;
	
	public SaisieRPN(){
		sc = new Scanner(System.in);
		cal = new MoteurRPN();
	}
	
	public void saisie(){
		String signe;
		System.out.println("Veuillez saisir un nombre  ou un operateur:");		
		if(sc.hasNextDouble())
		{
			double d = sc.nextDouble();
			cal.enregistrer(d);
		}
		else
		{
			signe = sc.nextLine();
					
			if(signe.equals("+"))
			{
				if (cal.a.getSommet() >= 1){
					cal.calculer(Operation.PLUS);
				}
				else
				{
					System.out.println("erreur pas assez de nombre pour la pile");
				}
			}
			else if(signe.equals("-"))
			{
				if (cal.a.getSommet() >= 1){
					cal.calculer(Operation.MOINS);
				}
				else
				{
					System.out.println("erreur pas assez de nombre pour la pile");
				}
			}
			else if(signe.equals("*"))
			{
				if (cal.a.getSommet() >= 1){
					cal.calculer(Operation.MULT);
				}
				else
				{
					System.out.println("erreur pas assez de nombre pour la pile");
				}
			}
			else if (signe.equals("/"))
			{
				if (cal.a.getSommet() >= 1){
					cal.calculer(Operation.DIV);
				}
				else
				{
					System.out.println("erreur pas assez de nombre pour la pile");
				}
			}
			else
			{
				System.out.println("erreur de saisie");
			}
		}	
	}
}
