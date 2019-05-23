package grades;
import java.util.*;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Scanner sc  = new Scanner(System.in);

        Student josh = new Student("Josh");
        Student ricky = new Student("Ricky");
        Student sophie = new Student("Sophie");
        Student carson = new Student("Carson");

        josh.addGrade(90);
        josh.addGrade(100);
        josh.addGrade(80);

        ricky.addGrade(120);
        ricky.addGrade(130);
        ricky.addGrade(180);

        sophie.addGrade(0);
        sophie.addGrade(10);
        sophie.addGrade(5);

        carson.addGrade(20);
        carson.addGrade(14);
        carson.addGrade(40);

        students.put("Josh", "Josh-rms");
        students.put("Ricky", "ricky-davis");
        students.put("Sophie", "sophiakurihara");
        students.put("Carson Belew", "CarsonBelew");



        System.out.println("Welcome\n");
        System.out.println("Here are the github usernames of our students:\n");
        for (String key : students.keySet()){
            System.out.print("|" + students.get(key) + "|" + " ");
        }

    }
}
