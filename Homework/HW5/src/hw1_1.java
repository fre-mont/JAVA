/* 중심을 나태내는 정수 x,y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하고 Circle 객체의 중심이 같으면 같은 것으로 판별하는 자바 프로그램 */


// Circle 클래스 작성 
class Circle{
	private int x,y,radius;	// 원의 중심 x,y와 반지름 radius의 필드변수 선언 
	
	public Circle(int x, int y, int radius) {
		// this 키워드를 사용하여 입력 매개변수를 필드변수에 대입 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// String을 반환하는 toString() 메소드 
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius ;
	}
	// 두 개의 Circle 객체의 중심이 같은지 boolean 값을 반환하는 equals() 메소드 
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;	// Circle 객체 생성 
		// 두 객체의 x, y 값이 모두 같은 경우 조건문 실행 
		if(x==c.x && y==c.y) {
			return true;	
		}
		return false;	
	}
}


public class hw1_1 {
	// main 메소드()에서 실행 시작 
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);	// Circle 객체 a 생성 
		Circle b = new Circle(2,3,30);	// Circle 객체 b 생성 
	
		System.out.println("원 a : " + a);	// toString()메소드 호출하여 화면 출력 
		System.out.println("원 b : " + b);
		
		// equals() 메소드의 값이 참(true)이면 조건문 실행 
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		// 거짓(false)이면
		else
			System.out.println("서로 다른 원");
		}

}
