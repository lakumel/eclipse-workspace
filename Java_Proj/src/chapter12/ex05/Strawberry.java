package chapter12.ex05;

public class Strawberry implements Fruit {

	@Override
	public void name() {
		System.out.println("딸기");
	}

	@Override
	public void eat() {
		System.out.println("딸기는 맛있다.");

	}

	@Override
	public void color() {
		System.out.println("딸기는 빨갛다.");

	}

}
