// app 패키지 
package app;

import base.Shape;	// base 패키지의 Shape 클래스 불러오기
import derived.Circle;	// derived 클래스의 Circle 클래스 불러오기

// GraphicEditor 클래스 작성 
public class GraphicEditor {
	// main 메소드()에서 실행 시작 
	 public static void main(String[] args) {
		 Shape shape = new Circle();	// Shape, Circle 객체 생성
		 shape.draw();	// Circle 객체의 draw()메소드 호출(동적바인딩) 
		 }
}
