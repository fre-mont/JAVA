// app ��Ű�� 
package app;

import base.Shape;	// base ��Ű���� Shape Ŭ���� �ҷ�����
import derived.Circle;	// derived Ŭ������ Circle Ŭ���� �ҷ�����

// GraphicEditor Ŭ���� �ۼ� 
public class GraphicEditor {
	// main �޼ҵ�()���� ���� ���� 
	 public static void main(String[] args) {
		 Shape shape = new Circle();	// Shape, Circle ��ü ����
		 shape.draw();	// Circle ��ü�� draw()�޼ҵ� ȣ��(�������ε�) 
		 }
}
