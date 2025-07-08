import java.util.*;

public class ArrayListTest5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add(" ");
        list.add(" ");
        list.add(" ");
        list.remove(0);
        list.clear();
        int element = list.size();
        
        System.out.println(element);
        
    }
}
