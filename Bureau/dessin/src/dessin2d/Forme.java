package dessin2d;

import java.io.Serializable;

public class Forme implements Serializable{
	private String nom;
	public int type;
    public String getNom(){ 
		return nom;
	}
    public void setNom(String nom){ 
		this.nom = nom; 
	}
}
