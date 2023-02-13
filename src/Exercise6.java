
import java.lang.reflect.Array;
import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        String[] arr = {"a", "c", "j", "b"};
        sort(arr);
        for (String s : arr) {
            System.out.println(s + " ");
        }
        System.out.println();
        shuffle(arr);
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }

    public static void sort(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
    }

    public static void shuffle(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
    }
}
