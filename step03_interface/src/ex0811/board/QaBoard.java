package ex0811.board;

public class QaBoard extends Board {
	private boolean replyState;

	public QaBoard() {
		super();
	}
	public QaBoard(int primaryKey, String title, String author, String content, boolean replyState) {
		super(primaryKey, title, author, content);
		this.replyState = replyState;
	}

	public boolean isReplyState() {
		return replyState;
	}

	public void setReplyState(boolean replyState) {
		this.replyState = replyState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", replyState=");
		builder.append(replyState);
		builder.append("]");
		return builder.toString();
	}
}
