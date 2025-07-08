import java.util.*;

public class ArrayListTest3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add(" ");
        list.add(" ");
        list.add(" ");
        list.remove(0);
        
        System.out.println(list);
        
    }
}
