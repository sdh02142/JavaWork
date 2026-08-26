package stream.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStreamExam01 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>(); 
		totalList.add(new Student("장희정", "남", 92)); 
		totalList.add(new Student("하승현", "여", 87)); 
		totalList.add(new Student("오문정", "남", 95)); 
		totalList.add(new Student("김은영", "여", 93));
		
		//문제) 학생들중 남학생만 뽑아 새로운 List로 만들자
		
		System.out.println("1.학생들중 남학생만 뽑아 새로운 List로 만들자 - collect()");
		List<Student> manList = totalList.stream().filter(s->s.getGender().equals("남")).collect(Collectors.toList());
		System.out.println(manList);
		
		manList.add(new Student("a", "b", 1));
		manList.forEach(System.out::println);
		
		System.out.println("2.학생들중 남학생만 뽑아 새로운 List로 만들자 - toList()"); // 새로 만들어진 List는 불변 객체.
		List<Student> manList2 = totalList.stream().filter(s->s.getGender().equals("남")).toList();
		System.out.println(manList2);
		
//		manList2.add(new Student("a", "b", 1));
//		manList2.forEach(System.out::println);
	
		System.out.println("----toMap<K, V> 사용해보자-------");
		System.out.println("3.학생들정보를 이름을 key , 점수를 value 만들이서 Map 리턴해보자");
		Map<String, Integer> studentMap = totalList.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
		System.out.println(studentMap);
	}

}














