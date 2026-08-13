package ex0812.exam01;

//public class Box {
//	private Object content;
//
//	public Object getContent() {
//		return content;
//	}
//
//	public void setContent(Object content) {
//		this.content = content;
//	}
//}

/**
 * Generic은 결정되지 않은 type을 실행할 때, 구체적인 type으로 결정하는 것.
 * <> 안에 대문자 알파벳으로 선언
 * */
public class Box<T> {
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}