package chapter05.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방번호를 인풋
		// 배열의 변수 : arr1, 2의 배수를 저장후 출력
		// 배열의 변수 : arr2, 3의 배수를 저장후 출력
		
		
		Scanner sc = new Scanner(System.in);
		int num=0, a = sc.nextInt();
		int[] arr1 = new int[a];
		
		int b=sc.nextInt();
		int[] arr2 = new int[b];
		
		
//		for(int i =1; ;i++) {
//			if(i%2==0) {
//				arr1[num]=i;
//				num++;
//			}
		for(int i =0,j=2;i<arr1.length ;i++,j+=2) {
			arr1[i] = j;
			
		}	
		for(int k : arr1) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		
		num =0;
//		for(int i =1; ;i++) {
//			if(i%3==0) {
//				arr2[num]=i;
//				num++;
//			}
		for(int i =0;i<arr2.length ;i++) {
			arr2[i] = (i+1)*3;
			if(num==arr2.length) {
				break;
			}
		}	
		for(int i = 0; i<=arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();

	}

}
