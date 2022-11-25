package chapter03.ex02;

public class BitwiseOperator {

	public static void main(String[] args) {
		// 다양한 진법 표현과 비트연산자
		//1. 자바 코드를 사용해서 진법 변환(10진수, 16진수, 8진수, 2진수)
		int data =13;
		System.out.println(Integer.toBinaryString(data)); //2진수변환
		System.out.println(Integer.toOctalString(data)); // 8진수변환
		System.out.println(Integer.toHexString(data)); //16진수 변환
		
		//다양한 진법을 10진수로 변환
		System.out.println(Integer.parseInt("1101",2)); //괄호 있는애를 10진수로바꾸는데 안에 있는 애는 2진수 이다
		System.out.println(Integer.parseInt("15",8));//괄호 있는애를 10진수로바꾸는데 안에 있는 애는 8진수 이다
		System.out.println(Integer.parseInt("d",16));//괄호 있는애를 10진수로바꾸는데 안에 있는 애는 16진수 이다

		//다양한 진법 표현( 0b :2진수, 0 : a진수, 0x : 16진수)
		System.out.println(0b1101); 	//13
		System.out.println(015);		//13
		System.out.println(0xd);		//13
		
		//비트 연산자 : 모두 2진법으로 변환해서 각 비트를 연ㅇ산
		//4-1 AND & 하나가 0이라면 0으로 
		
		//4-2 OR | 하나가 1이라면 1로
		
		//4-3 XOR ^ 다르면 1 같으면 0
		
		//4-4 NOR ~ 반대로 1 -> 0 , 0 -> 1
		
		
		
		
		
		
	}

}
