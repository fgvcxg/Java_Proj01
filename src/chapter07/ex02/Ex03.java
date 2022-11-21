package chapter07.ex02;

public class Ex03 {

	public static void main(String[] args) {
		// 
		
		// 배열 a : 7의 배수를 저장하는 배열 : 1~500
		int[] a = new int[500/7];
		
		//a 배열 방에 각 방에 7의 배수 저장
		for(int i =0, j=7; i<a.length ; i++,j+=7) {
			a[i] = j;	// 배열 a의 각 방에 7의 배수를 저장
		}
		
		
		// 배열 b : 9의 배수를 저장하는 배열 : 1~500
		int[] b = new int[500/9];
		
		//b 배열 방에 각 방에 9의 배수 저장
		for(int i =0, j=9; i<b.length ; i++,j+=9) {
			b[i] = j;	// 배열 a의 각 방에 7의 배수를 저장
		}
		// 두 배열의 각 방의 값을 더해서 출력
		
		
		
		

	}

}
