# 🚗 Vehicle Rental Management System (CLI – Java)

## 📘 Module Information
- **Module Name:** Object Oriented Programming  
- **Module Code:** CCS1303  
- **Assignment:** OOP Assignment 2  
- **Submission Deadline:** 14 February 2026  

---

## 📌 Project Overview

The **Vehicle Rental Management System** is a **menu-driven command-line application** developed using **Java** to demonstrate core **Object-Oriented Programming (OOP)** principles.

The system enables a transport service provider to manage multiple vehicle types, handle rental operations, and track total rental income efficiently via a **Command Line Interface (CLI)**.

This project focuses on:
- Abstraction  
- Inheritance  
- Polymorphism  
- Encapsulation  
- Exception handling  

---

## 🎯 Learning Outcomes

By completing this project, the following objectives are achieved:

- Design and implement class hierarchies using inheritance  
- Apply runtime polymorphism through method overriding  
- Use abstract classes effectively  
- Develop a menu-driven CLI application  
- Implement input validation and exception handling  
- Manage collections using ArrayList  

---

## 🛠️ Technologies Used

- **Programming Language:** Java  
- **JDK:** Java Development Kit (JDK 8 or higher)  
- **IDE:** IntelliJ IDEA (recommended)  
- **Operating System:** Windows / macOS / Linux  

---

## 🏗️ System Design

### 🔹 Class Structure

#### 1. Vehicle (Abstract Class)

**Attributes:**
- `vehicleId : String`
- `brand : String`
- `model : String`
- `baseRatePerDay : double`
- `isAvailable : boolean`

**Methods:**
- Parameterized constructor  
- Getter and setter methods  
- `displayDetails()`  
- `rentVehicle()`  
- `returnVehicle()`  
- `calculateRentalCost(int days)` *(abstract)*  

---

#### 2. Subclasses (Inheritance & Polymorphism)

##### 🚘 Car
- **Additional Attribute:** `numberOfSeats : int`
- **Rental Cost Formula:**  
  `baseRatePerDay * days + (numberOfSeats * 200 * days)`

##### 🏍️ Bike
- **Additional Attribute:** `engineCapacityCC : int`
- **Rental Cost Formula:**  
  `baseRatePerDay * days + (engineCapacityCC * 0.5 * days)`

##### 🚐 Van
- **Additional Attribute:** `cargoCapacityKg : double`
- **Rental Cost Formula:**  
  `baseRatePerDay * days + (cargoCapacityKg * 0.2 * days)`

---

## 💻 Application Features

### 📋 Menu Options
1. Add a Vehicle  
2. View All Vehicles  
3. Rent a Vehicle  
4. Return a Vehicle  
5. Search Vehicle by ID  
6. View Total Rental Income  
7. Exit  

---

## ⚙️ Functional Requirements

- Vehicles are stored using an `ArrayList`  
- Vehicle IDs must be unique  
- A vehicle cannot be rented if it is already rented  
- Rental days must be greater than zero  
- Total rental income is tracked and displayed  
- Polymorphism is demonstrated using `Vehicle` references  

---

## 🔐 Validation & Exception Handling

- Invalid numeric inputs handled using `try-catch` blocks  
- Invalid menu selections are prevented  
- Meaningful error messages are displayed to users  
- Application remains stable during incorrect inputs  

---

## 🚀 Challenging Component (Mandatory)

**Implemented Feature:** File Handling  

- Vehicle data and total rental income are saved to a text file  
- Data is automatically loaded when the application starts  

*(This component demonstrates persistent storage and advanced program flow control.)*

---

## ▶️ How to Compile and Run

### Using Command Line

```bash
javac *.java
java RentalApp
```

---

## 🧪 Sample Menu Output

===== Vehicle Rental Management System =====
1. Add a Vehicle
2. View All Vehicles
3. Rent a Vehicle
4. Return a Vehicle
5. Search Vehicle by ID
6. View Total Rental Income
7. Exit
Enter your choice:

---

## 📄 Assumptions

1. Vehicle IDs are entered manually and must be unique
2. Rental data persistence applies only if file handling is enabled
3. This is a CLI-based application (no GUI included)

---

## 📈 Non-Functional Requirements

1. Program compiles and runs without errors
2. Follows standard Java naming conventions
3. Code is properly indented and commented
4. No graphical user interface is used

---

## 👥 Team Contribution

1. B. Y. Wickramaarachchi (Lead)
2. A. S. P. Gunarathne
3. T. M. L. Lakshan Bandara
4. S. V. D. C. Samarasinghe
5. A. B. B. W. Wimaladasa
6. K. N. S. C. Chaya
   
All team members contributed fairly to the design, implementation, testing, and documentation of the system.
