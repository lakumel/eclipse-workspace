package chapter10.ex01;

//부모클래스(Animal) : 동물 클래스

class Animal{
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("Animal - 모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("Animal - 모든 동물은 잠을 잡니다.");
	}
}

//자식 클래스(Tiger, Eagle, Lion====>Animal)	//추가적으로 필드1 : TigerSound, 메소드 1 : 00run

class Tiger extends Animal{
	String tigerSound;
	void tigerRun() {
		System.out.println("Tiger - 호랑이는 껑충 껑충 달립니다.");
	}
}

class Eagle extends Animal{
	String eagleSoung;
	void eagleRun() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
}

class Lion extends Animal{
	String lionSound;
	void lionRun() {
		System.out.println("사자는 펄쩍 펄쩍 달립니다.");
	}
}


//자식의 자식클래스(Lionchild ===>Lion)


class Lionchild extends Lion{
	String lionchildSound;
	void lionchildRun() {
		System.out.println("새끼사자는 엉금 엉금 기어 갑니다.");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
	//부모 :Animal 클래스 생성
	
	Animal a1 = new Animal();  //a1이라는 객체는 animal 타입만 가지고 있다.
		
	//자식 : tiger, eagle, lion ==> animal
	Tiger t1 = new Tiger();			//t1이라는 객체는 tiger 타입도 가지고 있고 animal 타입도 가지고 있다.

	Eagle e1 = new Eagle();	//e1 : eagle, animal 타입도 내포하고 있다.
	
	Lion l1 = new Lion();		//l1 : lion, animal 타입을 내포하고 있다.
	
	//자식의 자식 lionchild ===> lion	//lc1 : lionchild , lion, animal 타입이 존재 
	
	Lionchild lc1 = new Lionchild();
	
	
	
	}

}
