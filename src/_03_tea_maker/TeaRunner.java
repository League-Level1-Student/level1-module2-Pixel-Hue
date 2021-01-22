package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaRunner {
	
	public static void main(String[] args) {
		TeaBag T = new TeaBag("Green");
		Kettle K = new Kettle();

		Cup c = new Cup();
String a = T.getFlavor();

K.boil();



c.makeTea(T, K.getWater());
	}

}
