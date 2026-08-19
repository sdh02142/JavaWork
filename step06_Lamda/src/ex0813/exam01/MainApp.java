package ex0813.exam01;

public class MainApp {
	public static void main(String[] args) {
		// 1. 기존 방식
//		AInterface ai = new A();
//		ai.aa();
		
		// 2. 익명의 Inner Class(AnonymousInnerClass) type으로 작성
		AInterface ai = new AInterface() {
			// 소괄호로 끝난다면 일반적인 객체 생성이지만 위와 같은 Inner Class
			// 형태로 사용할 경우엔 생성이 아닌 구현부 작성의 형태로 된 것.
			@Override
			public void aa() {
				System.out.println("aa() call from Anonymous Inner Class");
			}
		}; // AInterface 구현 완료
		ai.aa();

		// 3. 람다식(Lamda)
		AInterface aiL = () ->/* 람다(Lamda) */ System.out.println("aa() call from interface AInterface using Lamda");
			

		aiL.aa();
		
		BInterface biL = (i) ->/* 람다(Lamda) */ {
			System.out.println("bb() call from interface BInterface using Lamda");
			System.out.println(i);
			};
		biL.bb(77);
		
		CInterface ciL = (i, j) ->/* 람다(Lamda) */ {
			System.out.println("cc() call from interface CInterface using Lamda");
			return i+j;
			};
		System.out.println(ciL.cc(77, 23));	
	}
}
class A implements AInterface{

	@Override
	public void aa() {
		System.out.println("aa() call from class A implements AInterface");
	}
	
}