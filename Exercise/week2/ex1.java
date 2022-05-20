package week2;

public class ex1 {

    // 매개변수의 합을 출력하는 sum 함수 
    public static int sum(int n, int m) {
        return n + m;  
    }

    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i , 10);
        a = '?';    // 문자 ? 출력
        System.out.println(a);
        System.out.println("Hello");    // 문자열 Hello 출력 
        System.out.println(s);
    }
    
}
