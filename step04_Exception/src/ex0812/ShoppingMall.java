package ex0812;

public class ShoppingMall {
	public void inputAge(int age) throws AgeCheckException{
		if(age < 18) {
			throw new AgeCheckException("애들은 가라.");
		} else System.out.println("입장하신걸 환영합니다.");
	}
}
