package chapter14.ex07;

class BalanceException extends Exception{
	BalanceException(){
		super();
	}
	BalanceException(String message){
		super(message);
	}
}

public class Account {
	private long balance = 1000;		//예금의 잔고
	public Account() {}	//기본 생성자
	
	public long getBalance() {	//getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	//출금
	public void deposit(int money) {	//기존의 잔고에서 money를 인풋받고 더해서 다시 필드에 적용
		balance += money;
	}
	
	
	
	
	
	public void withdrow(int money) {
		//잔고가 머니보다 작은 경우 잔고 부족이라고 강제로 예외를 발생시켜서 처리
			//예외 메시지 : 잔고가 부족합니다. 라고 출력을 해주면 됨
			//BalanceException <== 사용자 정의 예외를 생성해서 
		
		// 예외처리
		BalanceException b1 = new BalanceException("예외 메시지 : 잔고가 부족합니다.");
		
		try {
			if(balance < -money) {
				throw b1;
			}else {
				System.out.println("정상적으로 출금 되었습니다");
				deposit(money);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			
			System.out.println("잔액은 " + balance + "입니다");
		}
		
	}
	

}
