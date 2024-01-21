import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
    public double averageGrades(){
        double result = 0;
        for (double grade : grades){
            double[] averageGrades = new double[]{grade};
            for (int i = 0; i < averageGrades.length; i++){
                result += averageGrades[i];
            }
            result = result/grades.size();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
