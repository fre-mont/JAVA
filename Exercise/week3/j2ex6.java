// 대입 연산자와 증감 연산자 실습 
package week3;
public class j2ex6 {
    public static void main(String[] args) {

        int a = 3, b = 3, c = 3, d = 3;

        a += 3; // 6
        b *= 3; // 9
        c %= 2; // 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        a = d++; 
        System.out.println("a=" + a + ", d=" + d); // a=3, d=4
        a = ++d; 
        System.out.println("a=" + a + ", d=" + d); // a=5, d=5
        a = d--; 
        System.out.println("a=" + a + ", d=" + d); // a=5, d=4
        a = --d; 
        System.out.println("a=" + a + ", d=" + d);  // a=3, d=3
    }

    
}
