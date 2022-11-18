package chapter05.ex08;

public class Ex02 {

	public static void main(String[] args) {
		// main method의 배열 변수 args 로 실수 값 넣어서 계산하기
		// args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		
		//double d = Double.parseDouble(args[1]);	//문자열로된 실수를 실수형을 변환
		double a=0;
		for(int i =1; i<args.length;i++) {
			a = a+ Double.parseDouble(args[i]);
		}
		System.out.printf("%s : %f\n",args[0],a);
		System.out.printf("%s : %.3f\n",args[0],a);
	}

}
