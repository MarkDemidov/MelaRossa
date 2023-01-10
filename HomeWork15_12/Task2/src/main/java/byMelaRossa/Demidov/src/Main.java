//// Дано множество сотрудников. Сотрудник содержит имя, фамилию, зарплату год трудоустройства.
//        Определить всех сотрудников, фамилии которых начинающиеся на букву «J».
//        имя которых длинее 7 символов
//        3 самых новых сотрудника
//        3 самых старых сотрудника, зп которых менее 100

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Office[] staff = new Office[5];
        staff[0] = new Office("Aleksandr", "Bobsten", 15, 2018);
        staff[1] = new Office("Fedor", "Jordan", 145, 2018);
        staff[2] = new Office("Karl", "Jakson", 17, 2009);
        staff[3] = new Office("Vladislav", "Killian", 196, 2015);
        staff[4] = new Office("Jason", "Morgan", 129, 2010);


//        Определить всех сотрудников, фамилии которых начинающиеся на букву «J»
        Arrays.stream(staff).filter(x -> x.getLastName().charAt(0) == 'J').forEach(System.out::println);

//       Сотрудники, имя которых длинее 7 символов
        Arrays.stream(staff).filter(x -> x.getName().length() > 7).forEach(System.out::println);

//        3 самых новых сотрудника
        Arrays.stream(staff).map(Office::getYear).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

//        3 самых старых сотрудника, зп которых менее 100
        Arrays.stream(staff).filter(x -> x.getSalary() < 100).map(Office::getYear).sorted().limit(3).forEach(System.out::println);
    }
}
