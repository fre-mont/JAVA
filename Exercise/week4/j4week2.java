/*
빛의 속도로 지구에서 항성으로 갈 때 걸리는 광년을 계산하는 프로그램
*/
package week4;
public class j4week2 {
    public static void main(String[] args) {
        double Proxima_Centauri = 40*(Math.pow(10,12));
        double distance_per_second = Proxima_Centauri / 300000;
        double light_year = ((distance_per_second/3600)/24)/365;

        System.out.println("걸리는 시간은 약 " + light_year + "광년입니다.");
    }
    
}
