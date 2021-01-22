package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf S = new Smurf("Handy");
		String a = S.getName();
		System.out.println(a);
		S.eat();
		Smurf SP = new Smurf("Papa");
		a = SP.getName();
		System.out.println(a);
		SP.eat();
		String b = SP.getHatColor();
		System.out.println(b);
		String c = SP.isGirlOrBoy();
		System.out.println(c);
		Smurf Sf = new Smurf("Smurfette");
		a = Sf.getName();
		System.out.println(a);
		Sf.eat();
		b = Sf.getHatColor();
		System.out.println(b);
		c = Sf.isGirlOrBoy();
		System.out.println(c);
		
	}
}
