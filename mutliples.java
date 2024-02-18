import java.util.Scanner;

public class mutliples {//5,10,15,20 (5 ke 4 multiples)
    static void printmultiples(int n,int k){//5,4
    //base case
    if(k==1){
        System.out.println(n);
        return ;
    }
     //recursive work
    printmultiples(n, k-1);//5,10,15
    //self work
    System.out.println(n*k);//20
}
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        printmultiples(n, k);
    }
}
