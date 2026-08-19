package ex0810.superkeyword;

class Animal {
	int age = 5;
	String bodyColor;
	
	public void sound() {
		System.out.println("super의 sound() call");
	}
	
	public void eat() {
		System.out.println("super의 eat() call");
	}
}

class Cat extends Animal { // Cat is an Animal 성립
	int age = 10;
	int weight;
	
	@Override // annotation(@)
	public void sound() {
		System.out.println("Cat의 sound() call");
	}
	
	public void run() {
		System.out.println("Cat의 run() call");
	}
	
	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		System.out.println("----------------------");
		
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		
		System.out.println("----------------------");
		
		System.out.println(weight);
		System.out.println(this.weight);
		// System.out.println(super.weight);
		
		System.out.println("----------------------");
		
		sound();
		this.sound();
		super.sound();
		
		System.out.println("----------------------");
		
		eat();
		this.eat();
		super.eat();
		
		System.out.println("----------------------");
		
		run();
		this.run();
		// super.run();
	}
}

public class InheritanceFieldMethod {

	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.test();
		
		Cat c = new Cat();
		System.out.println("-- 외부에서 객체 생성 및 접근 --");
		System.out.println(c.age);
		System.out.println(c.bodyColor);
		System.out.println(c.weight);
		
		System.out.println("-- 외부에서 method 접근 --");
		c.sound();
		c.eat();
		c.run();
		
		Animal an = new Cat();
		System.out.println("-- 외부에서 부모 타입의 자식 객체 생성 및 접근 --");
		System.out.println(an.age);
		System.out.println(an.bodyColor);
		// System.out.println(an.weight); 
		
		System.out.println("-- 외부에서 부모 타입의 자식 객체 method 접근 --");
		an.sound(); // <- 재정의된 method는 부모 타입으로 담긴 자식 객체에서도
		//                우선 순위가 재정의된 method를 우선으로 여겨짐.
		an.eat();
		// an.run(); <- 캐스팅 필요
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println("an = " + an);
		
		
		if(an instanceof Cat c1) { //<- 추가된 문법. 바로 아래 문장을 if문의 조건문 부분에서 축약해서 실행가능.
			// Cat c1 = (Cat)an;
			System.out.println("c1 = " + c1);
			c1.sound();
			c1.eat();
			c1.run();
		}
	}

}
