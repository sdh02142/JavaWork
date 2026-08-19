package ex0814.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<Member>();
	
	public MemberSetExam() {
		/**
		 * set의 중복 불가는 객체의 경우에는 해당 객체의 주소값(hashCode() ==> int값 return)을 비교해서 같고,
		 * equals()의 결과값 또한 true로 나올 경우에 중복으로 판단하여 저장하지 않음.
		 * */
		set.add(new Member("영희", 21, "서울"));
		set.add(new Member("영희", 12, "경기"));
		set.add(new Member("영희", 21, "대전"));
		
		System.out.println("저장된 객체 수 : " + set.size());
		System.out.println("저장된 객체 : " + set);
	}

	public static void main(String[] args) {
		new MemberSetExam();
	}

}
