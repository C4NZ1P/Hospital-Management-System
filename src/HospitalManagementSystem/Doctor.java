package HospitalManagementSystem;

public class Doctor {
    
    private String doctorName;
    private String doctorID;
    private String specialization;
    private String[] patients = new String[4];
    private int noOfPatients = 0;
    private boolean isAvailable = true;
    
    public Doctor(){
        
    }

    public Doctor(String name, String id, String spec) {
        this.doctorName = name;
        this.doctorID = id;
        this.specialization = spec;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getNoOfPatients() {
        return noOfPatients;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
    public void assignPatient(Patient p){
        if(p == null){
            System.out.println("Invalid patient record.");
        }
        if(noOfPatients < 4){
            patients[noOfPatients] = p.getPatientID();
            noOfPatients++;
            p.setDoctor(this);
            if(noOfPatients == 4) isAvailable = false;
        } else {
            System.out.println("Doctor " + doctorName +" is full!");
        } 
    }
    
    @Override
    public String toString() {
        return "Doctor{" + "doctorName = " + doctorName + ", doctorID = " + doctorID + '}';
    }
    
    
    public boolean equals(Doctor other){
        if(other == null) return false;
        return(this.doctorID.equals(other.doctorID) && this.doctorName.equals(other.doctorName)); 
    }
}

