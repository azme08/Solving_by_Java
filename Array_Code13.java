//Array Matrix Simple Code just printing 1-19 maintaining 4x5 Matrix

public class Practice1 {

    public static void main(String[] args){
      // Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][5];
        int k=0;
        //input Matrix
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                arr[row][col]=k;
                k++;
            }
        }
        
        //printing output
         for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+arr[row][col]);
            }
             System.out.println("");
        }
        
    }
   
}
