package week9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0, m=0;
       
        do {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try{
                n = scan.nextInt();
                m = scan.nextInt();
                System.out.print(n + "x" + m + "=" + n * m);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scan.nextLine();
            }
            
        } while (true);

        scan.close();

    }

    
}
    
     