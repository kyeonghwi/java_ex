package ch08.ex;

import java.util.Random;

public class Pro4 {
	public static void main(String[] args) {
		System.out.println(new Dice().roll());
	}
}

class Dice {
	int dice;
	Random r = new Random();

	int roll() {
		return r.nextInt(6) + 1;
	}
}