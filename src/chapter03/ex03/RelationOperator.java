package chapter03.ex03;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 연산 vs 등가 비교 연산자
		
		// 1. 크기비교 연산( < , > , <= , >= ) ===> true , false
		
		// 2. 등가 비교 연산자( == , != )
			//값이 같은지 다른지를 비교하는 연산자
			//stack 메모리의 값을 비교
		
		//참조 자료형일때 Heap 영역에 값이 저장, stack 영억에는 Heap의 번지수가 들어가 있다.
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println( str1 == str2);
		
		//참조 영역에서 값응ㄹ 비교 할때 ?.equals()를 사용해서 값을 비교함.
		//heap 영역의 값을 비교 할 때는 .equals()를 사용해야 한다.
		
		//개체변서1.equals(객체변수2)

	}

}
