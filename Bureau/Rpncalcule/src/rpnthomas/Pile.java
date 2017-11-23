package rpnthomas;

public class Pile{
	 
	 private double v[];
	 private int sommet;
	 
	 public Pile(){
		 v = new double[100];
	     sommet = -1;
	 }
	 
	 public int getSommet(){return sommet;}

	  public boolean estVide(){
		 return sommet == -1;
	  }
	  
	  public double depiler() throws Exception{
		 double tmp;
		 if(sommet != -1) {
			 tmp = v[sommet];
			 sommet = sommet - 1;
			 System.out.println(" on depile :" + tmp);
			 return tmp;
		 }
		 else
			 throw new Exception("pile vide");
	  }
	  
	  public void empiler(double o) throws Exception{
		 if(sommet != 100) {
			 sommet = sommet + 1;
			 this.v[sommet] = o;
		 }
		 else
			 	throw new Exception("pile pleine");
	  }
	  public void affichage()
	  {
		  System.out.println(" l'etat de la pile est :");
		  int i ;
		  i = 0 ;
		  for(i = this.sommet ; i >= 0; i--)
		  {  
			  System.out.println(" [ " + v[i] + " ] ");
		  }
		  }
	}
