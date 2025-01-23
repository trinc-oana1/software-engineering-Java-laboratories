package isp.lab6.exercise1;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        StudentGradeManagementSystem stud = new StudentGradeManagementSystem();
        while (!exit) {
            System.out.println("\n*** Student Grade Management System ***");
            System.out.println("1. Add a student to the list");
            System.out.println("2. Add student grades");
            System.out.println("3. Remove a student from the list");
            System.out.println("4. Update a student's information");
            System.out.println("5. Calculate the average grade of a student");
            System.out.println("6. Display the list of students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the student's ID: ");
                    String id = scanner.nextLine();

                    HashMap<String, Integer> grades = new HashMap<>();

                    boolean addMoreGrades = true;

                    while (addMoreGrades) {
                        System.out.print("Enter subject name (or type 'done' to finish adding grades): ");
                        String subject = scanner.nextLine();

                        if (subject.equalsIgnoreCase("done")) {
                            addMoreGrades = false;
                        } else {
                            System.out.print("Enter grade for " + subject + ": ");
                            int grade = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            grades.put(subject, grade);
                        }
                    }

                    stud.addStudent(name, id, grades);
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.print("Enter the subject: ");
                    String subjectToAdd = scanner.nextLine();
                    System.out.print("Enter the grade: ");
                    double gradeToAdd = scanner.nextDouble();
                    stud.addGrade(subjectToAdd, gradeToAdd);
                }
                case 3 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the student's ID: ");
                    String idToRemove = scanner.nextLine();

                    stud.removeStudent(idToRemove);
                }
                case 4 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the student's ID: ");
                    String idToUpdate = scanner.nextLine();

                    System.out.print("Enter the student's new name (or press enter to keep the same): ");

                    scanner = new Scanner(System.in);
                    String updatedName = scanner.nextLine();


                    HashMap<String, Integer> updatedGrades = new HashMap<>();

                    boolean updateMoreGrades = true;

                    while (updateMoreGrades) {
                        System.out.print("Enter subject name to update grade (or type 'done' to finish updating grades): ");
                        String subject = scanner.nextLine();

                        if (subject.equalsIgnoreCase("done")) {
                            updateMoreGrades = false;
                        } else {
                            System.out.print("Enter new grade for " + subject + ": ");
                            int grade = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            updatedGrades.put(subject, grade);
                        }
                    }
                    stud.updateStudent(idToUpdate, updatedName, updatedGrades);
                }
                case 5 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the student's ID: ");
                    String targetId = scanner.nextLine();
                    stud.calculateAverageGrade(targetId);
                }
                case 6 -> stud.displayStudents();

                case 7 -> {
                    exit = true;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

}
