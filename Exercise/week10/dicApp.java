package week10;

import java.util.Scanner;

class Dictionary {
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length; i++){
            if(word.equals(kor[i])){    // 만약 단어가 존재하면 
                return eng[i];
            }
        }
        return "저의 사전에 없습니다.";     // 단어가 존재하지 않으면
    }

    
}

public class dicApp{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어? ");
            String text = scan.next();
            String eng = Dictionary.kor2Eng(text);  // 객체 생성하지 않고 접근 가능함(public static)

            if(text.equals("종료")){     // 종료를 입력하면 반복작업 stop
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println(text+"은 " + eng);

        }
        scan.close();
        
    }
}
