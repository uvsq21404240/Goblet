package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {

	@Test
	public void Piletest() {
		
		Pile p = new Pile(10);
		String type = "rpn.Pile";
		
		assertTrue(" Echec test initialisation tableau pour la pile ",((Object)p).getClass().getTypeName() == type);
	}

	@Test
	public void PileVideTest() {
		
		Pile p = new Pile(10);
		
		assertTrue(" Echec test pile vide ", p.pileVide() == true);
		
	}
	
}
