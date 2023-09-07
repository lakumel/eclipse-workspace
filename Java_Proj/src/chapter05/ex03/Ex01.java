package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수선언
		int[] arr1; // 배열변수 : arr1 <==선언
		int n; // 프로그램을 선언하는 변수(1,2,3,4)
		int idx; // idx(index) <-배열 변수에서 방의 크기를 저장하는 변수

		do {

			// 배열에 저장후 출력
			System.out.println("========================================================");
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("========================================================");

			System.out.println("1~4번까지 번호를 입력 하세요>>>>>>");
			n = sc.nextInt(); 				//스캐너에서 정수값을 인풋을 받는다.

			if (n == 1) {
				System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
				System.out.println("숫자를 입력해 주세요>>>");
				idx = sc.nextInt();
				// 배열 방을 생성
				arr1 = new int[idx]; // 콘솔에서 입력 받아서 배열 방 크기를 지정

				// 배열방의 for 문을 사용해서 7의 배수와 8의 배수를 배열방에 저장
				int a = 0; // 배열 방의 번호
				for (int i = 1;; i++) { // i = 배열의 방에 저장되는 7의 배수와 8의 배수의 값(참고로 i는 index다) 
					//int i(방에들어가는 값) = 1;; i++(1씩증가하는 것) 참고로 중간에 i<n이 들어가는데 그것이 없으면 무한루프 발생한다.
					if (i % 7 == 0 || i % 8 == 0) { // i가 계속 loop돌아가면서 7 or 8의 배수일때, || <--- 이건 or
						arr1[a] = i;

						a++; // a변수는 배열의 방 번호
					}

					if (a == idx)break; 	//무한루프로 돌아가기에 지금 넣은 번호가 방번호랑 같을때 빠져나오게 만듬
				}

				// 1.for문을 사용해서 배열의 각 방의 내용을 출력 ★세밀한 컨트롤이 된다.
				for (int i = 0; i < arr1.length; i++) { 			//★arr.length <==이거 많이 쓴다. i<arr.length <==방번호 <방의 갯수 -1 i++<==방 번호 하나씩 증가
					//(방의 번호/조건/모든 방)
					System.out.print(arr1[i] + " "); 			
				}
				System.out.print("\n \n");			//println이 아닌 print로 할 경우 붙어서 나오기에 띄어쓰기를 써야 한다.

				// 2.Enhanced For문을 사용해서 출력  ★모든 방을 다 찍어준다. arr1의 0번째 방부터 배열의 마지막 방까지 전부다 찍어준다.
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.print("\n \n");

				// 3.Arrays.toString()으로 출력
				System.out.println(Arrays.toString(arr1));
										//매소드 내의 자동변수를 넣으면 모든 방을 찍어준다.
				
			} else if (n == 2) {
				System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");
				idx = sc.nextInt();
				arr1 = new int[idx]; // 배열의 방 크기 지정

				int i = 0; // 방 번호를 지정하는 변수
				int a; // 배열 방에 들어갈 값을 저장하는 변수

				// 배열의 각 방에 값을 저장하는 for문
				for (a = 1;; a++) {

					if (a % 4 == 0)continue; 			//a가 4의 배수가 되었을때 아래의 내용은 실행하지 않고 증가값으로 실행

					arr1[i] = a;
					i++;
					
					if(i==idx) break;
					
				}
				
				//1.for문을 사용해서 출력
				for(i= 0; i<arr1.length; i++) { 			//int i = 0이 아닌 i =0 을 바로 쓰는 이유는 위에 이미 썼기 때문
					System.out.print(arr1[i]+ " ");
				}
				System.out.print("\n \n");
				
				//2.Enhanced For문을 사용해서 출력
				for(int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.print("\n \n");
				
				//3.Arrays.toString()으로 출력
				System.out.println(Arrays.toString(arr1));
				

			} else if (n == 3) {
				System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
				System.out.println("배열의 방의 크기를 콘솔에서 정수값으로 넣어주세요 >>>");
				idx=sc.nextInt();
				arr1=new int[idx];
				
				int i = 0;			//배열의 방번호
				int a; 				//배열방에 들어가는 값
				
				//배열(arr1)에 값을 insert
				for(a = 1; true; a++) {					//참고로 true를 넣어도 무한루프
					if(a%3==0) { 				//a가 계속 순환하면서 3의 배수일때 true가 설정이 된다./(3의 배수일때(true)
						if(a%6!=0) { 					//a가 6의 배수가 아닐때만 (if안에 if를 넣은것)/6의 배수가 아닐때(true)
						arr1[i]=a;
						i++; 
						
						}
						
					}
					
					
					if(i==idx)break; 					//i가 idx값과 같을때 for문을 빠져나온다.
				}
				
				
				//1.for문으로 출력
				for(i = 0; i<arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.print("\n \n");
				
				
				//2.Enhanced For문을 사용해서 출력
				for(int k :arr1) {
					System.out.print(k + " ");
				}
				
				System.out.print("\n \n");
				
				//3.Arrays.toString()으로 출력
				System.out.println(Arrays.toString(arr1));
				System.out.print("\n \n");

			} else if (n == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력 했습니다.(1~ 4번까지의 정수를 입력해주세요)");
			}

		} while (true); 					

		System.out.println("While 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
		sc.close();

	}
}
