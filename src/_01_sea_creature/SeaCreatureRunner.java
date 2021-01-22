package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature Sb = new SeaCreature("Spongebob");
	String a = Sb.getName();
	System.out.println(a);
	Sb.eat();
	Sb.laugh();
	SeaCreature Pr = new SeaCreature("Patrick");
	a = Pr.getName();
	System.out.println(a);
	Pr.eat();
	Pr.laugh();
	SeaCreature Sw = new SeaCreature("Squidward");
	a = Sw.getName();
	System.out.println(Sw);
	Sw.eat();
	Sw.laugh();
}
}
