# 🏥 Hospital Management System

A Java-based management system developed to simulate and automate the daily operations of a hospital, including doctor availability, patient registration, and appointment/doctor assignments. 

This project demonstrates core Object-Oriented Programming (OOP) concepts such as encapsulation, association (bi-directional relationship management), and defensive programming.

---

## 🚀 Features
* **Bi-directional Link Management:** Assigning a patient to a doctor automatically updates both the doctor's patient list and the patient's assigned doctor field securely.
* **Doctor Availability Tracking:** Doctors can handle up to 4 patients. Once the limit is reached, their availability status (`isAvailable`) automatically switches to `false`.
* **Defensive Programming:** Null pointer checks and safe object comparison using overridden `equals` methods ensure runtime stability.
* **Clean OOP Structure:** Separated model classes (`Doctor`, `Patient`) and a driver controller class (`Hospital`).

---

## 🛠️ Technologies Used
* **Language:** Java (JDK 17 or higher)
* **IDE:** Apache NetBeans
* **Version Control:** Git & GitHub

---

## 📂 Project Structure & Classes

The project is organized under the `HospitalManagementSystem` package:

* **`Hospital.java` (Driver Class):** Contains the `main` method. It initializes dummy doctor/patient data, triggers the assignment logic, and prints the states to the console to test the program.
* **`Doctor.java`:** Manages doctor details (name, ID, specialization, availability) and holds a list of assigned patients.
* **`Patient.java`:** Manages patient registration details (name, ID, admission date) and holds a reference to their assigned doctor.

---

## 💻 Installation & Running

To run this project on your local machine, follow these simple steps:

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/C4NZ1P/Hospital-Management-System.git](https://github.com/C4NZ1P/Hospital-Management-System.git)
    ```
2.  **Open with NetBeans:**
    * Open Apache NetBeans.
    * Go to `File` > `Open Project` and select the cloned directory.
3.  **Run the Application:**
    * Locate `Hospital.java` in the projects sidebar.
    * Right-click on it and select **Run File** (or press `Shift + F6`).

---

## ✉️ Contact
* **Developer:** [ Şakircan Büyükşekerci ]
* **LinkedIn:** [ www.linkedin.com/in/şakircan-büyükşekerci-825a4a421 ]
