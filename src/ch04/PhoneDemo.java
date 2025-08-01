package ch04;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.Model = "Galaxy Fold 5";
		myPhone.value = 1990;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.Model = "Iphone 17";
		yourPhone.value = 1500;
		yourPhone.print();
	}
}

class Phone {
	String Model;
	int value;

	void print() {
		System.out.println(value + " dollar " + Model + " smartphone");
	}
}