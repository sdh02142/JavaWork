package ex0804.array.students;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	private Student arr [] = new Student[5];
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public void init(String [][] a) {
		 for(int i = 0; i<3; i++) {
			 this.arr[i] = this.newStudent(a[i]);
		 }
	 }
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student newStudent(String [] a) {
		 Student s = new Student();
		 s.setName(a[0]);
		 s.setAge(Integer.parseInt(a[1]));
		 s.setAddr(a[2]);
		 return s;
	 }
	
	

	 /**
	   학생의 정보 등록하기 
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력.
	      추가가 성공하면 "등록되었습니다" 메시지를 출력
	  **/
	 public void insert(Student s) {
		 boolean b = true;
		 
		 for(int i = 0; i<this.arr.length; i++) {
			 if(arr[i] == null) {
				 arr[i] = s;
				 System.out.println("등록되었습니다.");
				 b = false;
				 break;
			 }
		 }
		 if (b) System.out.println("더 이상 추가할 수 없습니다.");
	 }
	 
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	 public void selectAll() {
		 for(int i = 0; i<this.arr.length; i++) {
			 if(this.arr[i] != null) System.out.println("이름 : " + arr[i].getName() + ", 나이 : " + arr[i].getAge() + ", 주소 : " + arr[i].getAddr());
			 else continue;
		 }
	 }
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 * */
	 public void selectByName(String s) {
		 boolean b = true;
		 
		 for(int i = 0; i<this.arr.length; i++) {
			 if(this.arr[i] == null) continue;
			 if(this.arr[i].getName().equals(s)) {
				 System.out.println("이름 : " + arr[i].getName() + ", 나이 : " + arr[i].getAge() + ", 주소 : " + arr[i].getAddr());
				 b = false;
				 break;
			 }
		 }
		 if (b) System.out.println("찾는 정보가 없습니다.");
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   "수정되었습니다" 출력
	 *   @param : Student
	 *   @return : void
	 * */
	 public void update(Student s) {
		 boolean b = true;
		 
		 for(int i = 0; i<this.arr.length; i++) {
			 if(this.arr[i] == null) continue;
			 if(this.arr[i].getName().equals(s.getName())) {
				 this.arr[i].setAge(s.getAge());
				 this.arr[i].setAddr(s.getAddr());
				 System.out.println("수정되었습니다.");
				 b = false;
				 break;
			 }
		 }
		 if (b) System.out.println("수정할 수 없습니다.");
	 }

}

