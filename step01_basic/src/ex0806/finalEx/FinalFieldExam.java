package ex0806.finalEx;

public class FinalFieldExam {
	int i;
	
	/**
	 * final 필드는 반드시 초기화가 필수.(값을 설정해야함.)
	 * 1) 명시적 초기화
	 * 2) 생성자 내부에서 초기화 -> 객체 생성 시점에 자동으로 생성자가 호출되면서 값이 결정되기 때문에 가능.
	 * */

	final int j; // final은 값 변경 불가인 고정값이 됨.
	
	/**
	 * static final 필드는 상수
	 * 1) 명시적 초기화.
	 * 2) static 블럭 내부에서 초기화
	 * 
	 * ※ static final 단위의 상수의 명칭은 알파벳 대문자로 이루러진 단어 단위와 snake 명명법을 따름
	 * */
	// static final int K_PRICE = 600;
	static final int K_PRICE;
	static {
		K_PRICE = 600;
	}
	
	FinalFieldExam(){
		this.j = 100;
	}
	
	FinalFieldExam(int k){
		this.j = k;
	}
	
	public static void main(String[] args) {
		FinalFieldExam fFE = new FinalFieldExam();
		FinalFieldExam fFE2 = new FinalFieldExam(57);
		
		fFE.i = 50;
		//fFe.j = 200; 
		
		System.out.println(fFE.j);
		System.out.println(fFE2.j);
	}

}
