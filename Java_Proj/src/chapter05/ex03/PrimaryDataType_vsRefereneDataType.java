package chapter05.ex03;

public class PrimaryDataType_vsRefereneDataType {
	public static void main(String[] args) {

		/*
		  기본 데이터 타입(8가지): 변수 vs 참조 데이터 타입 :배열 			
		 
		 */

		System.out.println("====1.기본 데이터 타입에서 대입 연산(Stack의 값을 복사)=======");
		int val1 = 3;
		int val2 = val1;  				//val2 = 3 
		val2 = 7;
		
		System.out.println(val1); 		//val1 = 3
		System.out.println(val2);		//val2 = 7 원래는 val1의 값이 담겨 있었다가 val2= 7로 바꿔있다.
		
		System.out.println("==2. 참조 데이터 타입에서 대입 연산(stack의 Heap의 주소를 복사함)========");
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;
		
		arr2[0] = 7;
		
		System.out.println(arr1[0]);		//7
		System.out.println(arr2[0]);		//7
		
		System.out.println(arr1);
		System.out.println(arr2);
	
		
		
		
		
	}


}
