package chapter04.ex03;

public class Ex04 {
	public static void main(String[] args) {
		
	
	/*
	 1.이중 for 문을 사용해서 1단 19단 까지 출력
	 2.이중 for 문을 사용해서 1단 19단 까지 출력중 3의 배수단만 출력
	 	<완료시간 : 40분까지>
	 */
	
			System.out.println("===1. 1단 ~ 19단 까지 출력 ========");
			
			int i, j;
			
			for( i = 1; i< 20; i++) {
			
				
				System.out.println(i+"단 출력");
				System.out.println("=================");
				
				for (j = 1; j <20; j++) {
					System.out.println(i+" * "+j+" = "+i * j);
				}
				System.out.println();
			}
	
			
			
			System.out.println("===2.1단~ 19단까지 출력 내용중 3의 배수단만 출력");
			for(i= 1; i <20; i++) {
				System.out.println(i+"단");
				for(j =1 ; j<20; j++ ) {
					if(j%3==0)
						
					
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
			}
			
			

	}

}
