package chapter10.ex03;

class Animal{
	
	void cry(){		//메소드는 소문자
		System.out.println("모든 동물은 웁니다.");
	}
}

class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("어흥~~~~");
	}
}

class Eagle extends Animal{
	
	@Override
	void cry() {
		System.out.println("끼이오옷~~~~");
	}
	
}
class Lion extends Animal{
	
	@Override
	void cry() {
		System.out.println("크아앙~~~");
	}
}


public class MethodOverriding02 {
	public static void main(String[] args) {
		
		//1.Animal을 animal 타입으로 객체화
		Animal a1 = new Animal();
		a1.cry(); 		//animal 클래스에 있는 cry를 호출
		
		//2.자식을 객체화 하면서 부모타입으로 선언 : 오버라이딩된 메소드가 출력됨.
		Animal a2 = new Tiger();
		a2.cry(); 		//a2의 cry 메소드는 animal의 메소드 호출인데 animal의 메소드가 출력되는것이 아니라 오버라이딩된 메소드가 출력
		
		Animal a3 = new Eagle();
		a3.cry();
		
		Animal a4 = new Lion();
		a4.cry();
		
		
		
		
	}

}
