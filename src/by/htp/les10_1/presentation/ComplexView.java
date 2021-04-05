package by.htp.les10_1.presentation;

import by.htp.les10_1.entity.Complex;

public class ComplexView {
	
	{
		System.out.println("Операции с комплексными числами: ");
	}

	public void printSum(Complex c1, Complex c2, Complex c3) {

		System.out.println("Сложение: (" + c1.getA() + " + " + c1.getB() + "i) + (" + c2.getA() + " + "
				+ c2.getB() + "i) = (" + c3.getA() + " + " + c3.getB() + "i)");
	}

	public void printSubtraction(Complex c1, Complex c2, Complex c3) {

		System.out.println("Вычитание: (" + c1.getA() + " + " + c1.getB() + "i) - (" + c2.getA() + " + "
				+ c2.getB() + "i) = (" + c3.getA() + " + " + c3.getB() + "i)");
	}

}
