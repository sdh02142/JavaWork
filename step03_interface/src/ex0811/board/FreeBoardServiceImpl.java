package ex0811.board;

public class FreeBoardServiceImpl implements BasicBoardService {

	@Override
	public int register(Board b) {
		return 0;
	}

	@Override
	public int edit(Board b) {
		return 0;
	}

	@Override
	public int delete(int primaryKey) {
		System.out.println("FreeBoardServiceImpl Class's delete() call");
		return 0;
	}

//	@Override
//	public void searchAll(Board [] b) {
//		
//	}
}
