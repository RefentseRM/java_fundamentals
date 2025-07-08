import java.util.*;
public class ArrayListTest8 {
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
        list.containsAll(array);

        
        System.out.println(list);
        
    }
}