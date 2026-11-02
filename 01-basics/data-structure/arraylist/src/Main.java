import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);

        list.remove(4);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        Collections.sort(list);

        System.out.println(list);
    }
}
