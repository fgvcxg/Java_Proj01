package chapter07.ex02;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개 변수로 배열을 Atgument로 인풋
		
		//1~100까지 3의 배수의 배열을 생성후 메소드 호출, 정수 5 호출
		
		int[] a =new int[100/3];
		int num=0;
		for(int i=1;num<a.length;i++) {
			if(i%3==0) {
				a[num]=i;
				num++;
			}			
		}
		System.out.println(Arrays.toString(a));
		
		printArray(a,5);
		System.out.println("===================");
				
		//1~100까지 7의 배수의 배열을 생성후 메소드 호출, 정수 2 호출
		num=0;
		int[] b =new int[100/7];
		for(int i=1;num<b.length;i++) {
			if(i%7==0) {
				b[num]=i;
				num++;
			}			
		}
		System.out.println(Arrays.toString(b));
		printArray(b,2);
	}
	
	//메소드 : static, 매게변수로 정수 1, 배열 1개를 인풋받아서
		// 각 방의 배열의 값을 인춧받은 정수로 곱해서 출력하는 배열
	public static void printArray(int[] a, int b) {
		for(int i =0; i<a.length;i++) {
			a[i]=a[i]*b;
		}
		System.out.println(Arrays.toString(a));
		
	}
	
	

}
