package ex0729.연산자;

class MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j); // 문자열 "52"
		// 괄호로 묶이지 않았고 연산자 우선순위가 서로 같은 + 이므로 왼쪽에서부터 순차적 연산이 이루어짐
		System.out.println("i-j="+(i-j)); // 3
		System.out.println("i*j="+(i*j)); // 10
		System.out.println("i/j="+(i/j)); // 2
		System.out.println("i%j="+(i%j)); // 1

		System.out.println("i="+i); // 5
		
		int k=i++;
		System.out.println("k="+k); // 5
		System.out.println("i="+i); // 6
		
		int p=++i;
		System.out.println("p="+p); // 7
		System.out.println("i="+i); // 7

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4; // 9

		System.out.println("19+4*3/2-10*2+4="+x);
		System.out.println("--------------------");
		
		System.out.println("++x = " + ++x +", / x++ = " + x++);
		System.out.println("--------------------");
		short a = 1;
		char b = 'a';
		// char ab = a+b; <- 컴파일 단계에서의 error
		char ab = (char)(a+b);
		System.out.println(ab);
		
		System.out.println("--------------------");
		byte c = 1;
		byte d = 2;
		// byte e = c+d;
		byte e = (byte)(c+d);
		System.out.println(e);
	}	
}