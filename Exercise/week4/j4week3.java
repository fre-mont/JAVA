/*
보이저(시속 6만km)로 Proxima Centauri 항성까지 걸리는 시간을 계산하는 프로그램
*/
package week4;
public class j4week3 {
    public static void main(String[] args) {

    double Proxima_Centauri = 40*Math.pow(10,12) ;
    int Voyager_speed = 60000;

    int time = (int)Proxima_Centauri / Voyager_speed;

    System.out.println("보이저로 Proxima Centauri 항성까지 걸리는 시간은 " + time + "시간입니다.");
        
    }

    
}
