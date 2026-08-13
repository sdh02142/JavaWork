package ex0811.board;

/**
 * 모든 게시판 유형들이 공통으로 사용할 method들 정의 ( 규격서 역할 )
 * */

public interface BasicBoardService {
	/**
	 * 등록
	 * @param : Board
	 * @return : int(0 = 실패, 1 = 성공, -1 = 오류)
	 * */
	public int register(Board b);
	
	/**
	 * 수정(글 번호 탐색 / 글 제목, 내용 수정)
	 * @param : Board
	 * @return : int(0 = 실패, 1 = 성공, -1 = 오류)
	 * */
	public int edit(Board b);
	
	/**
	 * java 1.8 version 이후 추가
	 *  : interface 안에 있는 메소드에 static or default 제한자를 추가하면
	 *    body있는 메소드를 만들수 있다.
	 *    body가 있는 메소드는 구현객체들이 재정의 선택적으로 할수 있다.
	 *
	 *    1) static
	 *         : 구현객체없이 바로 interface이름.메소드이름() 호출
	 *
	 *    2) default
	 *         : 반드시 구현 객체가 있어야 호출할 수 있다 .
	 *
	 * java 1.9 version 이후 private 메소드
	 *   - 인터페이스 내부 코드의 중복 제거를 위한 helper 메서드
	 *     private이기 때문에 구현 클래스에게도 상속되지 않고 직접 호출할 수도 없다.
	 *     인터페이스의 private 메서드는 구현 클래스에게 제공하려는 메서드가 아니라,
	 *     인터페이스 내부의 default/static 메서드에서 공통 로직을 재사용하기 위한 내부용 메서드
	 *     
	 **/
	
	 /**
	 * 삭제
	 * @param : Board
	 * @return : int(0 = 실패, 1 = 성공, -1 = 오류)
	 * */
	default int delete(int primaryKey) {
		System.out.println("BasicBoardService Interface's delete() call");
		return 0;
	};
	
	/**
	 * 전체 검색
	 * @param : Board []
	 * @return : void
	 * */
	static void searchAll(Board [] b) {
		for(Board ba : b) {
			System.out.println(ba);
		}
	}

	/**
	 * 상세보기
	 * @param : int - 글번호
	 * @return : Board
	 * */
	private Board searchByNo(int primaryKey) {
		return null;
	}
	
	private static Board searchByNo2(int primaryKey) {
		return null;
	}
}
