package io.everyonecodes.java.evaluation.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        List<String> students = new ArrayList<>(List.of());
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("What is the students name?");
            students.add(scanner.nextLine());
        }
        List<Double> studentGrades = new ArrayList<>(List.of());
        for (String student : students) {
            System.out.println("What is " + student + "s grade?");
            studentGrades.add(scanner.nextDouble());
        }
        System.out.println("What is the minimum grade to be an honor student?");

        double minimumHonorStudentGrade = scanner.nextDouble();

        double bestGrade = studentGrades.get(0);
        double worstGrade = studentGrades.get(0);

        int indexOfBestGrade = 0;
        int indexOfWorstGrade = 0;

        double sumOfAllGrades = 0;
        double sumOfAllHonorGrades = 0;
        int amountOfHonorStudents = 0;

        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) >= minimumHonorStudentGrade) {
                System.out.println(students.get(i) + " is a honor student with a grade of: " + studentGrades.get(i));
                sumOfAllHonorGrades += studentGrades.get(i);
                amountOfHonorStudents++;
            }
            if(studentGrades.get(i) < worstGrade) {
                worstGrade = studentGrades.get(i);
                indexOfWorstGrade = i;
            }
            if (studentGrades.get(i) > bestGrade) {
                bestGrade = studentGrades.get(i);
                indexOfBestGrade = i;
            }
            sumOfAllGrades += studentGrades.get(i);
        }

        System.out.println("The average grade of all students is: " + sumOfAllGrades / students.size());
        if (amountOfHonorStudents != 0){
            System.out.println("The average grade of all honor students is: " + sumOfAllHonorGrades / amountOfHonorStudents);
        }
        System.out.println("The student with the highest grade (" + bestGrade + ") is: " + students.get(indexOfBestGrade));
        System.out.println("The student with the lowest grade (" + worstGrade + ") is: " + students.get(indexOfWorstGrade));

    }
}
