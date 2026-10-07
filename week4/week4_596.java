import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class week4_596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array that can store 5 Student objects
        Student[] students = new Student[5];

        // Loop 1: create the objects
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // Loop 2: take input
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for Student " + (i + 1));
            System.out.print("ID: ");
            students[i].id = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Name: ");
            students[i].name = sc.nextLine();
            System.out.print("Marks: ");
            students[i].marks = sc.nextDouble();
            System.out.println();
        }

        // Display all students
        System.out.println("===== Student Information =====");
        for (Student s : students) {
            s.display();
        }

        // Find top scorer and calculate total
        Student top = students[0];
        double total = 0;
        for (Student s : students) {
            total += s.marks;
            if (s.marks > top.marks) {
                top = s;
            }
        }

        System.out.println();
        System.out.println("===== Top Student =====");
        top.display();

        System.out.println();
        System.out.println("Average Marks: " + (total / students.length));

        sc.close();
    }
}
