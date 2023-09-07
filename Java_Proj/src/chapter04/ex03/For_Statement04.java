package chapter04.ex03;

public class For_Statement04 {
	public static void main(String[] args) {
		/*
		 for 문에서 오류를 일으키기 쉬운 부분
		 */
		
		
		for(int i=0; i < 10; i++) {
			System.out.println(i); 
		}
		
		System.out.println("============");
		
		//이 구문 자체가 무한 루프가 발생된다.
		for(int i =0, j =0; i<10; j++) { 				// 무한 루프
			
			System.out.println( i + " , " + j ); 		//무한 루프가 된다.
			
			if(j == 1000) {break;}						//무한 루프를 빠져나오도록 
		}
		
		System.out.println("무한 루프 발생");
																//「두 구문은 같다.ㄱ
		for(int i = 10 ; i<100; i+=10) { 					// i+=10<==== i = i+10 i는 기존의 i에서 10을 더해서 넣어라
			System.out.println(i);
		}
		
		// 전역 변수
		//지역변수 (끝나면 날아간다.)for문, if문, switch 문, do while문, while문 {}  블락 내에서 선언된 변수
		
		//int i, j ;
		
		//for(int i = 0 ; i< 10; i++)
		
		
		
	}

}
