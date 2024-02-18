import java.util.ArrayList;
import java.util.Collections;
public class problem {
    static void reverselist(ArrayList<Integer>list){
        int i=0 , j=list.size()-1;
        while (i<j) {
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;}
    }
    public static void main(String[] args) {
        ArrayList<Integer>List= new ArrayList<>();
        List.add(0);
        List.add(2);
         List.add(5);
          List.add(22);
           List.add(99);
           System.out.println("original list:"+List);
           Collections.reverse(List);
            System.out.println("reverse list:"+List);
            Collections.sort(List);
            System.out.println("Ascending list:"+List);
           Collections.reverse(List);
            System.out.println("Descending list:");

    }
}
