package chapter12.ex01;

abstract class Animal{		//추상 메소드를 포함하고 있는 추상 클래스

	//구현부가 없이 선언만된 메소드 : 추상 메소드 <== 자식 클래스에서 오버라이딩해서 구현부를 만들어 줘야 한다.
	abstract void eat();
	abstract void run();
	abstract void cry();
	
}

class Tiger extends Animal{// 콘크리트 클래스 : 추상 메소드를 모두 구현한 클래스
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}

	@Override
	void run() {
		System.out.println("호랑이는 껑충껑충 달립니다.");
	}

	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 웁니다.");
	}	
	
}
abstract class Lion extends Animal{ 	//추상 클래스 : 부모의 추상 메소드를 일부만 구현한 경우 

	@Override
	void eat() {
		System.out.println("사자는 고기를 먹습니다.");
	}
	@Override
	void run() {
		System.out.println("사자는 펄쩍펄쩍 달립니다.");
	}
}

class LionChild extends Lion{ 	//콘크리트 클래스 : 부모의 추상 메소드를 모두 구현한 클래스

	@Override
	void cry() {
		System.out.println("아기 사자는 응애하고 웁니다.");
	}
	
}

public class Abstract_Method02 {
	public static void main(String[] args) {
		//1.추상클래스는 객체화 할 수 없다.
		//Animal a1 = new Animal();
		
		//2.자식클래스를 객체화 해서 타입으로 지정은 가능하다.
		Animal a2 = new Tiger();
		
		//Animal a3 = new Lion(); 		//lion은 콘크리트 클래스가 아닌 일부만 구현된 추상 클래스이므로 객체화 할 수 없다.
		
		Animal a4 = new LionChild();
		
		//3.오버라이딩된 메소드 호출
		a2.run();
		a2.eat();
		a2.cry();
		System.out.println("===============");
		
		//Animal의 메소드 호출시 오버라이딩된 메소드 호출
		a4.run();
		a4.eat();
		a4.cry();
	}

}
