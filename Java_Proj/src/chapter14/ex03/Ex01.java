package chapter14.ex03;


class A{
int a;
}
class B extends A{
	int b;
}

class C extends A{
	int c;
}

public class Ex01 {
	public static void main(String[] args) {
		
		//A a1 = new B();
		//C c1 = (C) a1; //예외 발생
		
		//String [] arr = new String[] {"안녕", "오늘", "날씨", "맑음"};
		//System.out.println(arr[4]); //예외 발생
		
		//String str = null;
		//System.out.println(str.charAt(1));	//예외 발생 :NullPointerException
		
		
		
		
		A a1 = new B();
		
		System.out.println("=====1.방법으로 예외 처리(각각 처리)====");
		try {
			C c1 = (C) a1; //예외 발생
			
		} catch (ClassCastException e) {
			System.out.println("ClassCastException 발생됨");
		}
		
		String [] arr = new String[] {"안녕", "오늘", "날씨", "맑음"};
		try {
			System.out.println(arr[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 작동됨");
		}
		String str = null;
		try {
			System.out.println(str.charAt(1));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생됨");
		}
		
		System.out.println("=====2.방법으로 예외 처리(여러 catch로 예외 처리)====");

		try {
			C c1 = (C) a1; //예외 발생 ClassCastException
			System.out.println(arr[4]); //예외 발생ArrayIndexOutOfBoundsException 
			System.out.println(str.charAt(1)); //NullPointerException
			
		} catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("세계의 예외를 하나의 블락에서 처리");
		}
		
		System.out.println("=====3.방법으로 예외 처리(Exception으로 한꺼번에 처리)====");
		
		try {
			C c1 = (C) a1; //예외 발생 ClassCastException
			System.out.println(arr[4]); //예외 발생ArrayIndexOutOfBoundsException 
			System.out.println(str.charAt(1)); //NullPointerException
			
		} catch (Exception e) {
			System.out.println("Exception 클래스가 모든 예외를 처리");
		}
		System.out.println("=====4.방법으로 예외 처리(catch블락에서 세밀하게 처리하고 그 외는 exception 으로 처리)====");
		try {
			C c1 = (C) a1; //예외 발생 ClassCastException
			System.out.println(arr[4]); //예외 발생ArrayIndexOutOfBoundsException 
			System.out.println(str.charAt(1)); //NullPointerException
			
		} catch (ClassCastException e) {
			System.out.println("다운캐스팅을 할 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방 번호가 존재하지 않습니다.");
		} catch(NullPointerException e) {
			System.out.println("NullPointerException - 발생");
		} catch(Exception e) {
			System.out.println("모든 Exception을 한번에 처리");
		}
		
		
		System.out.println("프로그램 종료");
		
		
	
	
	
	}

}
