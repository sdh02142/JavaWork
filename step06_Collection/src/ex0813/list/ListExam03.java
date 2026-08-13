package ex0813.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 extends ArrayList<Emp>{
	public ListExam03() {
		super.add(new Emp(20, "길동", 20, "서울"));
		super.add(new Emp(10, "철수", 30, "경기"));
		super.add(new Emp(40, "영희", 32, "부산"));
		super.add(new Emp(50, "진수", 21, "제주"));
		super.add(new Emp(30, "화영", 43, "강릉"));
	}
	
	public List<Emp> searchAll() {
		return this;
	}
	
	public Emp searchByEmpNo(int no) {
		Emp result = null;
		for(Emp e : this) {
			if(e.getEmpno() == no) {
				result = e;
				break;
			}
		}
		return result;
	}
	
	public List<Emp> searchByAddr(String addr) {
		List<Emp> result = new ArrayList<>();
		for(Emp e : this) {
			if(e.getAddr().equals(addr)) {
				result.add(e);
			}
		}
		return result;
	}
	
	public List<Emp> sortByEmpNo() {
		// Collections.sort(this); // 원본이 정렬되어버려서 이후로 원본 데이터를 불러올 수 없음.
		// 정렬을 해줄 새로운 List를 생성하여 해당 List를 정렬해서 return.
		List<Emp> shallowCopy = new ArrayList<>(this); // -> 
		// Collections.sort(shallowCopy);
		
		// Anonymous Inner Type
//		Collections.sort(shallowCopy, new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return o1.getAge()-o2.getAge();
//			}
//			
//		});
		
		// Lamda
		Collections.sort(shallowCopy);
		return shallowCopy;
	}
	
	public List<Emp> sortByAge() {
		// Collections.sort(this); // 원본이 정렬되어버려서 이후로 원본 데이터를 불러올 수 없음.
		// 정렬을 해줄 새로운 List를 생성하여 해당 List를 정렬해서 return.
		List<Emp> shallowCopy = new ArrayList<>(this); // -> 
		Collections.sort(shallowCopy, (o1, o2)->o1.getAge()-o2.getAge());
		return shallowCopy;
	}

	public static void main(String[] args) {
		// List<Emp> empList = new ArrayList<>();
		ListExam03 empList01 = new ListExam03();
		// List<Emp> empList = new ListExam03().searchAll();
		for(Emp e : empList01) {
			System.out.println(e);
		}
		System.out.println("=======================");
		
		for(Emp e : empList01.searchByAddr("서울")) {
			System.out.println(e);
		}
		System.out.println("=======================");
		
		System.out.println(empList01.searchByEmpNo(30));
		
		System.out.println("=======================");
		for(Emp e : empList01.sortByEmpNo()) {
			System.out.println(e);
		}
		System.out.println("=======================");
		for(Emp e : empList01) {
			System.out.println(e);
		}
		System.out.println("=======================");
		for(Emp e : empList01.sortByAge()) {
			System.out.println(e);
		}
	}

}

//class Test implements Comparator<Emp>{
//
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		return o1.getAge()-o2.getAge();
//	}
//}