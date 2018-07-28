import java.io.*;
import java.util.Scanner;

class Subjects {
    String subject_name[];
    int no_of_subjects;
    double subject_marks[];
}
class Students extends Subjects {
    String name;

    Students(int no_of_subjects) {
        this.no_of_subjects = no_of_subjects;
        subject_marks = new double[no_of_subjects];
        subject_name = new String[no_of_subjects];
    }

    double total() {
        double total_marks = 0;
        for (int i = 0; i < no_of_subjects; i++)
            total_marks += subject_marks[i];
        return total_marks;
    }
}
public class Single {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int no_of_students = Integer.parseInt(scan.nextLine());
        Students std[] = new Students[no_of_students];
        for (int i = 0; i < no_of_students; i++) {
            System.out.print("Name : ");
            String name = scan.next();
            System.out.print("Number of Subjects : ");
            int a = scan.nextInt();
            std[i] = new Students(a);
            std[i].name = name;
            System.out.println("Enter subject name followed by marks : ");
            for (int j = 0; j < a; j++) {
                std[i].subject_name[j] = scan.next();
                std[i].subject_marks[j] = scan.nextInt();
            }
        }
        for (int i = 0; i < no_of_students; i++)
            System.out.println(std[i].name + " " + std[i].total());
    }
}