package wizard;

public class Wand {

	private String name;// 杖の名前
	private double power;// 杖の魔力

	public String getName() {
		return this.name;
	}

	public double getPower() {
		return this.power;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が異常です。処理を中断");
		}
		this.name = name;
	}

	public void setPower(double power) {
		if (power < 0.5 || 100 < power) {
			throw new IllegalArgumentException("魔力が異常です。処理を中断");
		}
		this.power = power;
	}
}
