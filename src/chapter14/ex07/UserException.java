package chapter14.ex07;

//사용자 정의 예외
//1. 점수가 음수이면 예외 발생 시키는 사용자 정의 예외
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}	
}

//2. 점수가 100점을 초과하는 경우 사용자 정의 예외
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}	
}

//사용자 정의 예외를 처리할 클래스
class Aa{

	
	void checkScore(int score)  {
		try {
			if(score < 0) {		//MinusException 강제 발생
				throw new MinusException("예외가 발생됨 : 음수값 입력 불가");
			}else if(score > 100) {	//OverException 강제 발생
				throw new OverException("예외가 발생됨 : 100 초과 입력 불가");
			}else {
				System.out.println("정상 값입니다");
			}
		} catch (Exception e) {
			System.out.println("사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage());
		}
		
	}
}

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account();
		a.withdrow(-1500);

	}

}
