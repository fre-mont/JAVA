package HW02;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하시오>> ");
        int num = scan.nextInt();
        
        for (int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        scan.close();
    }
    
}
