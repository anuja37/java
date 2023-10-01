public class MiscProblems{

    static void swap(int a, int b){
    System.out.println("orignal value before swap");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    
    int temp=a; // temp=9
    a=b;
    b=temp;
     
     System.out.println("values after swap");
      System.out.println("a:"+a);
       System.out.println("b:"+b);
    }
    public static void main(String args[]){
        int a=9;
        int b=3;
        swap(a,b);
    }
    
}

