/**
2자리의 정수 (10~99사이)를 입력받고, 십의자리와 1의자리가 같은지 판별하여 출력하는 프로그램
**/
package week4;

import java.util.Scanner;

public class j4week1 {

    public static void main(String[] args) {

        System.out.print("2자리수 정수 입력(10-99) >> ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int first = number / 10;
        int second = number % 10;

        if (first == second)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        
        scan.close();
    }
}


