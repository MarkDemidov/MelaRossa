import java.util.Arrays;
import java.util.stream.IntStream;

//дан массив целых чисел. Определить количество четных элементов,
// сумму массива,
// сумму первых трех элементов,
// сумму первых трех элементов которые делятя на 3...

public class Main {
    public static void main(String[] args) {

        int[] array = {43, 51, 31, 76, 93, 21};

        IntStream.of(43, 51, 31, 76, 93, 21).filter(x -> x % 2 == 0).forEach(System.out::println);

        int sumOfArray = Arrays.stream(array).sum();
        System.out.println("Сумма всех эелементов массива: " + sumOfArray);

        int sumOfTheFirstThreeElements = Arrays.stream(array).limit(3).sum();
        System.out.println("Сумма первых трёх эелементов массива: " + sumOfTheFirstThreeElements);

        int sumOfTheFirstThreeElementsDividedIntoThree = Arrays.stream(array).filter(x -> x % 3 == 0).limit(3).sum();
        System.out.println("Сумма первых трёх эелементов массива, которые деляться на 3: " + sumOfTheFirstThreeElementsDividedIntoThree);
    }
}