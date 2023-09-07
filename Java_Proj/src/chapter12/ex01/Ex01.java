package chapter12.ex01;

abstract class Car{//추상 클래스 : 트럭, 자가용, 굴삭기, 봉고 ......
	
	abstract void run();
	abstract void eat();	//트럭 : 경유, 자가용:휘발유, 굴삭기: 경우, 봉고 LPG
}

class T1 extends Car{

	@Override
	void run() {
		System.out.println("트럭은 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("트럭은 경유를 먹습니다.");
	}
	
}

class T2 extends Car{
	@Override
	void run() {
		System.out.println("자가용은 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다.");
	}
	
}

class T3 extends Car{
	@Override
	void run() {
		System.out.println("굴삭기는 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("굴삭기는 경유를 먹습니다.");
	}
	
}

class T4 extends Car{
	@Override
	void run() {
		System.out.println("봉고는 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("봉고는 LPG가스를 먹습니다.");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		//구현한 클래스를 생성후 자식 객체를 생성시 부모타입으로 지정후 오버라이딩된 메소드 호출
		//12 : 20
		
		Car c1 = new T1();
		Car c2 = new T2();
		Car c3 = new T3();
		Car c4 = new T4();
		
		System.out.println("===T1(트럭)====");
		
		c1.run();
		c1.eat();
		
		System.out.println("===T2(자가용)====");
		
		c2.run();
		c2.eat();
		
		System.out.println("===T3(굴삭기)====");
		
		c3.run();
		c3.eat();
		
		System.out.println("===T4(봉고)====");
		
		c4.run();
		c4.eat();
		
	}

}
