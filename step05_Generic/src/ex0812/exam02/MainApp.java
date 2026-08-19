package ex0812.exam02;

public class MainApp {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("Samsung");
		
		Tv tv = p1.getKind();
		String model = p1.getModel();
		
		/////////////////////////////////
		Product<Video, Integer> p2 = new Product<>();
		p2.setKind(new Video());
		p2.setModel(5);
		
		Video vd = p2.getKind();
		int mNo = p2.getModel();
	}
}
