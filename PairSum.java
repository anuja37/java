import java.util.Scanner;
//find the total numbers of pairs in the array whose sum is equal to the given value x 
//target = 7
// ans = 2
// (4,3) ; (5,2)
public class PairSum {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        
        for(int i = 0; i < n; i++){//first number
            for(int j = i+1; j<n; j++){//second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        } //pahla loop khatm hone ke baad return statement lagana hai.
        return ans;
    } 
    public static void main(String[]args){ //input liya yaha se
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "element");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
            System.out.println("Enter target sum");
            int target = sc.nextInt();

            System.out.print(pairSum(arr, target));//method ko call kiya
        
    }

    
}  
 //this is for the two pair sum , for triplet is it in the copy.   



