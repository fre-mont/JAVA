package week9;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;

        String course [] = {"java", "c++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};

        while(true){
            int count = 0;
            System.out.print("과목 이름 >> ");
            name = scan.next();

            if (name.equals("stop")){
                break;
            }

            for(int i=0; i<course.length; i++){
                    if (course[i].equals(name)){
                        System.out.println(score[i]);
                        count++;
                    }  
                
            }
            if (count == 0){
                System.out.println("없는 과목입니다.");
            }

        }   
            scan.close();    

    }

       

}
