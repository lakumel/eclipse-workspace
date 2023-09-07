package Chapter07.ex04;



public class Ex01 {
	
	public static void arrSum(int[] a, int[] b) {
		//for 문을 사용해서 각 배열의 방의 값을 더해서 출력
		int[] c =new int[71]; //제일 큰 배열의 방의 크기를 지정함. 두 배열의 더한 값을 저장하는 배열
		
		for(int i = 0, j = 0; i<a.length; i++, j++) {//a배열의 index 0~ 70 <== i
			
			if(i>54) {
				c[i] = a[i];
			}else {
				c[i] = a[i] + b[j];					//b 배열의 index 0~ 54<==j
			}
				System.out.print(c[i] + " ");
			}
	
	}
	
	public static void main(String[] args) {
		
		
		int[] a;	//0 ~ 500까지 의 7의 배수를 저장 ->방번호가 500이 아니라 7의 배수가 500까지 /방의 크기 : 500/7
		int[] b;	//0 ~ 500까지 의 9의 배수를 저장->500/9
		
		a= new int [500/7];
		b= new int [500/9];
		
		//1.for 문을 사용해서 배열 a 에 7의 배수 저장
		
		for(int i =0, j = 7; i<a.length; i++) {
			a[i] = j;
			System.out.print(a[i] +" ");
			j+=7; //j 는 7씩 증가
		}
		System.out.print("\n \n");
				//a 배열 방의 갯수
		System.out.println(a.length); //71(방의 갯수) : index 0~70
		
		//2.for 문을 사용해서 배열 b 에 9의 배수 저장
		
		for(int i =0, j = 9; i<b.length; i++) {
			b[i] = j;
			System.out.print(b[i] +" ");
			j+=9; //j 는 9씩 증가
		}
		System.out.print("\n \n");
				//b 배열 방의 갯수
		System.out.println(b.length); // 55: 방의 개수 : index 0~ 54
		
		arrSum(a, b); // 각방의 내용을 더해서 출력 a : 71 , b : 55
		
		
	}

}
