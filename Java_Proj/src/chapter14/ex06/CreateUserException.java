package chapter14.ex06;

//1.일반 예외 (사용자 정의 예외)
class MyException extends Exception{
	//1.기본 생성자
	MyException(){
		//super(); <== 이게 지금 생략되어 있다.
	}
	//2.오류 메세지를 인풋 받아서 처리해주는 생성자.
	MyException(String message){
		super(message); 		//Exception 부모의 생성자에 넣어줌
	}
}

//2.실행 예외 (사용자 정의 예외)
class MyRTException extends RuntimeException{//내가 만든 run time exception
	//기본 생성자
	MyRTException(){
		
	}
	//메세지를 처리할 생성자
	MyRTException(String message){ 	//오류 메세지를 인풋 받아서 부모 클래스의 생성자에게 던짐.
		super(message);
	}
}

//3.사용자 정의 예외를 사용하는 클래스
class A{
	//1.사용자 정의 예외의 객체 생성(필드)
	MyException me1 = new MyException();		//일반 예외 처리(기본 생성자)
	MyRTException me2 = new MyRTException();	//실행 예외 처리(기본 생성자)

	MyException mre1 = new MyException("예외 메세지 : MyException"); //오류 메세지를 생성자에다가 넣어서 처리하는 객체 생성
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException"); 
	
	// 2. 예외 던지기(throw : 예외를 강제로 발생 시킴)
	
	//정수를 인풋받아서 70 이하이면 예외를 강제로 발생시킴(예외를 직접)
	void abc_1(int num) {
		
		try {
		if(num > 70) {
			//정상처리
			System.out.println("당신이 넣은 값은 : " + num + " 이고, 정상작동됨");
		}else {
			//예외를 강제로 발생 시킴
			throw mre2; 			//RunTimeExcetion
			
		}
		}catch (MyRTException e) {
			System.out.println(e.getMessage());		//실행 예외가 발생 되었을떄 예외 메세지를 출력 하라
		}
	}
	//abc_1() 메소드를 호출하는 메소드
	void bcd_1() {
		abc_1(60);
	}
	
	
	//정수를 인풋받아서 70 이하이면 예외를 강제로 발생시킴(예외를 미루기)
	void abc_2(int num) throws MyException {	//abc_2() 메소드를 호출하는 곳에서 예외를 처리해야 함.
		if(num > 70) {
			//정상처리
			System.out.println("당신이 넣은 값은 : " + num + " , 이고 정상 값입니다.");
		}else {
			//예외를 강제 발생 시킴 (throws : 예외를 미루기, throw : 예외를 강제로 발생시킴)
			throw mre1; //일반예외
		}
	}
	void bcd_2() {
		
	try {
		abc_2(80); 
	} catch(MyException e) {
		System.out.println(e.getMessage()); 	//MyException의 생성자에 넣은 오류 메세지를 출력하라.
	}
	}
}



public class CreateUserException {

	public static void main(String[] args) {
		/*
		 	사용자 정의 예외 : JAVA에서 제공되지 않는 예외를 자신이 직접 만들어서 사용하는 예외
		 		- 일반 예외 (checked Exception) : 컴파일 단계에서 오류가 발생, 예외처리가 반드시 필요하다.
		 			-Exception 클래스를 상속해서 사용자 정의 예외 (1.기본생성자, 2.오류 메세지를 처리할 생성자.)
		 		- 실행 예외 (Unchecked Exception , RuntimeException) : 실행시 예외 발생.
		 			- RuntimeException 클래스를 상속해서 사용자 정의 예외를 생성 (1.기본생성자, 2.오류 메세지를 처리할 생성자.)
		 */
		
		A a1 = new A();
		a1.bcd_1(); 	//bcd 메소드 호출
		
		a1.bcd_2();
		
		
		
	}

}
