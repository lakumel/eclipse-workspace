package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {

		//1.스캐너 등록
		//2.우리 가족의 이름(String) 및 몸무게(double)를 인풋 받고, 몸무게의 합과 평균을 구해서 출력하는 프로그램을 작성
			//sc.nextDouble();
		
		public static void main(String[] args) {
			

		Scanner sc = new Scanner(System.in);
		
		String name1 ;
		String name2 ;
		String name3 ;
		String name4 ;
		
		double weigh1 ;
		double weigh2 ;
		double weigh3 ;
		double weigh4 ;
		
		
		System.out.println("아버지 이름 어머니의 이름 형제의 이름 자신의 이름을 공백을 구분해서 입력 하세요>>>>");
		name1 = sc.next();
		name2 = sc.next();
		name3 = sc.next();
		name4 = sc.next();
		
		
		System.out.println("아버지의 체중 어머니의 체중 형제의 체중 자신의 체중을 공백을 구분해서 입력 하세요>>>>");
		weigh1 = sc.nextDouble();
		weigh2 = sc.nextDouble();
		weigh3 = sc.nextDouble();
		weigh4 = sc.nextDouble();
		
		double sum = weigh1 + weigh2 + weigh3 + weigh4;
		double avg = sum/4.0;
		
		System.out.printf("아버지의 이름은 %s, 어머니의 이름은 %s, 형제의 이름은 %s 자신의 이름은 %s 이며\n\n", name1, name2, name3, name4);
		System.out.printf("아버지의 체중은 %4.2f 이며, 어머니의 체중은 %4.2f , 형제의 체중은 %4.2f이고, 제 체중은 %4.2f 입니다.\n\n", weigh1, weigh2, weigh3, weigh4);
		System.out.printf("가족의 몸무게 합은 %5.2f이며\n 평균은 %4.2f입니다.\n" , sum, avg);
		
		
	}
}
