# 🎓 JDBC Student Management System (Mini-Project)

This is a complete, beginner-friendly console application demonstrating how to build a Java backend application using **JDBC** and the **DAO (Data Access Object) Design Pattern**.

## 🏗️ Architecture

The project is structured into distinct layers to separate concerns:
1. **Model (`Student.java`)**: A Plain Old Java Object (POJO) representing a student record.
2. **Interface (`StudentDAO.java`)**: Defines the contract (CRUD operations) for interacting with student data.
3. **Implementation (`StudentDAOImpl.java`)**: Contains the actual JDBC code (`PreparedStatement`, `ResultSet`, `try-with-resources`) to talk to the database.
4. **Utility (`DBConnection.java`)**: Centralizes database credentials and connection logic.
5. **UI (`Main.java`)**: A simple command-line interface using `Scanner`.

*Note: This architecture is a miniature version of what you will use in enterprise frameworks like Spring Boot (Entity -> Repository -> Service -> Controller).*

## 🗄️ Database Setup

Before running the application, ensure you have PostgreSQL installed and execute this script:

```sql
CREATE DATABASE java_jdbc;
\c java_jdbc; -- connect to DB

CREATE TABLE student (
    id SERIAL PRIMARY KEY, -- or INT PRIMARY KEY AUTO_INCREMENT for MySQL
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);
```

## 🚀 How to Run

1. Open `DBConnection.java` and update the `URL`, `USER`, and `PASS` to match your local database settings.
2. Compile all Java files in this folder.
3. Run the `Main.java` class.

## 💻 Example Output

```text
=========================================
   STUDENT MANAGEMENT SYSTEM (JDBC DAO)  
=========================================

1. Add Student
2. View All Students
3. Find Student by ID
4. Update Student
5. Delete Student
6. Search by Name
7. Exit
Enter choice: 1
Enter name: Mohammad Asfin
Enter age: 22
Enter course: Java Backend
Student added successfully!
```
