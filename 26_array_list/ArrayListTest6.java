import java.util.*;

public class ArrayListTest6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add(" ");
        list.add(" ");
        list.add(" ");
        boolean element = list.contains("banana");
        
        System.out.println(element);
        
    }
}
