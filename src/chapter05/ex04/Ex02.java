package chapter05.ex04;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 배열
		// 1. 배열 선언 : - 동일한 데이터 타입을 저장. - 방의 크기가 지정되면 수저이 불가
		int[] arr1 = new int[500]; // 배열 선언과 방크기를 정의
		
		// 배열에 저정된 기본 값을 출력 : Heap 강제 초기 값이 할당됨
		System.out.println("배열의 초기 값 출력");
		for(int i =0; i< arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// 2. 배열의 값을 저장
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i + 1;
		}
		
		// 3. 배열의 각 방에 저장된 내용을 출력 : For, Enhanced for, Arrays.toString(arr1)
		System.out.println("===For 문을 사용해서 배열의 각 방의 내용을 출력 ======");
		for(int i =0;i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("===Enhanced for 문을 사용해서 배열의 각 방의 내용을 출력 ======");
		for(int k : arr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("===Arrays.toString(arr1) 문을 사용해서 배열의 각 방의 내용을 출력 ======");
		System.out.println(Arrays.toString(arr1));

	}

}
