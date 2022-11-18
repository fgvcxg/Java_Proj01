package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		//	args  : 합계 40 77 99 100 200
		
		//합계 : <정수를 더한 값을 출력>
		
		
		int e = Integer.parseInt(args[1]);
		int f = Integer.parseInt(args[2]);
		int g = Integer.parseInt(args[3]);
		int h = Integer.parseInt(args[4]);
		int i = Integer.parseInt(args[5]);
		
		System.out.printf("%s : %d\n",args[0],e+f+g+h+i);
		
		System.out.println("=====================");
		
		System.out.println("합계 " +1+2+3);	//합계 123
		System.out.println(1+2+3+"합계");		//6합계
		

	}

}
