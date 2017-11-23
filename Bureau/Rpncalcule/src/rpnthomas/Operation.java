package rpnthomas;

public enum Operation {
	PLUS("+"),
	MOINS("-"),
	MULT("*"),
	DIV("/");
	
	private String symbole = "";
	
	Operation(String symbole){
		this.symbole = symbole;
	}
	
	public double eval(double opeA, double opeB){
		
		if(symbole == "+")return opeA + opeB;
		else if(symbole == "-") return opeA - opeB;
		else if(symbole == "*")return opeA * opeB;
		else return opeA / opeB;
		
	}
	
	public void getOperation(){
	    System.out.println("l'Operation est " + symbole );
	  }
}
