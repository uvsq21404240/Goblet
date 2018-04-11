package dessin2d;

import java.io.Serializable;

public class Triangle extends Forme implements Serializable{
	
	public Triangle (int x , int y,int x1 , int y1,int x2 , int y2)
	{
		Point p1 = new Point(x,y);
		Point p2 = new Point(x1,y1);
		Point p3 = new Point(x1,y1);
		this.type = 2 ;
	}
}
