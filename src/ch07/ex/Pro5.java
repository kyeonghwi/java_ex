package ch07.ex;

public class Pro5 {
	public static void main(String[] args) {
		Controller[] c = { new Tv(false), new Radio(true) };

		for (Controller controller : c) {
			controller.show();
		}
	}
}

abstract class Controller {
	boolean Power;

	abstract String getName();

	void show() {
		if (Power) {
			System.out.println(this.getName() + " On");
		} else {
			System.out.println(this.getName() + " Off");
		}
	}
}

class Tv extends Controller {

	public Tv(boolean power) {
		this.Power = power;
	}

	@Override
	String getName() {
		return "Tv";
	}
}

class Radio extends Controller {

	public Radio(boolean power) {
		this.Power = power;
	}

	@Override
	String getName() {
		return "Radio";
	}
}