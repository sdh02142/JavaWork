package ex0810.abstract_final;

abstract class Animal{
	int legs;
	
	public abstract void sound();
	public abstract void run();
	public void eat() {
		System.out.println("super()의 eat() call");
	}
}

/*abstract*/ class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Dog()의 sound() call");
	};
	
	@Override
	public void run() {
		System.out.println("Dog()의 run() call");
	};
}

/*abstract*/ class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Cat()의 sound() call");
	}

	@Override
	public void run() {
		System.out.println("Cat()의 run() call");
	}
	
}

class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("Pig()의 sound() call");
	}

	@Override
	public void run() {
		System.out.println("Pig()의 run() call");
	}
	
	@Override
	public void eat() {
		System.out.println("Pig()의 eat() call");
	}
}

public class AbstractExam {
	public static void test(Animal an) {
		an.sound();
		an.eat();
		an.run();
		System.out.println("=============================");
	}
	
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		Animal p = new Pig();
		
		test(c);
		test(d);
		test(p);
	}
}
