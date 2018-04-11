package dessin2d;

import java.io.Serializable;

public class Point extends Forme implements Serializable{
	public int x ;
	public int y ;
	
	public Point(int x , int y)
	{
		this.x = x;
		this.y = y;	
	}
	public void deplacement( int x , int y)
	{
		this.x =  x + this.x;
		this.y = y + this.y;
	}
	
}

