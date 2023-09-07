package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 스캐너로 번호를 입력받고 각 프로그램을 출력하는 프로그램을 작성
		// for 문 블랙 내에서 스캔을 사용

		Scanner sc = new Scanner(System.in);
		int a;

		do {

			System.out.println("========================");
			System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \"java 프로그래밍\" 이라고 출력하는 프로그램"); // 출력을 인풋받은 만큼 나옴
			System.out.println("3.10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");
			System.out.println("4.입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("5.프로그램 종료");
			System.out.println("========================");
			System.out.println("위 정수를 입력해 주세요>>>>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
				System.out.println("Type 1: 증가값으로 홀수 출력");
				for (int i = 1; i <= 20; i += 2) {
					System.out.print(i + " ");
				}
				System.out.print("\n\n");

				System.out.println("Type 2: if 조건으로 홀수 출력");
				for (int i = 1; i <= 20; i++) {
					if (i % 2 != 0) {
						System.out.print(i + " " );
					}
				}
				System.out.print("\n\n");
				
			} else if (a == 2) {
				System.out.println("2. 10이하의 정수를 입력받아 정수만큼 \"java 프로그래밍\" 이라고 출력하는 프로그램");
				int b; // 스캐너로 정수값을 인풋 받음(스캐너로 10이하의 정수값을 인풋 받는 변수)
				System.out.println("10이하의 정수를 입력하세요>>>>");
				b = sc.nextInt();

				for (int i = 1; i <= b; i++) {
					System.out.println("Java 프로그래밍: " + i);
				}

			} else if (a == 3) {
				System.out.println("3.10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");

				System.out.println("정수 10개를 공백을 사용해서 입력 하세요>>>>");
				int c, count = 0; // c : 스캐너로 받아서 저장하는 변수, count :받아서 그중에 짝수를 카운트 하는 변수
				for (int i = 1; i <= 10; i++) {
					c = sc.nextInt();
					if (c == 0) {
						continue;
					}
					if (c % 2 == 0) {
						count++;		//초기값이 없으면 오류가 난다.(초기값이 반드시 할당 되어야 한다.)
					}
				}
				System.out.printf("입력 받은 짝수는 %d입니다.", count);
				System.out.print("\n \n");

			} else if (a == 4) {
				System.out.println("4.입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램");
				System.out.println("성적을 몇개를 작성할지 정수로 넣어주세요.>>>>");
				int b , c , sum = 0, count = 0 ;		//스캐너로 인풋 받을 변수
					//변수 b : 과목의 성적의 갯수 : 3(국어, 영어, 수학)
					//c:점수를 담을 변수 : for문을 사용해서 scanner로 정수를 인풋받는 변수
					//sum: 합계, 인풋 받은 점수를 합하는 변수
					//count: 각 과목의 개수 == b
				b=sc.nextInt(); 		//오류가 나는 이유는 초기값을 안넣은 상태에서 이것을 사용하면 오류가 발생을 한다.(변수의 초기값이 없으면 오류가 발생)
				System.out.println("각 과목의 점수를 공백을 사용해서 입력한 갯수만큼 넣어주세요.>>>");
				
				for(int i = 1 ; i<=b; i++) {
					c = sc.nextInt();
					
					sum += c; 		//sum = sum + e(기존의 sum 변수에 합계를 구함)
					count++;
				}
				double avg = (double)sum/count ; 				//sum/count 로 할 경우 정수로만 나오고 소수점을 버리기에 
				
				System.out.printf("입력한 과목수는 : %d 이고, 합계는 : %d 이고, 평균은 : %.2f", count,sum,avg);
				System.out.println("\n\n");
				
			} else if (a == 5) {
				System.out.println("5.프로그램 종료");
				break;

			} else {
				System.out.println("잘못 입력 했습니다. ( 1 ~ 5사이의 정수를 입력하세요.) ");
			}
		} while (true);
		sc.close();
	}
}
