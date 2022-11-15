package chapter05.ex03;

public class Intial_Value {

	public static void main(String[] args) {
		// 기본 자료형과 참조 자료형의 초기값
		// 기본 자료형 : Stack 공간에 변수와 변수의 값이 저장됨
				// 강제 초기화가 안됨. 사용시에는 초기값을 넣고 사용
		// 참조 자료형(배열) : Stack 공간에 [배열] 변수와 Heap영역의 주소정보가 저장
				// 강제 초기화가 됨, boolean(false), 정수(0), 실수(0.0)
		
		//1.Stack 메모리값( 강제 초기화가 되지 않음)
		int value1;
		//System.out.println(value1);	//오류 발생 : 초기값이 없다.
		int[] value2;
		//value2 = new int[3];
		//System.out.println(value2);		//오류 발생 : value2에 Heap 영역의 주소값이 없다

		int value3 = 0;
		System.out.println(value3);	//0
		int[] value4 = null;	//null : 비어있는 상태, 기본자료형에는 사용할 수 없다. 
									//참조자료형에서만 사용 가능
		System.out.println(value4);	//value4에 Heap영역의 주소가 비어 있는 상태 :null
		
		System.out.println("=====================");
		
		// 2. Heap 영역은 강제 초기화가 된다. boolean(false), 정수(0), 실수(0.0)
		// 2-1. 기본 자료형 배열
		boolean[] arr1 = new boolean[3];	// 기본 값으로 false가 각방에 할당됨
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		
	}

}
