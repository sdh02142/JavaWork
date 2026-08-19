package ex0804.array.students;

public class EndView {
		/**
		 * 전체 학생의 정보 출력
		 * */
		public static void printSelectAll(Student[] stArr) {
			for (int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) System.out.println("이름 : " + stArr[i].getName() + ", 나이 : " + stArr[i].getAge() + ", 주소 : " + stArr[i].getAddr());
				else break;
			}
		}
		
		/**
		 * 특정 학생의 정보 출력
		 * */
		public static void printSelectByName(Student st) {
			System.out.println("이름 : " + st.getName() + ", 나이 : " + st.getAge() + ", 주소 : " + st.getAddr());
		}
		
		/**
		 * 메세지 출력
		 * */
		public static void printMessage(String s) {
			System.out.println(s);
		}
		
		/**
		 * 전체 학생의 정보 출력
		 * */


}
