package ppj.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Martin on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ac");
        names.add("ag");
        names.add("b");

        names.stream()
                .filter((s) -> {
                System.out.println(s);
                 return s.startsWith("a");
                });
    }
}
