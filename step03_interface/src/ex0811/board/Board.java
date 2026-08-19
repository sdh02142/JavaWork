package ex0811.board;
/**
 * 모든 게시판이 공통으로 갖는 속성을 관리하는 객체 ( VO = DTO = Domain )
 * */
public class Board {
	private int primaryKey;
	private String title;
	private String author;
	private String content;
	
	public Board() {}
	public Board(int primaryKey, String title, String author, String content) {
		super();
		this.primaryKey = primaryKey;
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public int getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName() + " [primaryKey=");
		builder.append(primaryKey);
		builder.append(", title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append(", content=");
		builder.append(content);
		return builder.toString();
	}
	
}
