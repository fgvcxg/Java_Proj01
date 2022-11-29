package chapter12.ex02;

public class Eagle implements Animal {
	@Override
	public void cry() {
		System.out.println("끼얏호");	
	}
	@Override
	public void run() {
		System.out.println("독수리는 날지");	
	}

}
