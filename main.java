import java.util.Scanner;
public class main {
    static void printIncreasing(int n){//1234....n-1,n
        if(n==1){
            System.out.println(n);
            return ;
         }
        //  recursive work
         printIncreasing(n-1);//print up to n-1
        //  self work
         System.out.println(n);//print n
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printIncreasing(n);
    }
}