import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Main<count> {
    public static void main(String[] args) {
        //дан массив целых чисел. Определить количество четных элементов,
// сумму массива,
// сумму первых трех элементов,
// сумму первых трех элементов которые делятя на 3...

        int[] array = {43, 51, 31, 76, 93, 21, 32};

        IntStream.of(43, 51, 31, 76, 93, 21, 32).filter(x -> x % 2 == 0).forEach(System.out::println);

        int sumOfArray = Arrays.stream(array).sum();
        System.out.println("Сумма всех эелементов массива: " + sumOfArray);

        int sumOfTheFirstThreeElements = Arrays.stream(array).limit(3).sum();
        System.out.println("Сумма первых трёх эелементов массива: " + sumOfTheFirstThreeElements);

        int sumOfTheFirstThreeElementsDividedIntoThree = Arrays.stream(array).filter(x -> x % 3 == 0).limit(3).sum();
        System.out.println("Сумма первых трёх эелементов массива, которые деляться на 3: " + sumOfTheFirstThreeElementsDividedIntoThree);


//------------------------------------------------
// Дан список строк, посчитать количество разных букв во всех строках
        ArrayList<String> list = new ArrayList<String>();
        list.add("i");
        list.add("love");
        list.add("naruto");
        list.add("uzumaki");

        System.out.println("Количество разных букв во всех строках " +
                list.stream().flatMapToInt(String::chars).distinct().count());

        Office office = new Office();
        Office[] staff = new Office[4];
        staff[0] = new Office("Vaso","Jordan",15,2018);
        staff[1] = new Office("Fedor","Bobsten",15,2018);
        staff[2] = new Office("Karl","Jakson",15,2018);
        staff[3] = new Office("Bob","Killian",15,2018);

    }
}
