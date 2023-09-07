package Chapter06.ex01;		//클래스를 조직화 하는 폴더,

//클래스 외부에 올 수 있는 3가지
//1.패키지 이름, 2.임포트(같은 패키지에 존재하지 않는 클래스는 import), 3.외부 클래스

class A{//외부 클래스 : public class는 하나만 와야 한다.(1개만 존재 해야 함) 그렇기에 여기에 public를 넣으면 오류가 난다.
	
	//1.생성자:리턴타입이 없고 클래스 이름과 동일한 메소드, 객체를 생성시 생성자를 호출하도록 되어 있다.
		//A(){} : 인풋 매개변수가 없는 생성자를 기본 생성자라고 한다., 참고로 기본 생성자는 생략이 될 수 있다.
		//생성자는 필드의 값을 초기화 할때 사용됨.
	public A(){} 		//기본 생성자. : 생략 가능, 생성자가 존재하지 않으면 객체를 생성 할 수 없다.
	
	//2.필드 : 객체화 해서 사용됨.(Heap 메모리에 저장됨)
	int m =3;
	int n =7;
	double d=10.5;
	
	//3.메소드 (호출시 작동, 필드의 내용을 출력하는 메소드)
	public void print() {
		System.out.println("m : " + m );
		System.out.println("n : " + n );
		System.out.println("d : " + d );
	}
	
	
	
}

public class Object02 {
	//여기가 클래스 블락
	//참고로 클래스 블락에 올 수 있는 것은
	//1.생성자, 2. 필드, 3.메소드, 4.이너 클래스(클래스 내부의 클래스)
	

	public static void main(String[] args) {
		//main 메소드(함수)
		
		int b = 10; 		//지역 변수, 메소드 브락에서 선언된 변수, if, switch, for, while, do while
							//블락을 벗어나면 사라지는 변수
							//애는 stack 공간에 저장됨
		
		//객체 생성 : 클래스의 필드와 메소드를 객체화 해서 ram(메모리)로 로드함.
		A a = new A(); 		//new 기본생성자 호출();
		
		//객체의 필드의 값을 출력
		System.out.println(a.m);	//3
		System.out.println(a.n);	//7
		System.out.println(a.d);	//10.5
		
		//a 객체의 메소드 호출
		a.print();
		
		System.out.println("==================================");
		//객체의 필드의 값을 수정후 출력
		a.m = 100;
		a.n = 200;
		a.d = 300.55;
		
		//메소드 호출
		a.print();
		
		System.out.println("======================");
		//클래스는 하나의 틀을 가지고 여러개의 객체를 만들어낼 수 있다.
		
		A aa=new A(); //
		
		//필드의 값을 할당.
		aa.m = 200;
		aa.n = 300;
		aa.d = 30.33;
		
		aa.print();
		
		
		
		

	}

}
