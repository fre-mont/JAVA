package HW02;

import java.util.Scanner;

public class hw12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 몇 개 ? ");

        int num = scan.nextInt();
        int line = 0;

        int unit[] = new int[num];

        for(int i=0; i<num; i++){
            for(int j=0; j<i; j++){
                if(unit[i] == unit[j]){
                    continue;
                }
            }
            unit[i] = (int)(Math.random()*100+1);
        }

        for(int i=0; i<num; i++){
            System.out.print(unit[i] +" ");
            line++;
            
            if(line == 10){
                System.out.println();
                line = 0;
            }
        }

        scan.close();
    }
    
}
