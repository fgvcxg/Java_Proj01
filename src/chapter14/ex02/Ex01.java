package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		//try catch finally 구문을 사용해서 예외 처리
		
		int[] arr = new int[] {1,2,3,4};
		
		try {
			
		} catch (Exception e) {
			//실행시 예외 발생 : 
			System.out.println(arr[5]);
		}finally {
			System.out.println("프로그램 종료");
		}
		
		
	}

}
