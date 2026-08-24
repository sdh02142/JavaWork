package mvc.dto;

import java.io.Serializable;

/**
 * 전자제품의 속성을 관리하는 객체 
 */

public class Person implements Serializable{
    private String name;
    private int weight;
    private String pw;

    // 생성자 3개
    public Person () {}

    // 모델번호에 해당하는 전자제품 수정할 때 사용할 생성자
    public Person (String name) {
        this.name = name;        

    }

    public Person (String name, int weight, String pw) {
        this(name); // 생성자 구현부 첫번째 줄에서 다른 생성자 호출 

        this.weight = weight;
        this.pw = pw;

    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", pw=");
		builder.append(pw);
		builder.append("]");
		return builder.toString();
	}
}
