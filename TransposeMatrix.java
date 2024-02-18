import java.util.Scanner;
public class TransposeMatrix{
    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]+ " ");
            }
             System.out.println();
        }
        static int[][] findTranspose(int[][] matrix,int r, int c){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter"+ totalElements +"values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

         System.out.println("Transpose of matrix");
         int[][] ans=findTranspose(matrix,r,c);
    }
}