//2. Create a program in java to implement multilevel inheritance and hierarchical inheritance .
//Take classes like : Doctor , Surgeon and Nurse
//Create methods and show method overriding.

package java_programs;
// Base class Doctor
class Doctor {
    // Method in the Doctor class
    public void diagnose() {
        System.out.println("Doctor diagnoses the patient.");
    }
}

// Derived class Surgeon (Multilevel inheritance)
class Surgeon extends Doctor {
    // Method in the Surgeon class (overriding diagnose)
    public void diagnose() {
        System.out.println("Surgeon diagnoses the patient and recommends surgery.");
    }

    // Additional method in Surgeon class
    public void performSurgery() {
        System.out.println("Surgeon performs surgery.");
    }
}

// Derived class Nurse (Hierarchical inheritance)
class Nurse extends Doctor {
    // Method in the Nurse class (overriding diagnose)
    public void diagnose() {
        System.out.println("Nurse assists in diagnosis and provides care.");
    }

    // Additional method in Nurse class
    public void administerMedicine() {
        System.out.println("Nurse administers medication to the patient.");
    }
}

// Main class to demonstrate the inheritance and method overriding
public class MedicalSystem {
    public static void main(String[] args) {
        // Create objects of each class
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        // Calling methods from Doctor, Surgeon, and Nurse
        System.out.println("Doctor's actions:");
        doctor.diagnose();  // Doctor's diagnosis

        System.out.println("\nSurgeon's actions:");
        surgeon.diagnose(); // Surgeon overriding diagnose
        surgeon.performSurgery(); // Surgeon performing surgery

        System.out.println("\nNurse's actions:");
        nurse.diagnose(); // Nurse overriding diagnose
        nurse.administerMedicine(); // Nurse administering medicine
    }
}

//Output:-
//Doctor's actions:
//Doctor diagnoses the patient.
//
//Surgeon's actions:
//Surgeon diagnoses the patient and recommends surgery.
//Surgeon performs surgery.
//
//Nurse's actions:
//Nurse assists in diagnosis and provides care.
//Nurse administers medication to the patient.

