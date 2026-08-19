package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam02 extends ArrayList<Integer>{
	List<Integer> list = new ArrayList<Integer>();
	
	public ListExam02(){
		super(5); // ArrayList의 생성자 중 int형 매개변수를 받는 생성자 호출
	
		list.add(5);
		list.add(10);
		list.add(3);

		System.out.println("저장된 객체의 개수 : " + list.size());
		
		for(Integer i : list) {
			int val = i;
			System.out.println(val);
		}
		
		System.out.println("this.list = " + this.list);
		
		list.remove(1);
		System.out.println("remove = " + this.list);
		
		Collections.sort(list);
		System.out.println("sort = " + this.list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse sort = " + this.list);
	}

	public static void main(String[] args) {
		new ListExam02(); // 선언된 기본 생성자 내의 코드 실행
		
	}

}
