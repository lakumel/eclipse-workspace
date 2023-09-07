package chapter05.ex07;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 main 메소드 args로 다음 값을 넘깁니다.
		 
		 	국어 60 영어 70 수학 80 음악 90 과학 70
		 	
		 	각 과목의 합계 : 
		 			평균 :
		 */
		
		//for 문을 사용해서 배열로 들어오는 전체 내용을 출력
		
		//국어 60 영어 70 수학 80 음악 90 과학 70
		for(int i =0; i<args.length; i++) {
			System.out.print(args[i]+" "); 		//전부 String 각 방의 내용을 출력
		}
		System.out.println();
		System.out.println("===for 문을 사용해서 각 과목의 점수를 int 형으로 변환후 출력 : 합계 : 평균====");
		
		int count = 0;
		int sum = 0;
		for(int i = 0; i<args.length; i++) {//i는 인덱스 방번호 /1,3,5,7,9일때만 실행/0,2,4,6,8은 숫자가 아닌 글자이기에(국,영,수,음,과
			if(i%2!=0) {//0이 아닐때											//if(i==1 || i==3|| i==5 || i==7 || i==9) 
			sum += Integer.parseInt(args[i]); 			//sum = sum+정수
			count++;
			}
		}
		System.out.printf("모든 과목의 합계는 %d 이고 평균은 : %.2f 입니다." , sum , ((double)sum/count));
		
		
		
		
		
	}

}
