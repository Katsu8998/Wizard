package wizard;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Wand wand = new Wand();
		Harry h = new Harry();
		w.setHp(30);
		w.setMp(50);
		w.setName("ハーモニー");
		w.setWand(wand);

		h.setHp(40);
		h.setName("ハリー");

		wand.setName("ニワトコの杖");
		wand.setPower(30);

		w.heal(h);
	}
}