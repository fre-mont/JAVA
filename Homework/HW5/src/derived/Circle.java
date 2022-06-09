//derived 패키지
package derived;

import base.Shape;	// base 패키지의 Shape 클래스 불러오기
// Shape 클래스를 상속받는 Circle 클래스 작성 
public class Circle extends Shape{
	// draw() 메소드 오버라이딩 
	public void draw() {
		System.out.println("Circle");
	}

}
