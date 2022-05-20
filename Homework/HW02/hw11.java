package HW02;

public class hw11 {

    public static void main(String[] args) {
        
        int array[][] = new int[4][4];
        int count = 1;

        for(int i=0; i<array.length; i++){               
            for(int j=0; j<array.length; j++){  
                array[i][j] = (int)(Math.random()*10+1);
            }
        }

        while(count<7) {
		    int r =  (int)(Math.random()*3);  // 4*4 배열이기 때문에 0~3까지			
            int l =   (int)(Math.random()*3); 
			
		    if(array[r][l] != 0) 
            {
			    array[r][l] = 0;
			    count++;
			}
		}

        for(int i=0; i<array.length; i++){               
            for(int j=0; j<array.length; j++){  
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    
    
    }
    
}
