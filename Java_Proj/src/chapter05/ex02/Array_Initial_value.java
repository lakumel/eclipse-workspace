package chapter05.ex02;

import java.util.Arrays;

public class Array_Initial_value {
	public static void main(String[] args) {
		
	
	/*
	 배열의 초기값 지정 :
	 	참조 자료형 : boolean : false , 정수(byte, short, int, long) : 0, 실수(float, double) : 0.0,
	 	 			문자(char) : 공백(값을 넣지 않으면 기본값으로 공백이 들어간다.)
	 	 			String : NULL 	//String은 NULL이 기본값이다.
	 */
		
		//1.Stack 메모리값 (강제초기화가 되지 않는다.) 	<==기본 자료형의 값
		int val1 ;		//변수 선언
		//System.out.println(val1);				//	오류 발생 ->val1은 변수
										//변수에 기본 값을 할당하지 않아서 오류 발생 
		
		
		int[] val2;		//배열 선언, Heap 영역의 주소값이 업는 상태
		
		//System.out.println(val2); 				//오류 발생, heap 영역이 생성되지 않은 상태, new int[3]
		val2 = new int[3];
		
		System.out.println(val2); 					//객체의 힙영역의 주소가 출력됨 =>16진수로 출력이 됨, 
		
		//방의 값 출력
		System.out.println(val2[0]); 			//val2의 0번째 방을 출력해라
		System.out.println(val2[1]);
		System.out.println(val2[2]);
		
		
		System.out.println("========================================");
		
		int[] val3 = null; 				//참조자료형일때만 객체주소에 null값을 할당할 수 있다.
		System.out.println(val3); 				//객체 자체를 출력할때 Stack에 저장된 Heap의 주소 : 16진수
		val3 = new int[4];		
		System.out.println(val3); 				//Heap영역의 주소를 출력
		
		//2.Heap 메모리값(강제 초기화가 됨) 				<==참조 자료형의 값
		
		boolean[] a = new boolean[3];
		System.out.println(a[0]); 				//초기값&기본 값이 false
		System.out.println(a[1]); 			
		System.out.println(a[2]);
		System.out.println("==========");
		
		int [] b = new int[3]; 			//정수 : byte, short, int, long
		System.out.println(b[0]); 			//기본값으로 0
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println("===========");
		
		double[] c = new double[3];			//실수 : float, double
		
		System.out.println(c[0]); 			//기본값으로 0.0
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println("==================");
		
		
		char[] d = new char[3]; 		//문자 : 공백
		System.out.println("char 기본값은 공백 : " + d[0]);
		System.out.println("char 기본값은 공백 : " + d[1]);
		System.out.println("char 기본값은 공백 : " + d[2]);
		System.out.println("===============================");
		
		
		String[] e = new String[3]; 		//String은 기본값으로 null이 들어가 있다. 참고로 null은 0이 아닌 비어 있는 공허한 상태
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println("======================");
		
		//Arrays.toString(배열변수); 			//배열의 모든 값을 출력
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		
		
		
	}
}
