package chapter04.ex03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int i ;     // 스캐너로 단을 인풋 받음 
		//String b ; 
		System.out.println(" 출력할 단을 입력 하세요 (정수) >>>");
		i = sc.nextInt();
		//b = sc.next(); 
		
		for ( int j = 1 ; j <10 ; j++) {
			
			System.out.println( i + " * " + j + " = " + i * j);
		}
		
		
		
	}

}
