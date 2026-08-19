package ex0804.array;

public class MainArgsExam {

	public static void main(String[] args) {
		System.out.println("args = " + args);
		System.out.println("args.length = " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// 개선된 for문, 기존 for문에 비해 index관리는 불가능하지만 int 변수가 없기 때문에 간단한 구조를 가짐.
		for(String s : args) {
			System.out.println(s);
		}
	}

}
