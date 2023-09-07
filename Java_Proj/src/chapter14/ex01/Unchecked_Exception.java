package chapter14.ex01;

class A{	//부모클래스
	int a;
	int b;
}
class B extends A{//자식 클래스
	
	int c;
	int d;
}
class C extends A{//A를 상속하는 자식 클래스
	int e;
	int f;
	
}




public class Unchecked_Exception {//실행시에 발생되는 오류

	public static void main(String[] args) {
		/*
		  실행 예외 : Unchecked Exception, Runtime Exception : 실행시 예외가 발생
		  
		 */
		
		//1.ArithmeticException : 정수를 0으로 나누면 발생되는 예외
			//컴퓨터 프로그램에서는 0으로 나눌수가 없다.
		
		//System.out.println( 3 / 0 ); //<==컴파일 단계에서는 오류가 발생하지 않는다.
		
		//2.ClassCastException : 다운 캐스팅시 객체 내부에 해당 타입이 존재하지 않을때 발생되는 예외
		
		A a1 = new B(); 		//a1 : A / B
		A a2 = new C();			//a2 : A / C
		
		//C c1 = (C) a1;		//a1에는 A와 B만 존재하는데(C는 없다.) 컴파일 단계에서는 오류가 발생하지 않고 실행시 오류가 발생한다.
				
		//3.ArrayIndexOutOfBoundsException : 배열의 방 번호를 넘어간 경우 발생되는 예외
					//index 방번호0  1  2  3  4	
		int [] arr = new int[] {1, 2, 3, 4, 5};
		
		//System.out.println(arr[5]); 
		
		//4.NumberFormatException : 문자타입의 정수나 실수를 정수나 실수로 바꿀때 발생되는 오류
		String a = "10!";
		//int num = Integer.parseInt(a); 			//문자를 정수나 실수로 바꿀때 오류 발생
		
		//5.NullPointException : 참조주소의 값이 Null인데, 메소드 호출하는 경우
		String str = null;
		
		System.out.println(str.charAt(2));
		
		
		
		
	}

}
