package ex0805.constructor.student;

public class StudentTest {
	public static void main(String[] args) {
		String data[][] = {
				{"길동", "21", "성남"},
				{"철수", "24", "서울"},
				{"영희", "32", "부산"}
		};
		
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		StudentService service = new StudentService(data);//StudentService의 전역변수들이 초기화 
//		service.init(data); // 초기치데이터 세팅
		
		//전체학생정보 출력
		Student [] sAll = service.selectAll();
		EndView.printSelectAll(sAll);
		
		//등록하기
		System.out.println("--1. 등록하기 -----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		int result = service.insert(student);
		
		if(result == -1) EndView.printMessage("더 이상 추가할 수 없습니다.");
		else if(result == 0) EndView.printMessage("이름이 중복됩니다.");
		else if(result == 1) EndView.printMessage("등록되었습니다.");
		else System.out.println("서버 오류.");
		
		System.out.println("--2. 전체검색 -----");
		EndView.printSelectAll(sAll);
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		Student newS = service.selectByName("철수");
		if(newS == null) EndView.printMessage("찾는 정보가 없습니다.");
		else EndView.printSelectByName(newS);
		
		System.out.println("--이름이 없는경우----");
		newS = service.selectByName("삼순이");
		if(newS == null) EndView.printMessage("찾는 정보가 없습니다.");
		else EndView.printSelectByName(newS);
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student("미미", 23, "대전");
		
		if (service.update(st2)) EndView.printMessage("수정되었습니다.");
		else EndView.printMessage("수정할 수 없습니다.");
		
		System.out.println("---변경후 ---");
		EndView.printSelectAll(sAll);
	}

}








