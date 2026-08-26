package stream.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MatchStreamExam02 {
	public static void main(String[] args) {
		List<Student> list  = Arrays.asList(
				   new Student("희정", 22, 80, "컴퓨터"),
				   new Student("나영", 25, 60, "과학"),
				   new Student("미영", 21, 82, "컴퓨터"),
				   new Student("삼순", 30, 95, "국어"),
				   new Student("삼식", 22, 70, "수학"),
				   new Student("효경", 50, 80, "국어")
		 );
		
		//1. allMatch - 모든학생의 점수가 80이상인지 ?
		System.out.println("1. allMatch - 모든학생의 점수가 80이상인지 ?");
		if(list.stream().allMatch(s->s.getScore()>=80)) System.out.println("이상");
		else System.out.println("아님");
		
		System.out.println();
		//2. anyMatch - 학생중에 80이상이 한명이라도 있는지?
		System.out.println("2. anyMatch - 학생중에 80이상이 한명이라도 있는지?");
		if(list.stream().anyMatch(s->s.getScore()>=80)) System.out.println("있음");
		else System.out.println("없음");
		
		System.out.println();
		//3 . noneMatch - 80이상이 아무도 없니?
		System.out.println("3 . noneMatch - 80이상이 아무도 없니?");
		if(list.stream().noneMatch(s->s.getScore()>=80)) System.out.println("없음");
		else System.out.println("1명 이상 있음");
		
		//4. max() - 가장 많은 나이
		System.out.println("4. max() - 가장 많은 나이는?");
		System.out.println(list.stream().mapToInt(Student::getAge).max().orElse(0));
		System.out.println(list.stream().max((s1, s2)->s1.getAge()-s2.getAge()).orElse(null));
		System.out.println("----------------------");
		
		int arr []= new int [] {1,3,5,6,8};
		
		System.out.println("5. max() - 최대값?");
		System.out.println(Arrays.stream(arr).max().orElse(0));
		
		System.out.println("6. min() - 최소값?");
		System.out.println(Arrays.stream(arr).min().orElse(0));
	}

}












