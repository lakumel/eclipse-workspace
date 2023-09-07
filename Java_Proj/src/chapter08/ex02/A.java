package chapter08.ex02;

public class A {
	//생성자
	public A(){}
	
	//필드에 부여된 접근 제어자.
	public int a = 1;			//같은 패키지나 다른 패키지에서도 접근이 가능하다.
	protected int b = 2;		//같은 패키지에서 접근가능, 다른 패키지에서 접근할때 상속관계가 설정이 되어 있어야 한다.
	int c = 3;					//외부 클래스에서 접근 가능, 단 같은 패키지에 있어야 한다.
	private int d = 4;			//같은 클래스에서만 접근, 외부 클래스에서는 접근이 안된다. 
	
	//메소드의 부여된 접근 제어자.
	public void abc() {
		System.out.println("public");
	}
	protected void bcd() {
		System.out.println("protected");
	}
	void def() {
		System.out.println("default");
	}
	private void efg() {
		System.out.println("private");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
