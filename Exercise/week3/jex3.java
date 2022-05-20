// Scanner 클래스를 이용해 원화를 달러로 바꾸고 출력하는 프로그램
package week3;
import java.util.Scanner;

public class jex3 {
    public static void main(String[] args) {

        System.out.print("원화를 입력하세요(단위 원) >>");
        Scanner scan = new Scanner(System.in);

        int KRwon = scan.nextInt();
        double dollar = KRwon / 1100.0;

    
        System.out.println(KRwon + "원은 $" + dollar + " 입니다.");

        scan.close();


    }
}
