package ex0807.ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2(); 
		
		/*
		parent.field2 = "data2";
		parent.method3();         => 부모 클래스 범위에만 접근 가능
		*/
		
		Child child = (Child)parent;
		
		child.field2 = "data2";
		child.method3(); //       => 강제 형변환으로 자식 클래스 범위 접근 가능
	}
}
