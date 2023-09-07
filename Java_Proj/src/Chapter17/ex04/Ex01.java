package Chapter17.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 	1.for문을 사용해서 1 ~ 100 까지 HashSet에 값을 저장
		 	2.Iterator를 사용해서 HashSet에 저장된 값을 출력
		 	3.Enhanced for문을 사용해서 출력
		 	4.HashSet에 저장된 값을 ===> 배열로 변환, 일반 for문을 사용해서 출력
		 	
		 	완료시간 : 12시 50분까지

		 */
		
		//1.HashSet 선언후 객체 내부에 값입력 : 아래 둘중 하나
		Set<Integer>hSet = new HashSet();
		HashSet<Integer>hSet1 = new HashSet();
		
		for(int i =1; i<=100; i++) {
				hSet1.add(i);
		}
			System.out.println(hSet1);
					
		//Iterator를 사용해서 출력
		System.out.println("========Iterator======");
		Iterator<Integer>iterator = hSet1.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		//3.Enhanced for문을 사용해서 출력
		System.out.println("===Enhanced for====");
		for(int k : hSet1) {
			System.out.print( k + " ");
		}
			System.out.println();

		//4.HashSet에 저장된 값을 ===> 배열로 변환, 일반 for문을 사용해서 출력
		System.out.println("=======================");	
		Integer[] arr = hSet1.toArray(new Integer[0]);

			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

	}

}
