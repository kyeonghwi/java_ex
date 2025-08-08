package ch09;

public class TryWithResource {
	public static void main(String[] args) {

//		try (FileInputStream fis = new FileInputStream("file.txt")) {
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		try (Resource r = new Resource()) {
			r.show();
		} catch (Exception e) {
			System.out.println("exception occured");
		}
	}
}

class Resource implements AutoCloseable {
	void show() {
		System.out.println("use resource");
	}

	@Override
	public void close() throws Exception {
		System.out.println("close resource");
	}

}