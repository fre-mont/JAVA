package week9;

import java.util.Scanner;

class Phone{
    String name;
    String tel;

    public Phone(){
        
    }

    public Phone(String name, String tel) {
        this.name = name; 
        this.tel = tel;
    }

    public String getName() { 
        return name; 
    }

    public String getTel() { 
        return tel; 
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int number = scan.nextInt();

        Phone list[] = new Phone[number];

        for(int i=0; i<number; i++){
            list[i] = new Phone();
        }

        for(int i=0; i<number; i++){
            System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>> ");
            String name = scan.next();
            String tel = scan.next();
            list[i] = new Phone(name, tel);
        }

        System.out.println("저장되었습니다...");


        while(true){
            int count = 0;
            System.out.print("검색할 이름 >> ");
            String text = scan.next();

            if (text.equals("stop")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            for(int i = 0; i<list.length; i++){
                if(text.equals(list[i].getName())){
                    System.out.println(text +"의 번호는 " + list[i].getTel() + "입니다.");
                    count++;
                    break;
                    }  
                
            }

            if (count == 0){
                System.out.println(text +"(이)가 없습니다.");
            }

        } 

        scan.close();
        
    }
    
}
