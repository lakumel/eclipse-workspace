package chapter12.ex05;

public class Banana implements Fruit {

	@Override
	public void name() {
		System.out.println("바나나");
	}

	@Override
	public void eat() {
		System.out.println("바나나는 맛있다.");

	}

	@Override
	public void color() {
		System.out.println("바나나는 노랗다.");


	}

}
