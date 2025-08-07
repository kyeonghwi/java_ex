package ch06;

public class BoxDemo {
	public static void main(String[] args) {
		ColoredBox cb = new ColoredBox("red");
		ColoredBox cb1 = new ColoredBox(" ");

	}
}

class Box {
	public Box() {
		System.out.println("generating box...");
	}

	public Box(String s) {
		System.out.println("generating box...");
	}
}

class ColoredBox extends Box {
	String color;
//	public ColoredBox() {
//		System.out.println("generating ColoredBox..");
//	}

	public ColoredBox(String color) {
		super(color);
		this.color = color;
		System.out.println(color + " color box generated");
	}
}