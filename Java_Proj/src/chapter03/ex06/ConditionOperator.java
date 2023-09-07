package chapter03.ex06;

public class ConditionOperator {
	public static void main(String[] args) {
		/*
		 삼항 연산자 : if ~ else 를 축약해서 1라인으로 사용 하는 구문,
		     (조건) ?  참일때 실행하는 구문 : 거짓일때 실행하는 구문
		     (조건) ? 참(실행구문): 거짓(실행구문) ;
		 
		 */
		
		int val1 = (3 > 5) ? 6 : 9;	 	//조건이 거짓이므로 변수 val1 9가 할당
		System.out.println(val1); 		// 참이면 6 거짓이면 9
		
		int val2 = (3<5) ? 6 : 9 ;		//조건이 참이므로 변수 val2 6이 할당
		System.out.println(val2); 		//6
		
		
	}

}
