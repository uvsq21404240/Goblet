package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void evaltest(){
		
		Operation O = Operation.PLUS;
		double a,b,res;
		
		a = 6;
		b = 3;
		res = a+b;
		assertTrue("Echec test addition : a et b positif", O.eval(a, b) == res);
		
		a = 0;
		b = 3;
		res = a+b;
		assertTrue("Echec test addition : a nul", O.eval(a, b) == res);
		
		a = 6;
		b = 0;
		res = a+b;
		assertTrue("Echec test addition : b nul", O.eval(a, b) == res);
		
		a = 0;
		b = 0;
		res = a+b;
		assertTrue("Echec test addition : a et b nul", O.eval(a, b) == res);
		
		a = -6;
		b = 3;
		res = a+b;
		assertTrue("Echec test addition : a négatif", O.eval(a, b) == res);
		
		a = 6;
		b = -3;
		res = a+b;
		assertTrue("Echec test addition : b négatif", O.eval(a, b) == res);
		
		a = -6;
		b = -3;
		res = a+b;
		assertTrue("Echec test addition : a et b négatif", O.eval(a, b) == res);
		
		
		O = Operation.MOINS;
		
		a = 6;
		b = 3;
		res = a-b;
		assertTrue("Echec test soustraction : a et b positif", O.eval(a, b) == res);
		
		a = 0;
		b = 3;
		res = a-b;
		assertTrue("Echec test soustraction : a nul", O.eval(a, b) == res);
		
		a = 6;
		b = 0;
		res = a-b;
		assertTrue("Echec test soustraction : b nul", O.eval(a, b) == res);
		
		a = 0;
		b = 0;
		res = a-b;
		assertTrue("Echec test soustraction : a et b nul", O.eval(a, b) == res);
		
		a = -6;
		b = 3;
		res = a-b;
		assertTrue("Echec test soustraction : a négatif", O.eval(a, b) == res);
		
		a = 6;
		b = -3;
		res = a-b;
		assertTrue("Echec test soustraction : b négatif", O.eval(a, b) == res);
		
		a = -6;
		b = -3;
		res = a-b;
		assertTrue("Echec test soustraction : a et b négatif", O.eval(a, b) == res);
		
		
		O = Operation.MULT;
		
		a = 6;
		b = 3;
		res = a*b;
		assertTrue("Echec test multiplication : a et b positif", O.eval(a, b) == res);
		
		a = 0;
		b = 3;
		res = a*b;
		assertTrue("Echec test multiplication : a nul", O.eval(a, b) == res);
		
		a = 6;
		b = 0;
		res = a*b;
		assertTrue("Echec test multiplication : b nul", O.eval(a, b) == res);
		
		a = 0;
		b = 0;
		res = a*b;
		assertTrue("Echec test multiplication : a et b nul", O.eval(a, b) == res);
		
		a = -6;
		b = 3;
		res = a*b;
		assertTrue("Echec test multiplication : a négatif", O.eval(a, b) == res);
		
		a = 6;
		b = -3;
		res = a*b;
		assertTrue("Echec test multiplication : b négatif", O.eval(a, b) == res);
		
		a = -6;
		b = -3;
		res = a*b;
		assertTrue("Echec test multiplication : a et b négatif", O.eval(a, b) == res);
		
		
		O = Operation.DIV;
		
		a = 6;
		b = 3;
		res = a/b;
		assertTrue("Echec test division : a et b positif", O.eval(a, b) == res);
		
		a = 0;
		b = 3;
		res = a/b;
		assertTrue("Echec test division : a nul", O.eval(a, b) == res);
		
		a = -6;
		b = 3;
		res = a/b;
		assertTrue("Echec test division : a négatif", O.eval(a, b) == res);
		
		a = 6;
		b = -3;
		res = a/b;
		assertTrue("Echec test division : b négatif", O.eval(a, b) == res);
		
		a = -6;
		b = -3;
		res = a/b;
		assertTrue("Echec test division : a et b négatif", O.eval(a, b) == res);
		
	}

}