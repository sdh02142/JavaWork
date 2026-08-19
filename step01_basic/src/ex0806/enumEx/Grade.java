package ex0806.enumEx;

/**
 * enum은 열거형으로 안에 정의된 정보는 [static final = 상수] 취급함.*/

public enum Grade {
	BRONZE("준회원", 100, 5),
	SILVER("정회원", 200, 4),
	GOLD("우수회원", 300, 3),
	PLATINUM("부매니저", 400, 2),
	DIAMOND("매니저", 500, 1);
	
	// 생성자가 호출되는 시점에서 값이 지정되기 때문에 
	// enum 내부 필드에는 static이 올 수 없음.
	private final String kind;
	private final int point;
	private final int role;
	
	// enum 내에 있는 생성자들은 무조건 [private]
	Grade(String kind, int point, int role){
		this.kind = kind;
		this.point = point;
		this.role = role;
	}

	public String getKind() {
		return kind;
	}

	public int getPoint() {
		return point;
	}

	public int getRole() {
		return role;
	}
	
}
