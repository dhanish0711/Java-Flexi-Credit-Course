# ☕ Java Flexi Credit Course

> **Author:** [Dhanish Ladwani](https://github.com/dhanish0711)  

A comprehensive collection of Java programs demonstrating core **Object-Oriented Programming (OOP)** concepts. Each module focuses on a specific Java concept with clean, well-documented examples — perfect for learning, revision, and academic coursework.

---

## 📚 Table of Contents

| # | Module | Key Concepts | Files |
|---|--------|-------------|-------|
| 1 | [First Java Project](./First%20Java%20Project/) | Hello World, Arithmetic Ops, Variables, Scanner, Classes & Objects | 8 |
| 2 | [Constructor](./Constructor/) | Default & Parameterized Constructors, `this` keyword | 4 |
| 3 | [Encapsulation](./Encapsulation/) | Private fields, Getters & Setters, Data Hiding | 4 |
| 4 | [Inheritance](./Inheritance/) | Single Inheritance, `extends` keyword, Method Reuse | 3 |
| 5 | [Example Abstract Class](./Example%20Abstract%20Class/) | Abstract Classes, Abstract Methods, Method Overriding | 4 |
| 6 | [Interfaces](./Interfaces/) | Multiple Interfaces, `implements` keyword, Polymorphism | 4 |
| 7 | [Exception Handling](./Exception%20Handling/) | `try-catch`, ArithmeticException, Exception Object | 2 |
| 8 | [Wrapper Classes](./Wrapper%20Classes/) | Autoboxing, Unboxing, Primitive ↔ Object Conversion | 1 |
| 9 | [User Input Projects](./User%20Input%20Projects/) | `Scanner` class, Reading Strings, Integers & Doubles | 1 |
| 10 | [Student Management System](./Student%20Management%20System/) | Multi-level Inheritance, Polymorphism, Menu-driven App | 4 |

---

## 🏗️ Project Structure

```
Java-Flexi-Credit-Course/
│
├── First Java Project/          # Basics — Hello World, Arithmetic, Classes
│   ├── HelloWorld.java
│   ├── ArithOperations.java
│   ├── Car.java / CarMain.java
│   ├── Student.java / StudentMain.java
│   ├── UserInput.java
│   └── UserScanningvalues.java
│
├── Constructor/                 # Default & Parameterized Constructors
│   ├── A.java / AMain.java
│   └── Student.java / StudentMain.java
│
├── Encapsulation/               # Data Hiding with Getters & Setters
│   ├── Employee.java / EmployeeMain.java
│   └── Student.java / StudentMain.java
│
├── Inheritance/                 # Single Inheritance
│   ├── A.java
│   ├── B.java
│   └── SingleInheritance.java
│
├── Example Abstract Class/      # Abstract Classes & Methods
│   ├── Shape.java
│   ├── Circle.java
│   ├── Rectangle.java
│   └── AbstractMain.java
│
├── Interfaces/                  # Multiple Interface Implementation
│   ├── Camera.java
│   ├── Radio.java
│   ├── Samsung.java
│   └── SamsungMain.java
│
├── Exception Handling/          # Try-Catch Blocks
│   ├── ExceptionExample1.java
│   └── ExceptionExample2.java
│
├── Wrapper Classes/             # Autoboxing & Unboxing
│   └── WrapperClassExample.java
│
├── User Input Projects/         # Scanner-based Input
│   └── UserInputes.java
│
├── Student Management System/   # Inheritance-based Management App
│   ├── Person.java
│   ├── Student.java
│   ├── GraduateStudent.java
│   └── StudentManagementSystem.java
│
├── .gitignore
├── LICENSE
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 8** or higher — [Download here](https://www.oracle.com/java/technologies/downloads/)
- Any terminal / command prompt

### How to Compile & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/dhanish0711/Java-Flexi-Credit-Course.git
   cd Java-Flexi-Credit-Course
   ```

2. **Navigate to any module folder:**
   ```bash
   cd "First Java Project"
   ```

3. **Compile the Java file(s):**
   ```bash
   javac HelloWorld.java
   ```

4. **Run:**
   ```bash
   java HelloWorld
   ```

> 💡 **Tip:** For modules with multiple files (e.g., Constructor, Interfaces), compile all files at once:
> ```bash
> javac *.java
> ```

---

## 📖 Module Details

### 1. First Java Project
Your first steps in Java — printing output, basic arithmetic operations, creating simple classes (`Car`, `Student`), and reading user input with `Scanner`.

### 2. Constructor
Demonstrates how **constructors** initialize objects automatically. Covers both default constructors (no arguments) and parameterized constructors with the `this` keyword.

### 3. Encapsulation
Shows how to protect data using **private** access modifiers and expose it through **getter/setter** methods — a core principle of OOP.

### 4. Inheritance
Illustrates **single inheritance** where class `B` extends class `A`, inheriting its methods and adding new functionality.

### 5. Example Abstract Class
An abstract `Shape` class defines a contract (`area()` method) that concrete subclasses `Circle` and `Rectangle` must implement.

### 6. Interfaces
Demonstrates **multiple interface implementation** — a `Samsung` class implements both `Camera` and `Radio` interfaces, showcasing Java's approach to multiple inheritance.

### 7. Exception Handling
Covers **try-catch** blocks to gracefully handle runtime errors like `ArithmeticException` (division by zero).

### 8. Wrapper Classes
Shows **autoboxing** (primitive → object) and **unboxing** (object → primitive) with `Byte`, `Integer`, and `Double` wrapper classes.

### 9. User Input Projects
Reading various data types (`String`, `int`, `double`) from the user using the `Scanner` class.

### 10. Student Management System
A complete **menu-driven application** demonstrating multi-level inheritance (`Person → Student → GraduateStudent`) and runtime polymorphism.

---

## 🧠 OOP Concepts Covered

| Concept | Modules |
|---------|---------|
| Classes & Objects | First Java Project, Constructor |
| Constructors | Constructor |
| Encapsulation | Encapsulation |
| Inheritance | Inheritance, Student Management System |
| Abstraction | Example Abstract Class |
| Interfaces | Interfaces |
| Polymorphism | Interfaces, Student Management System |
| Exception Handling | Exception Handling |
| Wrapper Classes | Wrapper Classes |

---

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-concept`)
3. Add your Java programs
4. Commit your changes (`git commit -m "Add: new concept example"`)
5. Push to the branch (`git push origin feature/new-concept`)
6. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](./LICENSE) file for details.

---

## 👤 Author

**Dhanish Ladwani**
- GitHub: [@dhanish0711](https://github.com/dhanish0711)

---

## ⭐ Show Your Support

If you found this repository helpful, please give it a ⭐ — it motivates and helps others discover it!
