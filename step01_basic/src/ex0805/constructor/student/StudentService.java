package ex0805.constructor.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	private Student arr [] = new Student[6];
	
	public static int cnt;
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public StudentService(String data[][]) {
		if(data.length <= arr.length) cnt = data.length;
		else cnt = arr.length;
		 for(int i = 0; i<cnt; i++) {
			 this.arr[i] = this.newStudent(data[i]);
		 }
	}
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student newStudent(String [] a) {
		 Student s = new Student(a);
		 return s;
	 }
	 
	 private Student newStudent(Student s) {
		 Student s1 = new Student();
		 s1.setName(s.getName());
		 s1.setAge(s.getAge());
		 s1.setAddr(s.getAddr());
		 return s1;
	 }	

	 /**
	   학생의 정보 등록하기 
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력.
	      추가가 성공하면 "등록되었습니다" 메시지를 출력
	  **/
	 public int insert(Student s) {
		 int b = -1;
		 for(int i = 0; i<this.arr.length; i++) {
			 if(arr[i] == null) {
				 arr[i] = this.newStudent(s);
				 b = 1;
				 break;
			 } else if(this.selectByName(s.getName()) != null) {
				 b = 0;
				 break;
			 }
		 }
		 return b;
	 }
	 
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	 public Student[] selectAll() {
		 return arr;
	 }
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 * */
	 public Student selectByName(String s) {		 
		 for(int i = 0; i<this.arr.length; i++) {
			 if(arr[i] == null) continue;
			 else if(this.arr[i].getName().equals(s)) {
				 return arr[i];
			 }
		 }
		 return null;
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   "수정되었습니다" 출력
	 *   @param : Student
	 *   @return : void
	 * */
	 public boolean update(Student s) {
		 Student b = this.selectByName(s.getName());
		 if (b != null) {
			 b.setAge(s.getAge());
			 b.setAddr(s.getAddr());
			 return true;
		 } else return false;
	 }

}

