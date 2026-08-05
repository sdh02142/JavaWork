package ex0804.array;

//ObjectInArray.java

//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//메인 메소드에서 
	//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
	public static void main(String[] args) {
		//5개의 ObjectOne객체를 생성하세요.
		ObjectOne [] oo = new ObjectOne[5];
		
		for(int i = 0; i < oo.length; i++) {
			//각 객체가 갖고있는 전역변수 출력
			//각 객체의 주소값 출력
			//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.	
			oo[i] = new ObjectOne();
			System.out.println(oo[i].a);
			System.out.println(oo[i]);
			oo[i].a = i;
		}
		System.out.println();
		
		//각 ObjectOne 객체의 a를 출력하세요
		for(int i = 0; i < oo.length; i++) {
			System.out.println(oo[i].a);
		}	
	}	
}