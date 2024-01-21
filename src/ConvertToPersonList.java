import java.util.ArrayList;
import java.util.List;

public class ConvertToPersonList {
    public static List<Person> convertToPersonList(List<String> stringList){
        List<Person> personList = new ArrayList<>();

        for (String str : stringList){
            String[] newList = str.split(",");
            if (newList.length == 2){
                String name = newList[0];
                int age = Integer.parseInt(newList[1]);
                personList.add(new Person(name,age));
            }
        }
        return personList;
    }
}
