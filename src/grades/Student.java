package grades;
import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer>grades;
    HashMap<String, String> students = new HashMap<>();

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum / grades.size();
    }




    public static void main(String[] args) {
        Student car = new Student("Carson");
        System.out.println(car.getName());
        car.addGrade(90);
        car.addGrade(80);
        car.addGrade(70);
        car.addGrade(100);
        System.out.println(car.getName() + " has an average of " +car.getGradeAverage()+ ".");

    }
}
