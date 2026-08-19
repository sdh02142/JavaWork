package ex0729.연산자;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f)); // f
		System.out.println("true&true="+(t&t)); // t
		System.out.println("false&false="+(f&f)); // f
		System.out.println();
	
		System.out.println("true|false="+(t|f)); // t
		System.out.println("true|true="+(t|t)); // t
		System.out.println("false|false="+(f|f)); // f
		System.out.println();

		// ^(XOR)은 양쪽 값이 같을 때 false, 다를 경우엔 true를 반환.
		System.out.println("true^false="+(t^f)); // t
		System.out.println("true^true="+(t^t)); // f
		System.out.println("true^false="+(t^f)); // t
		System.out.println("true^true="+(t^t)); // f
		System.out.println();

		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("true&&true="+(t&&t)); // t
		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("false&&false="+(f&&f)); // f
		System.out.println();

		System.out.println("true||false="+(t||f)); // t
		System.out.println("true||true="+(t||t)); // t
		System.out.println("false||false="+(f||f)); // f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);
		System.out.println("i>=j==>>"+(i>=j)); // t
		System.out.println("i>j=>>"+(i>j)); // t
		System.out.println("i<=j=>>"+(i<=j)); // f
		System.out.println("i<j=>>"+(i<j)); // f
		System.out.println("i==j=>>"+(i==j)); // f
		System.out.println("i!=j=>>"+(i != j)); // t
		
		System.out.println("-------------");
		
		System.out.println("단일(|) 논리 연산자 결과 : " + (true | test()));
		
		System.out.println("-------------");
		
		System.out.println("이중(||) 논리 연산자 결과 : " + (true || test()));
	} // main method 끝
	
	public static boolean test() {
		System.out.println("test called");
		return true;
	}
}