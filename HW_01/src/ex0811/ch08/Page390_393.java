package ex0811.ch08;

public class Page390_393 {

	public static void main(String[] args) {
		/**
		 * 1. 1번
		 * 2. 3번
		 * 3. 4번
		 * 4. 1, 2, 3, 4번
		 * 5. implements Remocon,
		 *
		public void powerOn() {
			System.out.print("TV를 켰습니다.");
			}
		 * 
		 * 6.
		class Cat implements Soundable{
			public String sound() {
				return "야옹";
			}
		}
		class Dog implements Soundable{
			public String sound() {
				return "멍멍";
			}
		}
		 *
		 * 7.
		public interface DataAccessObject{
			void select();
			void insert();
			void update();
			void delete();
		}

		public class OracleDao implements DataAccessObject{

			@Override
			public void select() {
				System.out.println("Oracle DB에서 검색");
			}

			@Override
			public void insert() {
				System.out.println("Oracle DB에서 삽입");
			}

			@Override
			public void update() {
				System.out.println("Oracle DB에서 수정");
			}

			@Override
			public void delete() {
				System.out.println("Oracle DB에서 삭제");
			}
			
		}
		public class MySqlDao implements DataAccessObject{

			@Override
			public void select() {
				System.out.println("MySql DB에서 검색");
			}

			@Override
			public void insert() {
				System.out.println("MySql DB에서 삽입");
			}

			@Override
			public void update() {
				System.out.println("MySql DB에서 수정");
			}

			@Override
			public void delete() {
				System.out.println("MySql DB에서 삭제");
			}
			
		}
		
		 * 8. a instanceof C c
		 */
		
		 /* 
		 * */
	}

}
