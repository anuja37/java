import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        //its wrapper class
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        ArrayList<Integer> l1 = new ArrayList<>();
        // we can take any other primitive data type in place of integer
        // add new element/
        l1.add(5);//0
        l1.add(6);//1
        l1.add(7);//2
        l1.add(8);//3

        //get an element at index 1
        System.out.println(l1.get(1));

        //print with loop
        for(int i=0;i<l1.size();i++){
             System.out.println(l1.get(i));
        }
        //will give 5 6 7 8 
        //direct with arraylist
            System.out.println(l1);  
            //will give [5,6,7,8]


            //adding element at some index
           l1.add(1,100);
            System.out.println(l1);// 5 100 6 7 8 

            //modifying element at index 1
            l1.set(1,10);
            System.out.println(l1);//5 10 6 7 8 

            //removing element at index 1
           l1.remove(1);
           System.out.println(l1);//5 6 7 8
    }
}
