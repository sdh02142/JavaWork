package ex0821;

class Test implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close() call.");
	}
	
}

public class AutocloseableExam {
	public static void main(String[] args) {
		System.out.println("Main start");
		try (Test t = new Test()){
			System.out.println(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main end");
	}
}
