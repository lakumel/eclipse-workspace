package chapter14.ex02;

public class TryCatch {
	public static void main(String[] args) {
		/*
		 * 	예외 처리 : 예외가 발생되더라도 프로그램이 멈추지 않도록 처리.
		 	예외를 처리하는 방법 
		 	  1.throws로 미루는 방법 : 마지막에서 호출하는 곳에서 예외를 처리
		 	  		throw : 예외를 강제로 발생시킬때 사용
		 	  2.try catch문을 사용해서 내가 직접 예외를 처리하는 방법
		 	  
		 */
		
		
		try{	//try 블락
			
			//System.out.println( 3 / 0 );	//예외가 발생됨
		
		} catch(ArithmeticException e) {//catch 블락
			
			// try 블락에서 오류가 발생되면 catch 블락이 작동이 되고,
			// try 블락에서 오류가 발생되지 않으면 catch 블락이 작동되지 않는다.
			System.out.println("catch 블락 작동됨");
			
		
		}finally {//try에 오류가 발생해도 작동이 되고 발생하지 않아도 작동이 된다.
			System.out.println("Finally 블락은 무조건 실행됨");
			
		}
		
		
		System.out.println("===프로그램 마지막 라인임===");
		
		
		
		
	}

}
