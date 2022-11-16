package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>
		/*
		 	2차원 배열 변수 : arr1
		 	arr1[0]		<=== 2의 배수만 저장
		 	arr1[1]		<=== 5의 배수만 저장
		 	arr1[2]		<=== 3의 배수와 8의 배수를 저장
		 	arr1[4]		<=== 1부터 시작해서 1씩 증가하는데 7의 배수는 저장하지 않음
		 	
		 	행의 갯수 : 4
		 	열의 갯수 : 100
		 	
		 	1. for 문으로 출력, 2. Enhanced For, 3. Arrays.toString()
		 */
		
		int[][] arr1 = new int[4][100];
		for(int i =0; i<5;i++) {
			if(i==0) {
				for(int j=0,k=2;j<arr1[i].length;j++,k+=2) {
					arr1[i][j] = k;
				}
				continue ;
				
			}else if(i==1) {
				for(int j=0,k=5;j<arr1[i].length;j++,k+=5) {
					arr1[i][j] = k;
				}
				continue ;
				
			}else if(i==2) {
				
				int k=0;
				for(int j=1; ;j++) {
					if(j%3==0 || j%8==0) {
						arr1[i][k]=j;
						k++;
						
					} 
					if(k==arr1[i].length){
						break;						
					}					
				}
				continue ;
				
			}else if(i==3) {
				int k=0;
				for(int j=0; ;j++) {
					if(j%7!=0) {
						arr1[i][k]=j;
						k++;
						
					}
					if(k==arr1[i].length){
						break;						
					}					
				}
				
			}
			
		}
		
		System.out.println("=============For 문으로 출력");
		for(int i=0; i<arr1.length;i++) {
			for(int j =0; j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============Enhanced For 문으로 출력");
		for(int[] arr2 : arr1) {
			for(int k : arr2) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============Arrays.toString() 문으로 출력");
		for(int[] arr2 : arr1) {
			System.out.println(Arrays.toString(arr2));
		}

	}

}
