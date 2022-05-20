package HW3;

public class TV2 {
	String name;	// TV brand �̸��� ������ ���ڿ� ���� ���� 
	int year;	// TV�� ������ ������ ������ ���� ����
	int size;		// TV�� ũ�⸦ ������ ������ ���� ���� 
	
	// TV�� �̸�, ����, ũ�⸦ �Ű������� �޴� TV �޼ҵ�
	public TV2(String name, int year, int size) {
		// this Ű���带 ����Ͽ� ������ �� ���� 
		this.name = name;
		this.year = year;
		this.size = size;
	}
	// ���ڿ��� ȭ�鿡 ����ϴ� show() �޼ҵ� 
	public void show() {
		System.out.print(name +"���� ���� " + year+"���� " + size+"��ġ TV");	
	}
	
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String [] args){
		TV2 myTV = new TV2("LG", 2017, 32); // LG���� ���� 2017���� 32��ġ
		myTV.show();	// show()�޼ҵ� ȣ�� 
	}

}
