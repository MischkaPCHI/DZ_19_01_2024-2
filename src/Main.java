import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        4.
        Дан список строк вида “John,18” т.е. имя,возраст. Необходимо получить список Person.
         */

        List<String> personList = new ArrayList<>();
        personList.add("Jack,20");
        personList.add("Lena,17");
        personList.add("Olga,28");

        System.out.println(ConvertToPersonList.convertToPersonList(personList));

        System.out.println(personList);

        System.out.println("-".repeat(200));

        /*
        5.
        Дан  List<Student>. У каждого студента есть имя и список оценок.
        Необходимо получить список строк вида: John, 4.76 т.е. имя, средний балл
         */
        List<Student> students = new ArrayList<>();
        students.add(new Student("Джек", List.of(4, 5, 3)));
        students.add(new Student("Алиса", List.of(3, 4, 2)));
        students.add(new Student("Раф", List.of(5, 4, 3)));
        students.add(new Student("Мико", List.of(5, 4, 3)));

        System.out.println(students);

        ConvertStudentToString.convertStudentToStringList(students);
    }
}