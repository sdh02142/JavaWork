package ex0806.enumEx;

public class EnumTest {

	public static void main(String[] args) {
		Grade g = Grade.BRONZE;
		
		switch (g) {
		case BRONZE :
			System.out.println("5");
			break;
		case SILVER :
			System.out.println("4");
			break;
		case GOLD :
			System.out.println("3");
			break;
		case PLATINUM :
			System.out.println("2");
			break;
		case DIAMOND :
			System.out.println("1");
			break;
		}
	}
}
