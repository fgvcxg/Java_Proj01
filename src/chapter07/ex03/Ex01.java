package chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
		/*
			가변 길이 배열 문제
			
			values[0] : 값이 정수 1이 들어올때 "파워레벨 1 입니다"
			values[1] : 값이 정수 1이 들어올때 "스피드레벨 1 입니다"
		 	
		 */
		arrayFlexible(5, 5);

	}
	
	public static void arrayFlexible(int...values) {
		if(values[0]<10) {
			System.out.printf("파워Lvl : %d",values[0]);
			System.out.println();
		}
		if(values[1]<10) {
			System.out.printf("스피드Lvl : %d",values[1]);
			System.out.println();
		}
		
	}

}
