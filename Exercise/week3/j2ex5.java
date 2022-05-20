/* 
초 단위 정수를 입력받고, 시간/분/초를 출력하는 프로그램
*/
package week3;

import java.util.Scanner;

public class j2ex5 {
    public static void main(String[] args) {

        System.out.print("정수를 입력하세요>> ");
        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초입니다.");

        scan.close();

        
    }

    
}
