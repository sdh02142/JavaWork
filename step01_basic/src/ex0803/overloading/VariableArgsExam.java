package ex0803.overloading;

public class VariableArgsExam {
	public void aa(int ... i) {
		// ...이 붙은 인수는 배열이 됨.(=> i는 현재 배열을 받는 인수가 됨.)
		System.out.println("i = " + i);
		System.out.println("\n**************************");
	}
	
	//The variable argument type String of the method bb must be the last parameter
	public void bb(/*String ... strings*/int i, String ...strings) {
		// 파라미터(인수)에서 ...를 사용하려면 사용하려는 인수의 배치를 마지막으로 설정해야함.
	}
	
	public static void main(String[] args) {
		System.out.println("call method");
		
		VariableArgsExam va = new VariableArgsExam();
		va.aa(5);
		va.aa(5, 3, 1);
		va.aa();
		va.aa(5, 1, 2, 3, 4, 5, 6, 7);
		
		// va.aa("hi");
		
		
	}

}
