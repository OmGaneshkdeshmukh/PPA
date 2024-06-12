import java.util.*;
class p1 {
 public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the No of rows");
    int row = sc.nextInt();
    System.out.println("Enter the No of Columns");
    int col = sc.nextInt();

    int mat1 [][]= new int [row][col];
    int mat2 [][]=new int [row][col];
    int result [][]=new int [row][col];

            System.out.println("Enter the elements of matrixn 1");
            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++){
                    mat1 [i][j]=sc.nextInt();
                    
                }
                
            }
            System.out.println();

            System.out.println("Enter the elements of matrix 2");
            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++){
                    mat2 [i][j]=sc.nextInt();
                    //System.out.print(mat2[i][j] +"\t");
                }
                
            }
            System.out.println();

            System.out.println("Result Matrix");
            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++){
                    result [i][j]=mat1[i][j] + mat2 [i][j];
                    //System.out.print("Result Matrix "+result[i][j] +"\t");
                }
                
            }
            System.out.println();

            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++){System.out.print(result[i][j] + "\t");
                }
                System.out.println();
 }   
}
}