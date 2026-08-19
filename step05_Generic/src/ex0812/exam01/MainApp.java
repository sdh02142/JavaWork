package ex0812.exam01;

public class MainApp {

	public static void main(String[] args) {
		// Non-Generic
//		Box b = new Box();
//		
//		b.setContent("상품01");
//		if(b.getContent() instanceof String s) {
//			s = (String)b.getContent();
//			System.out.println(s);
//		}
//		
//		b.setContent(new Board());
//		if(b.getContent() instanceof Board B) {
//			B = (Board)b.getContent();
//			System.out.println(B.getBno());
//		}
		
		// Generic
		Box<String> b = new Box<>();
		b.setContent("?");
		String s = b.getContent();
		System.out.println(s);
		
		Box<Board> b2 = new Box<>();
		b2.setContent(new Board());
		Board b3 = b2.getContent();
		System.out.println(b3.getBno());
	}
}
