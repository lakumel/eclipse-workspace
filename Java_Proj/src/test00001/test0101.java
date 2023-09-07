package test00001;

import java.util.Scanner;

public class test0101 {
	
	public static void main(String[] args) {
		
		/*
		 1.Scanner로 정수 1,2,3을 인풋 받아서 
		  1 : "금메달 입니다."
		  2 : "은메달 입니다."
		  3 : "동메달 입니다."
		  그외 모든 정수를 인풋 받으면 : "메달이 없습니다."
		  ==================================
		  2.Scanner 로 문자열 "gold" , 'silver", "bronze"
		    "gold" 	 : "금메달 입니다."
		    "silver" : "은메달 입니다."
		    "bronze" : "동메달 입니다."
		   그외 모든 정수를 인풋 받으면 : "메달이 없습니다."
		  ==================================
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int medal;
		System.out.println("점수 값을 입력해 주세요");
		
		medal = sc.nextInt();		//정수 값을 인식하는 건가?
		switch (medal) {
		case 1 :
			System.out.println("금메달 입니다");
			break;
			
		default:
			break;
		}
	
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
