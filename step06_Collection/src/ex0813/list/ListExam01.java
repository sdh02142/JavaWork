package ex0813.list;

import java.util.ArrayList;

public class ListExam01 extends ArrayList<Integer>{
	public ListExam01(){
		super(5); // ArrayList의 생성자 중 int형 매개변수를 받는 생성자 호출
	
		super.add(5);
		this.add(10);
		add(3);

		System.out.println("저장된 객체의 개수 : " + super.size());
		
		for(Integer i : this) {
			int val = i;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new ListExam01(); // 선언된 기본 생성자 내의 코드 실행
		
	}

}
