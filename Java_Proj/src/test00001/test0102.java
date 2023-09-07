package test00001;

import java.util.Scanner;

public class test0102 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 선택 변수 
				int select ; 		// 1. 학점의 합계/평균 	, 2.홀수, 짝수 확인하는 프로그램, 3.같은 이름을 식별
				
				
				//국어/영어/수학 점수를 인풋 받는 변수 선언
				int kor;
				int eng;
				int math;
				
				//정수 값을 인풋 받아서 홀수 인지 짝수인지 확인하는 프로그램에 사용하는 변수
				int a ;
				
				//두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
				String aName ;
				String bName ;
				
				System.out.println("============================================");
				System.out.println("1.학점의 합계/평균  | 2. 홀수/짝수 | 3.같은 이름 식별");
				System.out.println("=============================================");
				
				//사용자로 부터 프로그램 선택
				System.out.println("위 프로그램 번호를 입력 하세요>>>>");
				select =sc.nextInt();
				
				//if 조건으로 프로그램을 실행
				if (1==select){
						//스캐너로 부터 국어/영어/수학 인풋 받아서 합계와 평균을 출력
						System.out.println("1번 항목을 출력 했습니다.");
				}else if (2 == select) {
					//a 변수에 정수값을 인풋 받아서 홀수인지 짝수인지
					System.out.println("2번 항목을 출력 했습니다.");
				}else if (3 == select) {
					//aName, bName 두 변수의 문자열을 인풋 받아서 같은 이름인지 식별
					System.out.println("번 항목을 출력 했습니다.");
				}
				
				//12시 20분까지
				
				//스캐너 종료 : 사용후 메모리에서 제거 
				sc.close();

		
		
	}
}
