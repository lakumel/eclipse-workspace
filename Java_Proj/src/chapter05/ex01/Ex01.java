package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
	
		/*
		 배열 방 100개를 생성후 3의 배수만 저장 후 출력
		 	힌트 : i : 방번호, a: 의 배수를 저장하는 변수
		 */
		
		//1.배열 변수 선언 및 방크기 지정
		
		int c =100;	
			
		int[] arr1 = new int[c]; 		// index 방번호는 0번부터 99번 방 까지 있음
	
		System.out.println(arr1.length); 			//방의 개수를 출력
		
		int a = 0; 		//3의 배수를 저장하는 변수
		
		//arr1 배열의 각 방에 값을 저장하는 for문
		for(int i=0; i < arr1.length; i++) {
			a+=3; 				//a = a+3;
			arr1[i] = a ;
			
		}
		
		//arr1 배열의 각 방에 값을 출력 하는 for
		System.out.println("=====for문을 사용해서 출력=============");
		for(int i = 0 ; i <arr1.length ; i++) {
			System.out.println("arr1 ["+ i + "] 의 값은 : " + arr1[i]);
		}
		
		System.out.println("=======Enhanced For : 향상된 For===================");
		//배열의 첫번째 방부터 마지막 방까지 자동으로 그 값을 출력할때 사용
		for(int k : arr1) { 				//배열 안에 있는 n번째 방안에 있는 것을 k변수로 가져와서 찍는다.
			System.out.print(k+ " "); 			
		}
		System.out.println("\n \n"); 
		
		
		
		
		
		
		
		
		
	}

}
