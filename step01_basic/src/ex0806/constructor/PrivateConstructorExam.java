package ex0806.constructor;

/**
 * 싱글톤 클래스 작성
 * 1) private 생성자 작성
 * 2) 객체를 static 멤버 필드로 선언
 * 3) 객체를 직접 생성해서 반환해주는 method 작성
 * */

public class PrivateConstructorExam {

	public static void main(String[] args) {
		// new Test(); // 외부에서 생성안됨!! <- not visible

		Test  t1 = Test.getInstance( ); //제공된 형태대로 Test객체를 사용할수 있다.
		Test  t2 = Test.getInstance( );
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		Test  t3 = Test.getInstance( );
	}

}
