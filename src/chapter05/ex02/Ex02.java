package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 배열 변수 arr1 : 500
		// 배열방에 3의 배수와 5의 배수를 저장
		// 출력 : 1. for, 2. Enhanced For, 3. Arrays.toString()을 사용해서 출력
		int arr1[] = new int[500];
		
		int a=0;
		for(int i =1; ;i++) {

				if(i%3==0 || i%5==0) {
					arr1[a]=i;
  					a++;
				}	
				if(a==arr1.length-1)
					break;
		}

		
		for(int i=0;i<500;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int k : arr1) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
