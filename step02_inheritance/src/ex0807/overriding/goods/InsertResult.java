package ex0807.overriding.goods;

public enum InsertResult {
	/**
	 * 배열의 길이 벗어남
	 * */
	INSERT_OUTOFINDEX("더 이상 등록할 수 없습니다.", -1),
	
	/**
	 * 상품코드 중복
	 * */
	INSERT_DUPLICATE("는 중복이므로 등록할 수 없습니다.", 0),
	
	/**
	 * 등록 성공
	 * */
	INSERT_SUCCESS("상품이 등록되었습니다.", 1);
	
	private final String message;
	private final int errorCode;
	
	InsertResult(String message, int errorCode){
		this.message = message;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public int getErrorCode() {
		return errorCode;
	}
}
