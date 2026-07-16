package HospitalManagementSystem;

public class Patient{
    
    private String patientName;
    private String patientID;
    private String entryDate;
    private Doctor doctor;
    
    public Patient(){
    }

    public Patient(String patientName, String patientID, String entryDate) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.entryDate = entryDate;
        this.doctor = null;
    }
    
    public Patient(Patient other){
        this.patientName = other.patientName;
        this.patientID = other.patientID;
        this.entryDate = other.entryDate;
        this.doctor = null;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientName = " + patientName + ", patientID = " + patientID +
           ", entryDate = " + entryDate + ", doctor = " + doctor + '}';
    }
    
    public boolean equals(Patient other){
        if(other == null) return false;
    return (this.patientID.equals(other.patientID));
    }
    
    
    
    
    
}
