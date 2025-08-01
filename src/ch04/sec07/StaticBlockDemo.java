package ch04.sec07;

public class StaticBlockDemo {
	// 정적 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		sumOneToTen = sum;
	}

	int any = 0;

	// 정적 메서드
	public static void main(String[] args) {
		System.out.println(sumOneToTen);
//		System.out.println(any); 클래스 메서드에서 인스턴스 변수 불가
//		System.out.println(sum); 클래스 메서드에서 지역 변수 불가

	}
}