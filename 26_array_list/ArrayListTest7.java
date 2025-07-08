import java.util.*;
public class ArrayListTest7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add(" ");
        list.add(" ");
        list.add(" ");
        var array = new ArrayList<String>();
        array.add("Tom");
        array.add("Joseph");
        array.add("Mini");
        list.addAll(array);
        
        System.out.println(list);
        
    }
}