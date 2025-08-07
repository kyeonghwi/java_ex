package ch07.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro3_3 {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		list.add(new Book(15000));
		list.add(new Book(30000));
		list.add(new Book(5000));
		list.add(new Book(10000));
		list.add(new Book(20000));
		Collections.sort(list);
		for (Book book : list) {
			System.out.println(book.price);
		}
	}
}

class Book implements Comparable<Book> {
	int price;

	@Override
	public int compareTo(Book o) {
		return this.price - o.price;
	}

	public Book(int price) {
		this.price = price;
	}

}