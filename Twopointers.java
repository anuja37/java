import java.util.Scanner;

public class Twopointers {
    //helper array for printing array
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   // 2nd approach
    static void sortZerosAndOnes(int[]arr){
     int n=arr.length;
     int left=0, right=n-1;

     while(left<right){
        if(arr[left] ==1 && arr[right]==0){
            swap(arr, right, right);
            left++;
            right--;

        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
     }
    }
    // 1st approach 
    // static void sortZerosAndOnes(int[]arr){
    //     int n=arr.length;
    //     int zeros=0;
    //     for traversing array
    //     for(int i=0; i<n;i++){
    //         if(arr[i]==0){
    //             zeros++;
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         if(i<zeros){
    //             arr[i]=0;
    //         }
    //         else{
    //             arr[i]=1;
    //         }
    //     }
    // }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
       System.out.println("Enter"+ n +"element");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("original Array");
       printArray(arr);
       sortZerosAndOnes(arr);
       System.out.println("Sorted Array");
       printArray(arr);
    }
}
