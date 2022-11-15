package chapter05.ex01;

public class Ex01 {

	public static void main(String[] args) {
		/*
			<문제>
			배열 선언 4가지 방법 : 
			1. 배열 변수 이름 : arr1, 정수로 방 3개로 지정, 40, 50, 60<배열 1선언>
			2. 배열 변수 이름 : arr2, 실수로 방 3개로 지정, 40.0 , 50.0 , 60.0 <배열 선언 2>
			3. 배열 변수 이름 : arr3, 문자열 방 3개로 지정, "오늘", "날씨", "흐림" <배열 선언 3>
			4. 배열 변수 이름 : arr4, 문자 방 3개로 지정, 'A', 'B', 'C' <배열 선언 4>
			
		 */
		
		int[] arr1 = new int[3];
		arr1[0] = 40;
		arr1[1] = 50;
		arr1[2] = 60;
		
		System.out.println("1번째 방법");
		System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]);
		System.out.println();
		
		double arr2[] = new double[3];
		arr2[0] = 40;
		arr2[1] = 50;
		arr2[2] = 60;
		
		System.out.println("2번째 방법");
		System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]);
		System.out.println();
		
		
		String[] arr3 = new String[] {"오늘","날씨","흐림"};
		System.out.println("3번째 방법");
		System.out.println(arr3[0]+" "+arr3[1]+" "+arr3[2]);
		System.out.println();
		
		
		char[] arr4 = {'A', 'B', 'C'};
		System.out.println("4번째 방법");
		System.out.println(arr4[0]+" "+arr4[1]+" "+arr4[2]);

	}

}
