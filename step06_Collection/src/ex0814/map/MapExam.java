package ex0814.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {
	//Map<String, Integer> map = new HashMap<>();
	Map<String, Integer> map = new TreeMap<>(); // tree 구조는 자동으로 정렬을 지원함(Key값 기준)
	
	public MapExam() {
		map.put("길동", 10);
		map.put("철수", 20);
		map.put("영희", 10);
		map.put("민철", 30);
		map.put("철수", 30); // Value값 덮어쓰기(수정)
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println();
		System.out.println("Key & Value");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int i = map.get(key);
			System.out.println(key + " : " + i);
		}
		
		System.out.println();
		System.out.println("Key & Value(개선된 for문)");
		
		for(String key : map.keySet()) {
			int i = map.get(key);
			System.out.println(key + " : " + i);
		}
		
		System.out.println();
		System.out.println("Map Entry 접근");
		Set<Map.Entry<String, Integer>> setEntry = map.entrySet();
		for(Map.Entry<String, Integer> e : setEntry) {
			// System.out.println(e); ==> Key + "=" + Value
			String key = e.getKey();
			int value = e.getValue();
			System.out.println(key + " & " + value);
		}
		System.out.println();
		System.out.println(map.remove("영희")); // return값 : null 또는 지우려는 key에 해당하는 value값
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		new MapExam();
	}

}
