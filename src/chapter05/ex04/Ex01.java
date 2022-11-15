package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>

		for(;;) {
		System.out.println("==========================");
		System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장후 출력");
		System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수는 빼고 저장후 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("==========================");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int room,b;
		
		
		if(a==1) {
			System.out.println("방의 갯수를 입력하시요 >> ");
			b = sc.nextInt();
			int[] arr1 = new int[b];
			
			room =0;
			for(int i =1; ;i++) {
				if(i%7==0 || i%8==0) {
					arr1[room] = i;
					room++;
				}
				if(room==arr1.length) {
					break;
				}		
			}
			System.out.println(Arrays.toString(arr1) );
			
			
					
		}else if(a==2) {
			System.out.println("방의 갯수를 입력하시요 >> ");
			b = sc.nextInt();
			int[] arr2 = new int[b];
			
			room =0;
			for(int i =1; ;i++) {
				if(i%4!=0) {
					arr2[room] = i;
					room++;
				}
				if(room==arr2.length) {
					break;
				}		
			}
			System.out.println(Arrays.toString(arr2) );
			
			
		}else if(a==3) {
			System.out.println("방의 갯수를 입력하시요 >> ");
			b = sc.nextInt();
			int[] arr3 = new int[b];
			
			room =0;
			for(int i =1; ;i++) {
				if(i%3==0 && i%6!=0) {
					arr3[room] = i;
					room++;
				}
				if(room==arr3.length) {
					break;
				}		
			}
			System.out.println(Arrays.toString(arr3) );
			
		}else if(a==4) {
			System.out.println("프로그램 종료");
			sc.close();
			break;
			
		}else {
			System.out.println("1~4 만을 적으세요");
		}
		
	}
}
}
