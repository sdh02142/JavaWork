package ex0814.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	// TreeSet은 기본적으로 데이터들을 정렬해서 저장함.
	// 저음 생성할 때, 소괄호 내부에 Collections.reverseOrder() 등의 값을 넣어주면 정렬의 순서 등에 영향을 줄 수 있음.
	Set<String> set = new TreeSet<String>(Collections.reverseOrder());
	
	public SetExam(String[] data) {
		int i = 0;
		for(String s : data) {
			boolean b = set.add(s);
			if (b) i++;
			System.out.println("데이터 추가 후 결과 : " + b);
		}
		
		System.out.println("Set 내부 값 : " + set);
		System.out.println(i);
		
		// Iterator -> 자료 구조 안에 있는 데이터를 꺼낼 수 있는 method 제공
		Iterator<String> it =  set.iterator();
		
		while(it.hasNext()) { // scope가 다음 요소를 확인해서 있다면 true return
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("======= 개선된 for문 =======");
		for(String s : set) {
			System.out.print(s+" ");
		}
		
		System.out.println("======= 요소 제거 =======");
		boolean remove = set.remove("");
		System.out.println(remove);
		System.out.println(set);
	}

	public static void main(String[] args) {
		new SetExam(args);
	}

}
