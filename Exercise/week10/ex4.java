package week10;

class Point {
    private int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point{
    private int z;

    public Point3D(int a, int b, int c){
        a = getX();
        b = getY();
        z = c;
    }

    public int getZ(){
        return z;
    }

    public String toString(){
        return ("(" + getX() +"," + getY() +","+ getZ() + ")");
    }

    public void moveUp(){
        z++;
    }

    public void moveDown(){
        z--;
    }

    public void move(int x, int y, int z){
        move(x,y);
        this.z = z;
    }
}

public class ex4 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z 축의 값.
        System.out.println(p.toString() + "입니다.");
        p.moveUp(); // z축 1값 증가
        System.out.println(p.toString() + "입니다.");
        p.moveDown(); // z축 1값 감소

        p.move(10, 10); // x, y 축의 해당 위치로 이동
        System.out.println(p.toString() + "입니다.");
        p.move(100, 200, 300); // x, y, z 축의 해당 위치로 이동
        System.out.println(p.toString() + "입니다.");
    }        

    
    
}
