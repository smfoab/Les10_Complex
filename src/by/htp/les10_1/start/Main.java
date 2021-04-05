package by.htp.les10_1.start;

import by.htp.les10_1.entity.Complex;
import by.htp.les10_1.logic.ComplexLogic;
import by.htp.les10_1.presentation.ComplexView;

public class Main {
	public static void main(String[] args) {

		Complex c1 = new Complex(12, 7);
		Complex c2 = new Complex(5, 8);

		Complex c3;

		ComplexLogic logic = new ComplexLogic();

		c3 = logic.sum(c1, c2);

		ComplexView view = new ComplexView();

		view.printSum(c1, c2, c3);

		Complex c4;

		c4 = logic.cut(c1, c2);

		view.printSubtraction(c1, c2, c4);

	}

}
