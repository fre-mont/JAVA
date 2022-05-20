package HW3.TV;

/* TV Ŭ������ ��ӹ��� ColorTV Ŭ������ �ۼ��ϴ� �ڹ� ���α׷� */

class TV {
	
	private int size;	// private ���� ���� 
	
	// ������ ������ �Է����� �޴� TV ������ 
	public TV(int size) { 
		// this Ű����� �Ű����� ���� ������ ���� 
		this.size = size; 
	}
	
	// size�� ��ȯ�ϴ� �޼ҵ�
	protected int getSize() { 
		return size; 
	}
}

// TV Ŭ������ ����ϴ� ColorTV Ŭ���� 
class ColorTV extends TV{
	private int color;	// private ���� ���� 
	
	// size�� color�� �Ű������� �ϴ� ColorTV ������ 
	public ColorTV(int size, int color) {
		super(size);	// super Ű���带 �̿��� �Էµ� �Ű������� �θ� Ŭ������ �Ѱ��ֱ� 
		this.color= color;	// this Ű����� �Էµ� �Ű������� �ʵ庯���� ���� 
	}
	
	// ������ ����ϴ� �޼ҵ� 
	public void printProperty() {
		System.out.print( getSize() + "인치 " + color + "컬러");
		
	}
	
}

public class hw10 {
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);	// ColorTV Ŭ���� ��ü ���� 
		myTV.printProperty();	// ColorTV Ŭ������ ���� ��� �޼ҵ带 ��� 
		}

}
