package chapter05.ex03;

public class Ex02 {
			public static void main(String[] args) {
				
				/*
				 배열방 1000개를 생성, 정수 배열,
				 4의 배수를 담는데 8의 배수는 담지 않도록 저장
				 
				 출력은 10개씩 끊어서 출력, for 문을 사용해서 출력 <
				 */
				
				//배열 선언
				int[]arr1 = new int [1000]; 		//배열방 1000개, 방번호는 index 이며 0~ 999까지 실행
				
				//각 배열 방에 값을 insert(넣는다.)
				
				for(int i =0 , a =1; true ; a++) { //i:배열의 방번호, a변수는 값,
					
					if(i==1000)break;
					
					if((a%4==0) && (a%8!=0)) { 			//a의 값이 4로 나누었을때 나머지가 0일때
														//4의 배수 이면서 8의 배수가 아닐때 실행
							arr1[i]=a;
							i++;
						}
					}
				
				//출력
				for(int i = 0 ; i<arr1.length; i++) {
					System.out.print(arr1[i] + "\t");
					
					if( (i + 1)%10 ==0 ) { 			//10의 배수일때 enter
						System.out.println();
					}
				}
				
			}
}
