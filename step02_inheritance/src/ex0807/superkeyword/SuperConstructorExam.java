package ex0807.superkeyword;

class Parent {
//	Parent(){
//		System.out.println(1);
//	} // <--- ①
	Parent(int i){
		System.out.println(2);
	} // <--- ②
	Parent(String s){
		System.out.println(3);
	} // <--- ③
}


class Child extends Parent {
	Child(){
		super(1);
		System.out.println(4);
	} // <--- ④
	Child(int i){
		super(4);
		System.out.println(5);
	} // <--- ⑤
	Child(String s){
		super("9");
		System.out.println(6);
	} // <--- ⑥
}


//   -> 부모 class의 기본 생성자를 제외하고 매개변수를 받는 생성자만 있을 경우,
//      자식 class에서의 모든 생성자들에서 부모(super) class의 기본 생성자를 
//      호출하지 못하는 문제가 발생하여 컴파일 오류가 발생함.
//   => 부모 class의 기본 생성자를 선언해주거나 자식 class의 모든 생성자들 내에서
//      부모(super) class의 매개변수를 받는 생성자를 직접 호출하는 방식으로 우회해야 해결 가능.

public class SuperConstructorExam {

	public static void main(String[] args) {
		new Child();
		new Child(10);
		new Child("false");
	}

}
