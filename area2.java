import java.util.Scanner;

public class area2 {
    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Register a new student in the system.");
        System.out.println("2. Display a student's complete record.");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        Student[] students = new Student[50];
        int count = 0, choice = 0;
        Scanner input = new Scanner(System.in);

        while (choice != 3) {
            menu();
            System.out.print("Enter Your choice: ");
            choice = input.nextInt();
            input.nextLine(); // Clear the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID:");
                    String stdId = input.nextLine();
                    System.out.println("Enter student Name:");
                    String stdName = input.nextLine();
                    System.out.println("Enter student section:");
                    String section = input.nextLine();
                    System.out.println("Enter student grade:");
                    int grade = input.nextInt();
                    input.nextLine(); // Clear newline

                    students[count] = new Student(stdId, stdName, grade, section);
                    count++;
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("Enter student ID you want to show:");
                    String id = input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getID().equals(id)) {
                            System.out.println(students[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student with that ID found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from the menu.");
            }
        }

        input.close();
    }
}
