package week13;

import java.util.*;

public class average {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        ArrayList<String> al = new ArrayList<String>();

        System.out.print("6개의 학점을 빈 칸으로 분리입력(A/B/C/D/F) >> ");

        for(int i = 0; i<6; i++){
            al.add(scan.next());
        }

        for(int i = 0; i < al.size(); i++) {
            switch (al.get(i).charAt(0)) {
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1.0;
                    break;
                case 'F':
                    sum += 0.0;
                    break;
            }
        }

        System.out.println(sum/al.size()); //평균을 출력합니다.
    
        scan.close();
    }
        
}

   
