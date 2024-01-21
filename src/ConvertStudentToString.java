import java.util.ArrayList;
import java.util.List;

public class ConvertStudentToString {
    public static void convertStudentToStringList(List<Student> students){
        List<String> stringList = new ArrayList<>();

        for (Student student : students){
            String name = student.getName();
            String addStudent = name+ "|" + student.averageGrades();
            stringList.add(addStudent);
        }
        System.out.println(stringList);
    }
}
