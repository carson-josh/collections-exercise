package grades;
import java.util.*;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
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

        students.put("Josh-rms", josh);
        students.put("ricky-davis", ricky);
        students.put("sophiakurihara", sophie);
        students.put("CarsonBelew", carson);



        System.out.println("Welcome\n");
        System.out.println("Here are the github usernames of our students:\n");
        Scanner scanner;

        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        do {
            scanner = new Scanner(System.in);
            System.out.println();

            System.out.println("What student would you like to see more information on?\n");
            String userInput = scanner.next();

            if (students.containsKey(userInput)) {
                Student pickedStudent = students.get(userInput);

                System.out.println("Name: " + pickedStudent.getName() + " - Username: "
                        + userInput  + "\nCurrent Average: " + pickedStudent.getGradeAverage() + "\n");

                System.out.println("Would you like to see another student?");

            } else {
                System.out.println("sorry, that's not a valid username. \n" +
                        "Would you like to try again? yes | no");
            }

        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Bye Bye");


    }

}
