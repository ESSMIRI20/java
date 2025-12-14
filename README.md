# Java TPs & TDs

This repository contains practical work (TPs - Travaux Pratiques) and directed work (TDs - Travaux Dirigés) for Java programming exercises.

## 📚 Repository Structure

```
java_tps/
├── Tp_3/          # Introduction to Classes and Objects
├── Tp_4/          # Banking System - Inheritance & Polymorphism
├── Tp_5/          # Employee Management - Static Members
├── TP_6/          # Advanced Java Exercises
├── Td4/           # Object-Oriented Programming Exercises
└── Td_6/          # Additional Java Exercises
```

## 📝 Content Overview

### TP 3 - Classes and Objects
**Topic:** Basic Object-Oriented Programming
- **Point.java** - Implementation of a 2D point class with translation methods
- **Test.java** - Test cases for Point class

**Key Concepts:**
- Constructors (default and parameterized)
- Instance variables
- Methods (translater, affiche)
- Basic object manipulation

---

### TP 4 - Banking System
**Topic:** Inheritance and Account Management
- **Compte.java** - Base bank account class
- **CompteCourant.java** - Current account implementation
- **CompteEpargne.java** - Savings account implementation
- **Clien.java** - Client class
- **Test.java** - Test suite for banking operations

**Key Concepts:**
- Inheritance
- Encapsulation
- Association between classes
- Deposit and withdrawal operations
- Account types differentiation

---

### TP 5 - Employee Management
**Topic:** Static Members and Employee Hierarchy
- **Employe.java** - Base employee class with salary calculation
- **Responsable.java** - Manager class extending Employee
- **Main.java** - Application entry point

**Key Concepts:**
- Static variables (valeur_indice)
- Inheritance
- Salary calculation based on index
- Class hierarchies

---

### TP 6 - Advanced Exercises
**Topic:** Various Java Programming Challenges
- **Ex1.java** - Exercise 1
- **Ex2.java** - Exercise 2
- **Ex3.java** - Exercise 3

**Note:** Contains multiple implementations and variations of exercises.

---

### TD 4 - Object-Oriented Programming Exercises
**Structure:**
```
Td4/
├── ex1/            # Exercise 1 - Test cases
├── ex2/            # Exercise 2 - Java implementation
└── ex3/            # Exercise 3 - Vehicle hierarchy
    ├── main/       # Main application
    ├── vehicule/   # Base vehicle class
    ├── velo/       # Bicycle implementation
    └── voiture/    # Car implementation
```

**Key Concepts:**
- Package organization
- Vehicle class hierarchy
- Inheritance and polymorphism

---

### TD 6 - Additional Exercises
**Topic:** Java Programming Practice
- **Ex1.java through Ex6.java** - Six progressive exercises

**Key Concepts:**
- Progressive difficulty
- Comprehensive Java practice
- Multiple programming paradigms

---

## 🚀 How to Compile and Run

### Compile a single file:
```bash
javac <FileName>.java
```

### Run the compiled class:
```bash
java <ClassName>
```

### Example (TP 3):
```bash
cd Tp_3
javac Point.java
java Point
```

### Example (TP 4 with dependencies):
```bash
cd Tp_4
javac Clien.java Compte.java CompteCourant.java CompteEpargne.java Test.java
java Test
```

### Example (TD 4 - Exercise 3 with packages):
```bash
cd Td4/ex3
javac vehicule/*.java velo/*.java voiture/*.java main/*.java
java main.Main
```

---

## 📖 Topics Covered

- ✅ **Object-Oriented Programming (OOP)**
  - Classes and Objects
  - Constructors
  - Encapsulation
  
- ✅ **Inheritance**
  - Class hierarchies
  - Method overriding
  - Super class references
  
- ✅ **Polymorphism**
  - Dynamic binding
  - Method overriding
  
- ✅ **Static Members**
  - Static variables
  - Static methods
  
- ✅ **Package Management**
  - Package organization
  - Import statements
  
- ✅ **Real-World Applications**
  - Banking systems
  - Employee management
  - Vehicle hierarchies
  - Geometric calculations

---

## 🛠️ Requirements

- **Java Development Kit (JDK)** 8 or higher
- Text editor or IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)
- Terminal/Command Prompt for compilation and execution

---

## 📌 Notes

- All files use CRLF line endings (Windows format)
- Code includes French comments and variable names
- Each TP/TD folder is self-contained
- Some exercises have multiple implementations for comparison

---

## 👨‍💻 Author

**Ossama**

---

## 📅 Academic Period

These exercises are part of a Java programming course covering fundamental to intermediate concepts in object-oriented programming.

---

## 🤝 Contributing

These are educational exercises. Feel free to:
- Add improvements
- Fix bugs
- Add documentation
- Create additional test cases

---

## 📄 License

Educational purposes only.
