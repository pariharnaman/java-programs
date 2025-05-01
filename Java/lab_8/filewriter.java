import java.io.*;
import java.util.*;

public class filewriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        System.out.print("Enter roll number: ");
        String rollNumber = input.nextLine();
        System.out.print("Enter grade: ");
        String grade = input.nextLine();
        
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student information saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } finally {
            System.out.println("File operation attempted.");
        }
        
        input.close();
    }
}