package Chapter07.ex02;

class F{
	//1.메소드 : 두 배열의 각 방의 내용을 더해서 출력 : int
	//2.메소드 : 두 배열의 각 방의 내용을 빼서 출력 :int
	//3.메소드 : 두 배열의 각 방의 내용을 곱하기 출력 : int
	//4.메소드 : 두 배열의 각 방의 내용을 나누기 출력 : double

	void arrSum(int[] a, int[]b) {
		System.out.print("두 배열의 합은 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + b[i]+" ");
			//System.out.print("두배열의 차는" + a[i] + b[i]+" "); //※주의 : 앞에 공백이 있으면 각 행을 더하는게 아니라 각 행을 연결시킬수 있다.
		}
		System.out.print("\n \n");
	}
	void arrDiff(int[] a, int[]b) {
		System.out.print("두 배열의 차는 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] - b[i]+" ");
		}
		System.out.print("\n \n");
	}
	void arrMul(int[] a, int[]b) {
		System.out.print("두 배열의 곱은 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] * b[i]+" ");
		}
		System.out.print("\n \n");
	}
	void arrDiv(int[] a, int[] b) {
		System.out.print("두 배열의 나누기는 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print((double)a[i] / (double)b[i]+" ");
		}
		System.out.print("\n \n");
	}

}
	

	


public class Ex04 {
	public static void main(String[] args) {
		//1.정수를 담는 배열 arr1 방 100개를 생성 : 7의 배수만 저장
				//7, 14, 21
		
		System.out.println("===1.정수를 담는 배열 arr1 방 100개를 생성 : 7의 배수만 저장=====");
		int[]arr1 = new int[100];	// index :0~99
		//for문을 사용해서 각 방에 7의 배수를 저장, j : 7의 배수를 저장하는 변수
			for(int i = 0, j = 7; i<arr1.length; i++) {
				arr1[i] = j;
				j+=7;			//j= j+7
				System.out.print(arr1[i] + " ");
			}
			System.out.print("\n \n");
			
		//2.정수를 담는 배열 arr2 방 100개를 생성:4의 배수만 저장하는데 8의 배수는 저장하지 않도록
		
			System.out.println("==2.정수를 담는 배열 arr2 방 100개를 생성:4의 배수만 저장하는데 8의 배수는 저장하지 않도록====");
		int[] arr2 = new int[100];	//index : 0~ 99, 
			// j : 4의 배수만 저장하는 변수,
		for(int i = 0, j = 1; true; j++) {
			
			if(j%4==0 && j%8!=0) {//j가 4의 배수이고 8의 배수가 아닐때만 출력
				arr2[i] = j;
				System.out.print(arr2[i] + " ");
				i++;		//값이 저장되었을때만 방의 갯수를 증가시킴
			}
		
			if(i == 100)break; 		//i는 방번호 100이 되면 빠져나오도록 한다.
		}
		System.out.print("\n \n");
		
		//3.각 메소드 호출후 출력
		System.out.println("====3.각 메소드 호출후 출력======");
		
		F f1 = new F();
		
		f1.arrSum(arr1, arr2);
		f1.arrDiff(arr1, arr2);
		f1.arrMul(arr1, arr2);
		f1.arrDiv(arr1, arr2);

	}

}
