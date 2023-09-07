package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 스캐너로 번호를 인풋을 받아서. 4번을 누를때 까지는 계속 무한 루프
		// do while, if, for

		// 단축키:ctrl + shift+F <==코드 자동 정렬
		// 단축키:ctrl+alt+down(화살표) : 선택된 라인을 복사
		// 단축키:alt+up/down:선택 라인을 이동

		Scanner sc = new Scanner(System.in);
		int a; // sc로 받은 값을 담은 변수

		do {

			System.out.println("================================================================");
			System.out.println("1.구구단 출력 | 2. 19단 출력 | 3. 19단중 7의 배수 출력 | 4. 프로그램 종료");
			System.out.println("================================================================");
			System.out.println("위의 번호를 입력 하세요 >>>> ");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1.구구단 출력");
				for (int i = 1; i < 10; i++) { // 단수를 출력하는 for, i:단
					System.out.println(i + "단");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d*%d=%d\t", i, j, i * j);
					}
					System.out.println(); // 단수를 출력후 enter
				}
			} else if (a == 2) {
				System.out.println("2. 19단 출력");
				for (int i = 1; i < 20; i++) { // 단수를 출력하는 for, i:단
					System.out.println(i + "단");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d*%d=%d\t", i, j, i * j);
					}
					System.out.println();
				}
			} else if (a == 3) {
				System.out.println("3. 19단중 7의 배수 출력");
				for (int i = 1; i < 20; i++) { // 단수를 출력하는 for, i:단
					if (i % 7 == 0) {
						System.out.println(i + "단");
						for (int j = 1; j < 20; j++) {
							System.out.printf("%d*%d=%d\t", i, j, i * j);
						}
						System.out.println();
					}
				}
			} else if (a == 4) {
				System.out.println(" 4. 프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력 했습니다.(1~ 4번까지의 정수를 입력해주세요)");
			}

		} while (true);
		
		System.out.println("While 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
		sc.close();  
	}
}
