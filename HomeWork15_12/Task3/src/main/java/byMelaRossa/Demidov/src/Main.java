import java.util.stream.IntStream;

//Создайте программу,
// выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 100).limit(55).filter(x -> x % 2 != 0).forEach(System.out::println);
    }
}
