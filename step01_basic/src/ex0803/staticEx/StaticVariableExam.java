package ex0803.staticEx;

class Test{
	int a;
	static int b;
	
	// non-static method 안에서는 static, non-static, this 모두 사용 가능.
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(Test.b);
		
		this.bb();
		bb();
		
		dd();
		this.dd();
		Test.dd();
	}
	
	public void bb() {
	}
	
	// static method 안에서는 static만 접근 및 사용 가능.
	public static void cc() {
//		System.out.println(a);
//		System.out.println(this.a);
		
		System.out.println(b);
//		System.out.println(this.b);
		System.out.println(Test.b);
		
//		this.bb();
//		bb();
		
		dd();
//		this.dd();
		Test.dd();
	}
	public static void dd() {}
}

public class StaticVariableExam {

	public static void main(String[] args) {
		System.out.println("static");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println();
		
		t2.a = 100;
		System.out.println("non-static 변수");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		

		System.out.println();
		
		
		System.out.println("static 변수");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		System.out.println("Test.b = " + Test.b);
		
		System.out.println();
		
		t2.b = 50;
		Test.b = 70;
		System.out.println("static 변수 변경 후");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		System.out.println("Test.b = " + Test.b);
	}
	
	/**
	 * 프로젝트가 배포될 때, main method보다 먼저 실행되는 영역으로
	 * 주로 DB연결, 네트워크 점검, 초기 데이터 로딩 등
	 * 프로젝트 전반에 해당하는 configuration 세팅하는 과정*/
	
	static {
		System.out.println("present message before starting main method");
	}

}
