public class factorial {
    static int main(int n){ //n=5
        //base case
        if(n==0)
            return 1;
        //smaller problem - recursive work
        int smallAns = main(n-1); //factorial(4)=24
        //bigger problem-self work
        int ans = n*smallAns;
        return ans;
         }
    public static void main(String[] args) {
        System.out.println(main(5));
    }
}