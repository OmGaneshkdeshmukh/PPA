import java.util.*;
class p1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of Rows");
        int row = sc.nextInt();
        System.out.println("Enter The No OF Columns");
        int col = sc.nextInt();

        int mat[][] = new int [row][col];
        int temp = (row*col)/2;

        int count=0;
        System.out.println("Enter the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }   
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(mat[i][j]==0){
                        count++;
                    }
                }
            }
            System.out.println("Count = "+count);
            if (count>temp){
                System.out.println("This is a sparse matrix");
            }
                else{
                    System.out.println("This is not a Sparse Matrix");
                }
     }
}