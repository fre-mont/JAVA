package week9;

public class TV {

    String brand;
    int year;
    int size;

    public TV(String brand, int year, int size){
        this.brand = brand;
        this.year = year;
        this.size = size;
    }

    public void show(){
		System.out.println(brand +"에서 만든 "+ year +"년형 "+ size +"인치 TV");
	}
    public static void main(String [] args){
        TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
        myTV.show();
    }
        
}
