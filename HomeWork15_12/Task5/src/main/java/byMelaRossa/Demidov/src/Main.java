//Дан список строк, посчитать количество разных букв во всех строках

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Stream<String> stream = list.stream();
        System.out.println(stream.flatMapToInt(String::chars).distinct().count());

    }
}

