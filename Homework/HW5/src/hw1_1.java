/* �߽��� ���³��� ���� x,y�� ������ radius �ʵ带 ������ Circle Ŭ������ �ۼ��ϰ� Circle ��ü�� �߽��� ������ ���� ������ �Ǻ��ϴ� �ڹ� ���α׷� */


// Circle Ŭ���� �ۼ� 
class Circle{
	private int x,y,radius;	// ���� �߽� x,y�� ������ radius�� �ʵ庯�� ���� 
	
	public Circle(int x, int y, int radius) {
		// this Ű���带 ����Ͽ� �Է� �Ű������� �ʵ庯���� ���� 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// String�� ��ȯ�ϴ� toString() �޼ҵ� 
	public String toString() {
		return "Circle(" + x + "," + y + ")������" + radius ;
	}
	// �� ���� Circle ��ü�� �߽��� ������ boolean ���� ��ȯ�ϴ� equals() �޼ҵ� 
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;	// Circle ��ü ���� 
		// �� ��ü�� x, y ���� ��� ���� ��� ���ǹ� ���� 
		if(x==c.x && y==c.y) {
			return true;	
		}
		return false;	
	}
}


public class hw1_1 {
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);	// Circle ��ü a ���� 
		Circle b = new Circle(2,3,30);	// Circle ��ü b ���� 
	
		System.out.println("�� a : " + a);	// toString()�޼ҵ� ȣ���Ͽ� ȭ�� ��� 
		System.out.println("�� b : " + b);
		
		// equals() �޼ҵ��� ���� ��(true)�̸� ���ǹ� ���� 
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		// ����(false)�̸�
		else
			System.out.println("���� �ٸ� ��");
		}

}
