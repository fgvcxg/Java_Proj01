package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		//두 배열의 각 방의 내용을 더해서 출력하는 메소드 생성
		
		//4의 배수를 1~300
		int[] a =new int[300/4];		
		for(int i=1,num=0;num<a.length;i++) {
			if(i%4==0) {
				a[num]=i;
				num++;
			}			
		}
		
		//5의 배수를 1~300
		int[] b =new int[300/5];
		for(int i=1,num=0;num<b.length;i++) {
			if(i%5==0) {
				b[num]=i;
				num++;
			}			
		}
		
		addArray(a,b);
		
		
	}
	
	//두 개의 배열을 인춧 받아서 각 방의 값을 더해서 출력
	//addArray(int[] a, int[] b){}
	
	public static void addArray(int [] a, int[] b) {
		for(int i =0;i<b.length;i++) {

				a[i] = a[i] +b[i];
								
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
