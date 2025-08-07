package ch06.ex;

public class Pro5 {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone phone : phones) {
			if (phone instanceof Smartphone sp) {
				sp.playGame();
			} else if (phone instanceof Telephone tp) {
				tp.autoAnswering();
			} else if (phone instanceof Phone) {
				phone.talk();
			}
		}
	}
}

class Phone {
	protected String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + " on call");
	}
}

class Telephone extends Phone {
	private String when;

	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	public Telephone(String owner) {
		super(owner);
	}

	void autoAnswering() {
		System.out.println(owner + " on call, call " + when);
	}

}

class Smartphone extends Telephone {
	private String game;

	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}

	void playGame() {
		System.out.println(owner + " playing " + game);
	}
}