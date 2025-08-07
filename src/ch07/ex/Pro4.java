package ch07.ex;

public class Pro4 {
	static void speak(Talkable talkable) {
		talkable.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}
}

interface Talkable {
	void talk();
}

class Korean implements Talkable {

	@Override
	public void talk() {
		System.out.println("ㅎㅇ");
	}

}

class American implements Talkable {

	@Override
	public void talk() {
		System.out.println("Hi");
	}

}