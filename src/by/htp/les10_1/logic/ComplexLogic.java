package by.htp.les10_1.logic;

import by.htp.les10_1.entity.Complex;

public class ComplexLogic {
	
	public Complex sum(Complex c1, Complex c2) {
		
		Complex c3 = new Complex();
		c3.setA(c1.getA()+c2.getA());
		c3.setB(c1.getB()+c2.getB());
		
		return c3;
	}

	public Complex cut(Complex c1, Complex c2) {

		Complex c3 = new Complex();
		c3.setA(c1.getA()-c2.getA());
		c3.setB(c1.getB()-c2.getB());
		
		return c3;
	}

}
