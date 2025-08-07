package ch07.ex;

public class Pro2 {

}

interface Edible {
	void eat();
}

interface Sweetable {
	void sweet();
}

interface delicious extends Edible, Sweetable {

}