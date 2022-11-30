package chapter14.ex06;

//1. 예외 발생할때 각 메소드 내부에서 예외를 직접 처리함
class Aa{
	void abc() {	//bcd() 메소드 호출
		bcd();
	}
	void bcd() {
		try {
			System.out.println(3/0);
			
			int [] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
				
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//2. 예외를 전가 : 메소드 호출하는 곳에서 예외를 처리하도록 : throws
class Bb{
	void abc() throws Exception {	//bcd() 메소드 호출
		bcd();
	}
	void bcd() throws Exception {
		System.out.println(3/0);
		
		int [] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		
		Thread.sleep(1000);
	}
	
}

public class Ex01 {

	public static void main(String[] args){
		Aa a = new Aa();
		a.abc();
		
		System.out.println("=============");
		
		Bb b =new Bb();
		try {
			b.abc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
