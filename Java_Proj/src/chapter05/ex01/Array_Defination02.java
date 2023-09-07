package chapter05.ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Defination02 {
	
	public static void main(String[] args) {
		
		/*
		 배열의 선언 방법 3가지 방법
		 (배열의 선언 방법에는 3가지가 있다.)
		 */
		
		
		System.out.println("===1.배열 선언과 동시에 값을 할당.=====");
		
		//주의 : new int[] 에 방의 크기를 넣으면 안된다.(방의 크기를 지정하면 안됨)
		int[] arr1 = new int[] {10, 20 ,30, 40, 50,}; 
		
		//for를 사용해서 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n \n");
		
		//출력(Enhanced For)를 사용해서 출력-향상된 for문
		for(int c : arr1) { 			//배열안에 있는 것이 각 방안에 있는 것이 c라는 변수 안에 저장이 된다.
			System.out.print(c + " ");
		}
		System.out.print("\n \n");
		
		System.out.println("========2.배열 선언과 동시에 값 할당===============");
		
		int[] arr2 = {11,22,33,44,55,66,77}; 		//new int 해서 넣을 수 있고 그냥 값을 바로 넣을 수가 있다.
		
		//for문으로 출력
		for(int i =0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.print("\n\n");
		
		
		//Enhanced For문으로 출력
		for(int c : arr2) {
			System.out.print(c + " ");
		}System.out.print("\n \n");
		
		//Arrays.toString(배열변수)로 출력
		System.out.println(Arrays.toString(arr2)); //배열 변수의 모든 값을 출력
	}

}
