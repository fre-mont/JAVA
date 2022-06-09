package etc; // etc 패키지 

// Calc 클래스의 접근지정자를 public으로 설정하여 다른 패키지에서 접근할 수 있도록 허용함 
public class Calc {
	private int x,y;	// 필드변수 
	
	// 두 개의 입력변수를 갖는 Calc 생성자 작성 
	public Calc(int x, int y) {
		// 입력 매개변수를 필드변수에 대입 
		 this.x = x ; 
		 this.y = y; 
	 }
	
	 // 정수값을 반환하는 sum() 메소드 
	 public int sum() { 
		 return x+y; 
	 }

}
