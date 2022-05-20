package week10;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        //배열 a와 b를 연결한 새로운 배열 리턴
        int arr[] = new int[a.length+b.length];     // 크기가 9인 배열
        for(int i = 0; i<a.length; i++){    // 0~3까지 그대로 대입(첫번째 배열)
            arr[i] = a[i];
        }
            
        for(int i=a.length; i<a.length+b.length; i++){  // 4부터 8까지 두번째 배열 대입 
            arr[i] = b[i-a.length];
        }
            
        return arr;
    }
        

    public static void print(int[] a) {
        System.out.print("[");
        for(int i=0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }
        System.out.print("]");  
    }
}

   public class StaticEx {
   public static void main(String [] args){
   int [] array1 = { 1, 5, 7, 9 };
   int [] array2 = { 3, 6, -1, 100, 77 };
   int [] array3 = ArrayUtil.concat(array1, array2);
   ArrayUtil.print(array3);
   }

}


