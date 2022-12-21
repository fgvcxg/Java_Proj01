package chapter16.ex10;

//제너릭 클래스 / 제너릭 메소드를 사용해서 두점의 좌표값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point <X,Y>{
	X x;
	Y y;
	
	//생성자를 사용해서 t, v의 값을 입력
	Point(){}
	Point(X x, Y y){
		this.x=x;
		this.y=y;		
	}
	
	//getter만 생성
	public X getX() {return x;}
	public Y getY() {return y;}
}

//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod{
	
	//makeRectangle() 메소드를 호출시 
	public static <T extends Number,V extends Number> double makeRectangle(Point<T,V> p1,Point<T,V> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌
		
		double xx = p1.x.doubleValue()-p2.x.doubleValue();
		double yy = p1.y.doubleValue()-p2.y.doubleValue();

		double area = xx * yy;
		if(area < 0) {
			area *= -1;
			return area;
		}else {
			return area;
		}
	
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 두점의 좌표를 저장하는 p1, p2
		Point<Number, Number> p1 = new Point(-5, -5);
		Point<Number, Number> p2 = new Point(10, 10);
		
		//makeRectangle(p1,p2)	<== 두점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		GenericMethod g1 = new GenericMethod();
		double a = g1.makeRectangle(p1, p2);
		
		System.out.println(a);
		

	}

}
