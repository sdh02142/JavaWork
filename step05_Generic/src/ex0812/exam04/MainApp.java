package ex0812.exam04;

public class MainApp<K> {

	public static void main(String[] args) {
		
	}
	
	public <T> void test01(T t, K k) {
		System.out.println(t);
		System.out.println(k);
		// Generic method에서 Generic 표기의 이유 중 하나는
		// 해당 method에서 해당 Generic을 사용하기 위해 미리 선언하려는
		// 이유가 포함됨.(scope 범위라고 이해하면 좋음.)
	}

}
