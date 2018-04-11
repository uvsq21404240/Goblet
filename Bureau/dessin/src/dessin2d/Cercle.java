package dessin2d;

import java.io.Serializable;

public class Cercle  extends Forme implements Serializable{
	public int rayon ;
	Point p1 ;
	public Cercle (int r, int x , int y)
	{
		this.rayon = r;
		Point p1 = new Point(x,y);
		this.type = 1 ;
	}
	public void deplacementpoint(int x , int y  )
	{
		this.p1.deplacement(x , y);
	}
	 public String toString(){
		 return "Nom du jeu : " + this.rayon + 
				 "\n Style de jeu : " + this.p1.x + 
		           "\n Prix du jeu : " + this.p1.y + "\n";
		  }	
	
}


