package ex0807.ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // override된 method이므로 child의 method2가 실행됨
//		parent.method3(); 부모 클래스로 자동 형변환 이후엔 자식 타입에만 있는 method의 접근 불가
	}
}
