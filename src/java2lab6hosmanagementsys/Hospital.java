/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2lab6hosmanagementsys;

/**
 *
 * @author Canberk
 */
public class Hospital {
    
    public static void main(String[] args) {
        
        Patient p1 = new Patient("Berra Dogru", "P001", "18 08 2023");
        Doctor d1 = new Doctor("Dr. Canberk", "D001", "Cardiology");
        
        System.out.println("After Creation: ");
        System.out.println(p1);
        System.out.println(d1);
        
        d1.assignPatient(p1);
        
        System.out.println("After assigning patient: ");
        System.out.println(p1);
        System.out.println(d1);
    }  
}
