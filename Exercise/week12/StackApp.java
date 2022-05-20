package week12;

import java.util.Scanner;
interface Stack{
    int length();
    int capacity();

    String pop();
    boolean push(String val);
}

class StringStack implements Stack{
    private String stack[];
    private int sp = 0;

    public StringStack(int i){
        stack = new String[i];
    }

    public int length(){
        return sp;
    }

    public int capacity(){
        return stack.length;
    }

    public String pop(){
        if(sp ==0){
            return "empty";
        }
        else{
            String pointer = stack[sp-1];
            sp--;
            return pointer;
        }
    }

    public boolean push(String val){
        if(sp == stack.length){
            return false;
        }

        else{
            stack[sp] = val;
            sp++;
            return true;
        }
    }

}


public class StackApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = scan.nextInt();
        StringStack st = new StringStack(size);

        while(true){
            System.out.print("문자열 입력 >> ");
            String text = scan.next();

            if(text.equals("그만")){
                break;
            }

            if(st.push(text) == false){
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }

            for(int i =0; i<st.length(); i++){
                System.out.print(st.pop() + " ");
            }


        }

        scan.close();
    }
    
}
