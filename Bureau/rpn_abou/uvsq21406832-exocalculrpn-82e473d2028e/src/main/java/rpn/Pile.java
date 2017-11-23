package rpn;

public class Pile {

	private int sommet;

	private double []elements;

	public Pile(int size) {

		sommet = -1;

		elements = new double[size];
		
		
	}

	public boolean pileVide() {

		return sommet == -1;

	}

	public double depiler() {

		if (pileVide()) {

			System.out.println("pile vide !");

			return 0;

		}

		return elements[sommet--];

	}

	public void empiler(double value) {

		if (sommet == (elements.length - 1)) {

			System.out.println("pile pleine !");

			return;

		}

		elements[++sommet] = value;

	}

	public void videPile() {

		sommet = -1;

	}

	public void afficherPile() {
		
		System.out.println(elements[sommet]);
		/*System.out.println("Pile:");

		System.out.println(" taille: "+elements.length);

		System.out.println(" sommet: "+elements[sommet]);

		for (int i=0;i<=sommet;i++)

			System.out.println(" element["+i+"]: "+elements[i]);
		 */
	}
}