package dessin2d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Saisie implements Serializable{
	
	private Scanner sc;
	public int x, y , r;
	public int x1, y1 , x2, y2 ;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;	
	public Saisie(){
		sc = new Scanner(System.in);
	}
	
	public void s(){
		
		
		 try {
		      oos = new ObjectOutputStream(
		              new BufferedOutputStream(
		                new FileOutputStream(
		                  new File("texte.txt"))));
		
		
		System.out.println("Veuillez saisir un choix:");
		System.out.println("1 pour créer une forme");
		System.out.println("2 pour modifier une forme");
		System.out.println("3 pour afficher toutes les formes");
		
		
		
		if(sc.hasNextInt())
		{
			int a = sc.nextInt();
			if(a == 1)
			{
				System.out.println("Veuillez saisir un choix:");
				System.out.println("1 pour créer un cercle");
				System.out.println("2 pour créer un triangle");
				a = sc.nextInt();
				if(a == 1)
				{
					System.out.println("Choisir le rayon:");
					r = sc.nextInt();
					System.out.println("Choisir le x :");
					x = sc.nextInt();
					System.out.println("Choisir le y :");
					y = sc.nextInt();
					oos.writeObject(new Cercle(r, x, y));
				}
				else if(a == 2)
				{
					System.out.println("Choisir le x:");
					x = sc.nextInt();
					System.out.println("Choisir le x1 :");
					x1 = sc.nextInt();
					System.out.println("Choisir le x1 :");
					x2 = sc.nextInt();
					System.out.println("Choisir le y :");
					y = sc.nextInt();
					System.out.println("Choisir le y1 :");
					y1 = sc.nextInt();
					System.out.println("Choisir le y2 :");
					Triangle t1 = new Triangle (x , y , x1 , y1 , x2 , y2);
				}
				else
				{
					System.out.println("erreur de saisie: 2");
				}
				
			}
			if(a == 2)
			{
				/////modification de forme
				
			}
			if(a == 3)
			{
				/////affichage de forme
				
			}
		}
		else
		{
			System.out.println("refaire une saisie");
					
		}
		oos.close();
	 } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }     	
	}
}
