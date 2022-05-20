package HW02;

import java.util.Scanner;   // Scanner 불러오기

public class hw8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // SCanner 객체생성

        int min = Integer.MAX_VALUE;

        for(int i=1; i<=3; i++){
            System.out.print(i + "번째 정수를 입력하세요 : ");
            int number = scan.nextInt();

            if(number < min){
                min = number;
            }
        }

        System.out.println("Max값은 : " + min + "입니다.");
        scan.close();
    }
    
}
