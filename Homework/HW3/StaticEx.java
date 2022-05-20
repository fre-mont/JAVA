package HW3;

class ArrayUtil {
	// �� �迭�� �Է¹޾� ���ο� �迭�� ��ȯ�ϴ� static �޼ҵ� 
	public static int [] concat(int[] a, int[] b){
		int [] arr = new int[a.length+b.length]; // �Է¹��� �� �迭�� ũ�⿡ �ش��ϴ� ���ο� �迭 ���� 
		
		// ù ��° �迭�� ũ�⸸ŭ �ݺ����� ���� 
		for (int i=0; i<a.length; i++) {
			arr[i] = a[i];	// ���ο� �迭�� ó������ �Է¹��� ù ��° �迭�� ���� ���� 
		}
		// ���ο� �迭���� ù ��° �迭�� �� ������ ũ�⸸ŭ �ݺ����� ����
		for (int j=a.length ; j<arr.length; j++) {
			arr[j] = b[j-a.length];	// ���ο� �迭�� �� ��° �迭�� ���Ҹ� ���� 
		}
		return arr;	// ���ο� �迭 ��ȯ
			
}
	// �迭�� ����ϴ� static �޼ҵ� 
	public static void print(int[] a) {	 
		// �迭 a�� �迭 ���¸� �����ϸ� ���
		System.out.print("[ ");
		// �迭�� ũ�⸸ŭ �ݺ��� ���� 
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");	// �迭�� ���� ������ ������ �־� ȭ�� ��� 
		}
		System.out.print("]");
	}
	
}	
	
public class StaticEx {
	// main �޼ҵ�()���� ���� ���� 
	public static void main(String [] args){
		// �迭 ���� �� �ʱ�ȭ
		int [] array1 = { 1, 5, 7, 9 };	
		int [] array2 = { 3, 6, -1, 100, 77 };
		
		// ArrayUtil Ŭ������ Ȱ���� �迭�� ������ ���ο� �迭 ���� �� ��� 
		int [] array3 = ArrayUtil.concat(array1, array2);	// public static���� ����� Ŭ������ ��ü �������� �ʾƵ� ���� ���� 
		ArrayUtil.print(array3);	
	}
}
