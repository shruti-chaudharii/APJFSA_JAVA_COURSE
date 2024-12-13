//1.Create a Student class and create an array list to add 10 student objects and print them using a for each loop.

package java_programs;
import java.util.ArrayList;

//Define the Student class
class Student {
 String name;
 int age;

 // Constructor to initialize the student
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

public class StudentList {
 public static void main(String[] args) {
     // Create an ArrayList to store Student objects
     ArrayList<Student> students = new ArrayList<>();

     // Add 10 Student objects to the list
     students.add(new Student("Isha", 20));
     students.add(new Student("Poonam", 21));
     students.add(new Student("Sahil", 22));
     students.add(new Student("kalyani", 23));
     students.add(new Student("Vivek", 20));
     students.add(new Student("Kunal", 21));
     students.add(new Student("Vitrag", 22));
     students.add(new Student("Siddhi", 23));
     students.add(new Student("Anushka", 20));
     students.add(new Student("Aakansha", 21));

     // Print all student details using a for-each loop
     for (Student student : students) {
         System.out.println("Name: " + student.name + ", Age: " + student.age);
     }
 }
}

//output:-
//Name: Isha, Age: 20
//Name: Poonam, Age: 21
//Name: Sahil, Age: 22
//Name: kalyani, Age: 23
//Name: Vivek, Age: 20
//Name: Kunal, Age: 21
//Name: Vitrag, Age: 22
//Name: Siddhi, Age: 23
//Name: Anushka, Age: 20
//Name: Aakansha, Age: 21
