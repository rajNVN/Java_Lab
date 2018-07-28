import java.io.*;
import java.util.Scanner;

class Marks {
    int no_of_subjects;
    int subject_mark[];
}
class Subject extends Marks {
    String subject_name[];
}

class Student extends Subject {
    String name;

    Student(int no_of_subjects) {
        this.no_of_subjects = no_of_subjects;
        subject_mark = new int[no_of_subjects];
        subject_name = new String[no_of_subjects];
    }

    double total() {
        double total_marks = 0;
        for (int i = 0; i < no_of_subjects; i++)
            total_marks += subject_mark[i];
        return total_marks;
    }
}
public class Multiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int no_of_students = scan.nextInt();
        Student std[] = new Student[no_of_students];
        for (int i = 0; i < no_of_students; i++) {
            System.out.print("Name : ");
            String name = scan.next();
            System.out.print("Number of Subjects : ");
            int no_of_subjects = scan.nextInt();
            std[i] = new Student(no_of_subjects);
            std[i].name = name;
            System.out.println("Enter subject name followed by marks : ");
            for (int j = 0; j < no_of_subjects; j++) {
                std[i].subject_name[j] = scan.next();
                std[i].subject_mark[j] = scan.nextInt();
            }
        }
        for (int i = 0; i < no_of_students; i++)
            System.out.println(std[i].name + " " + std[i].total());
    }
}