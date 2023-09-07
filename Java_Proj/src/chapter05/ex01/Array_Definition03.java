package chapter05.ex01;

public class Array_Definition03 {
	public static void main(String[] args){
		/*
		 1차원 배열 선언 방법 3가지
		 */
		
		System.out.println("1.방법 1");
		
		int[] arr1; // 배열 변수 선언
		arr1=new int[3]; //배열 방을 생성
		
		int[] arr2 = new int[3]; 			//선언과 동시에 배열방 생성
		
		int arr3[] = new int[3]; 			//이렇게도 쓸 수 있다.
		
		int arr4[];
		arr4 = new int[3];
		
		arr4[0] = 10;
		
		
		System.out.println("2.방법 1");
		//배열을 선언과 동시에 값을 나중에 넣는다.
		//배열을 선언과 동시에 값을 할당.
		//주의:방크기를 지정하면 안됨
		
		int[] arr5 = new int[] {10 ,20, 30}; 			//배열 선언과 동시에 방에 값을 바로 넣는다.
	
		int[] arr6; //선언후
		arr6 = new int[] {10,20,30};

		System.out.println("3.방법 3");
		//선언과 동시에 값을 바로 할당
		
		int[] arr7= {10,20,30};
		
		//오류 발생
		int[] arr8;
		arr8 = new int[] {10,20,30}; 	
		
		
	}

}
