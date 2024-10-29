//1.Create the bean class using Employee details(EmpId,EmpName,EmpAge,Empsalary)

package java_programs;

//Employee class implementing Serializable interface for object serialization
class Employee implements java.io.Serializable {
 
 // Private properties for encapsulation
 private int EmpId;  
 private String EmpName;
 private int EmpAge;
 private int Empsalary;
 
 // Default constructor
 public Employee() {}

 // Getter and Setter for EmpId
 public int getEmpId() {
     return EmpId;
 }

 public void setEmpId(int empId) {
     EmpId = empId;
 }

 // Getter and Setter for EmpName
 public String getEmpName() {
     return EmpName;
 }

 public void setEmpName(String empName) {
     EmpName = empName;
 }

 // Getter and Setter for EmpAge
 public int getEmpAge() {
     return EmpAge;
 }

 public void setEmpAge(int empAge) {
     EmpAge = empAge;
 }

 // Getter and Setter for Empsalary
 public int getEmpsalary() {
     return Empsalary;
 }

 public void setEmpsalary(int empsalary) {
     Empsalary = empsalary;
 }
}

//JavaBeanExample class with main method to test the Employee bean
public class JavaBeanExample {
 public static void main(String args[]) {  
     
     // Creating an instance of Employee
     Employee obj = new Employee();
     
     // Setting and printing Employee ID
     obj.setEmpId(111);
     System.out.println("Employee ID: " + obj.getEmpId());
     
     // Setting and printing Employee Name
     obj.setEmpName("Shruti");
     System.out.println("Employee Name: " + obj.getEmpName());
     
     // Setting and printing Employee Age
     obj.setEmpAge(22);
     System.out.println("Employee Age: " + obj.getEmpAge());
     
     // Setting and printing Employee Salary
     obj.setEmpsalary(300000);
     System.out.println("Employee Salary: " + obj.getEmpsalary());
 }
}

//output:-
//Employee ID: 111
//Employee Name: Shruti
//Employee Age: 22
//Employee Salary: 300000
