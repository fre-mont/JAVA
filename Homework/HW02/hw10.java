package HW02;

import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        
        int money = scan.nextInt();
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10};

        for(int i=0; i<unit.length; i++){
            if(money < unit[i]){
                continue;
            }
            int number = money / unit[i];
            money -= number*unit[i];
            System.out.println(unit[i] + ": "+ number +"개");
            
        }

        scan.close();
    }
    
}
