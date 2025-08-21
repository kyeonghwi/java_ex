package DataStructure;

public class ArrList<E> {
	private E[] a; // E a[];
	private int size;

	public ArrList() {
		a = (E[]) (new Object[1]);// 최초로 크기가 1인 배열 생성해놓기(데이터는 없는 빈 배열)
		size = 0;
	}

	// 삽입, 탐색, 삭제 연산 메서드 구현
	public boolean add(E e) { // 배열의 맨 마지막에 추가하는 연산
		if (a.length == size) {
			// 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보기)

			resize(length() * 2);
//			E[] t = (E[]) (new Object[length() * 2]);
//
//			for (int i = 0; i < size(); i++) {
//				t[i] = a[i];
//			}
//			a = t;
		}
		// 맨 마지막에 추가하고 배열의 size 를 증가시킨다. <==== (1. 여기 구현해보기)
		a[size] = e;
		size++;
		return true;
	}

	public boolean add(int index, E e) { // 배열 추가하는 연산
		if (a.length == size) {
			// 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보기)
			E[] t = (E[]) (new Object[length() * 2]);

			System.arraycopy(a, 0, t, 0, index);
			t[index] = e;
			System.arraycopy(a, index, t, index + 1, size - index);
			a = t;
		} else {
			E[] t = (E[]) (new Object[length()]);
			System.arraycopy(a, 0, t, 0, index);
			t[index] = e;
			System.arraycopy(a, index, t, index + 1, size - index);
			a = t;
		}
		// 추가하고 배열의 size 를 증가시킨다. <==== (1. 여기 구현해보기)
		size++;
		return true;
	}

	public E get(int k) {// k 번째 항목을 탐색하는 연산
		if (size == 0) { // underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		return a[k];// k 번째 항목을 리턴, 단순히 읽기만 하면 된다.<==== (2. 여기 구현해보기)
	}

	public E remove() {// 맨 마지막 요소를 삭제하는 연산
		if (isEmpty()) {// underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		// 맨 마지막 요소를 삭제하기 전 백업을 받고, 삭제한다. 배열의 size 를 감소시킨다. <==== (3. 여기 구현해보기)
		E removed = a[size - 1];
		a[size - 1] = null;
		size--;

		if (size > 0 && size <= a.length / 4) {
			// 배열의 크기를 반으로 줄인다.
			// 기존배열의 값을 새로 만든 배열로 옮긴다.
			// 기존배열을 없애고 새로만든 배열을 a기 참조한다.
			// 배열의 사이즈를 2배 증가시킨다. <==== (3. 여기 구현해보기, 코드가 길어지고 재사용되면 나중에 리팩토링 하기)
			resize(length() / 2);
		}
		return removed; // 백업 받아놓은 삭제된 요소를 반환한다. <==== (3. 여기 구현해보기)
	}

	public E remove(int index) {// 요소를 삭제하는 연산
		if (isEmpty()) {// underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		// 맨 마지막 요소를 삭제하기 전 백업을 받고, 삭제한다. 배열의 size 를 감소시킨다. <==== (3. 여기 구현해보기)
		E removed = a[index];
		System.arraycopy(a, index + 1, a, index, size - index - 1);
		size--;

		if (size > 0 && size <= a.length / 4) {
			// 배열의 크기를 반으로 줄인다.
			// 기존배열의 값을 새로 만든 배열로 옮긴다.
			// 기존배열을 없애고 새로만든 배열을 a기 참조한다.
			// 배열의 사이즈를 2배 증가시킨다. <==== (3. 여기 구현해보기, 코드가 길어지고 재사용되면 나중에 리팩토링 하기)
			resize(length() / 2);
		}
		return removed; // 백업 받아놓은 삭제된 요소를 반환한다. <==== (3. 여기 구현해보기)
	}

	private void resize(int length) {
		// 배열의 크기를 length 만큼 증가 혹은 감소시킨다.
		// 기존배열의 값을 새로 만든 배열로 옮긴다.
		// 기존배열을 없애고 새로만든 배열을 a기 참조한다.
		E[] t = (E[]) (new Object[length]);

		for (int i = 0; i < size(); i++) {
			t[i] = a[i];
		}
		// <==== (4. 여기 구현해보기)
		a = t;
		// 자바의 ArrayList 는 Arrays.copyOf , arraycopy 등과 같은 방법으로 최적화되어 있다.
		// 우리는 반복문으로 옮겨보자.

		// <==== (4. 여기 구현해보기)
	}

	// 기타 편의 메서드 구현 //<==== (5. 여기 3개의 메서드 구현해보기)
	public int size() {
		return size;
	}

	private int length() {
		return a.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				list += a[i];
			} else {
				list += a[i] + ",";
			}
		}
		return "ArrList : [" + list + "]";
	}
}
