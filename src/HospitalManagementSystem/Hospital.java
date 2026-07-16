//Driver class for the system
package HospitalManagementSystem;


public class Hospital {
    
    public static void main(String[] args) {
        
        Patient p1 = new Patient("John Candy", "P001", "18 08 2023");
        Doctor d1 = new Doctor("Dr. Mike", "D001", "Cardiology");
        
        System.out.println("After Creation: ");
        System.out.println(p1);
        System.out.println(d1);
        
        d1.assignPatient(p1);
        
        System.out.println("After assigning patient: ");
        System.out.println(p1);
        System.out.println(d1);
    }  
}
