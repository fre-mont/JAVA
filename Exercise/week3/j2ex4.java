/*
Scanner를 이용하여 입력,출력 프로그램을 작성
*/
package week3;
import java.util.Scanner;

public class j2ex4 {
    public static void main(String[] args) {

        System.out.print("이름, 도시, 나이 체중, 독신여부를 분리하여 입력하세요>>");
        Scanner scan = new Scanner(System.in);

        String name= scan.next();    // 이름을 문자열로 읽기
        String city = scan.next();   // 도시를 문자열로  읽기
        
        int age = scan.nextInt();    // 나이를 정수로 읽기
        
        double weight = scan.nextDouble();  // 체중을 실수로 읽기

        boolean single = scan.nextBoolean(); // 독신 여부를 논리값으로 읽기

        System.out.println("이름 : " + name);     // 출력
        System.out.println("도시 : " + city);
        System.out.println("나이 : " + age);
        System.out.println("체중 : " + weight);
        System.out.println("독신여부 : " + single);

        scan.close();

        
    }

    
}