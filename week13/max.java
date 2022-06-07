package week13;

import java.util.*;

public class max {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("정수(-1이 입력될 때까지) >> ");

        while(true){        
            int number = scan.nextInt();
    
            if(number == -1){
                break;
            }

            v.add(number);
            
        }

        int max = 0;
        for(int i=0; i<v.size(); i++){
            
            if (v.get(i) > max){
                max = v.get(i);
            }

        }
        System.out.println("가장 큰 수는 " + max);

        scan.close();

    }
    
}
