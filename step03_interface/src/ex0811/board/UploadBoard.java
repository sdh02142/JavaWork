package ex0811.board;

public class UploadBoard extends Board {
	private String fileName;

	public UploadBoard() {
		super();
	}
	public UploadBoard(int primaryKey, String title, String author, String content, String fileName) {
		super(primaryKey, title, author, content);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
}
