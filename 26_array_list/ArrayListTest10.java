import java.util.*;
public class ArrayListTest10 {
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

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}