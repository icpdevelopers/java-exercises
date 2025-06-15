# Java Preparation Exercise

A hands-on journey to learn Java through 11 real-world command-line projects—each crafted to sharpen your OOP, logic, and problem-solving skills from the ground up.

---

## Our Motivation

We struggled with Java basics in college, and we wanted to create a practical learning experience that would help students of all levels improve their Java skills. We found that college assignments were not quite enough. Many of us have been struggling to find a proper project to get started with. We were taught to code but never quite on how to implement it. We wanted to create a project that would help students understand the concepts better. So we created this repo of projects to help students learn Java in a fun-interactive way.

---

## 💡 Why build this?

Java is a powerful, industry-grade language, but learning it through theory alone can be limiting. This repo helps you:

- 🚀 Level up by solving real-world problems.
- 🧠 Understand OOP concepts, collections, exceptions, and file handling.

---

## 🛠️ How to Get Started

To get started, we will need some software;

- **Java Development Kit (JDK)**: Download the latest version from the official Oracle website. [Download Here](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Java Integrated Development Environment (IDE)**: Choose your preferred IDE (Eclipse, IntelliJ, or Visual Studio Code with Java plugins).
    - **Eclipse**: Download from the official Eclipse website. [Download Here](https://www.eclipse.org/downloads/)
    - **IntelliJ IDEA**: Download from the JetBrains website. [Download Here](https://www.jetbrains.com/idea/download/)
    - **Visual Studio Code**: Download and install the Java extension. [Download Here](https://code.visualstudio.com)

---

## 🧪 Requirement

- Java 8+ (recommended: Java 17+)
- Basic understanding of object-oriented programming, variables, data types, and control structures.

---

## Getting Started

### Step 1: Create a folder name Java_Exercise in your desired location

```bash
mkdir Java_Exercise
```

### Step 2: Navigate to the folder

```bash
cd Java_Exercise
```

### Step 3: Make the folder for the project you want to build

```bash
mkdir <Project_name>
```

Replace `<Project_name>` with the name of the project you want to build. For example, if you want to build the Student Grade Calculator, you would replace `<Project_name>` with `Student_Grade`.

---

## 📚 Projects Overview

**Project Description**

1. [**Student Grade Calculator**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/Student_Grade) - Add students, calculate class average, assign grades.
2. [**Banking Account Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/BankAccount) - Manage bank accounts with deposit, withdrawal, and balance.
3. [**Library Book Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/LibraryManagement) - Track, borrow, and return books with search.
4. [**Expense Tracker**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ExpenseTracker) - Monitor daily expenses, categories, and monthly budget.
5. [**Contact Directory**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ContactDirectory) - Add, update, and search for contacts.
6. [**Quiz Game Engine**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/QuizGame) - Play timed, scored quizzes with difficulty levels.
7. [**Password Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/PasswordManager) - Generate, store, and check password strength.
8. [**Inventory Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/InventoryManagement) - Manage stock levels, restock alerts, and valuation.
9. [**Task Tracker**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/TaskManagement) - Prioritize and schedule tasks with completion tracking.
10. [**ATM Simulator**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ATM) - PIN-based ATM simulation with receipt generation.
11. [**Hangman Game**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/Hangman) - Classic word guessing game with difficulty settings.

---

## 🚀 How to Run Each Project

Each project is contained within its respective folder and comes with a detailed README on how to run and test it.

To build and run a project:

```bash
# compile (replace <Folder_name> with the project folder)
cd <Folder_name>
javac *.java

# run (replace MainClass with the CLI entry class)
java MainClass.java
```


---

## 📦 Detailed Project Highlights

1. [**Student Grade Calculator**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/Student_Grade)

- Add student name and grade (0-100)
- Display class average and corresponding grade letter
- Show top‐scoring student
- List all students with their scores & grade letters

---

2. [**Banking Account Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/BankAccount)

- Create, view, update, and delete accounts
- Deposit, withdraw, and check account balances
- Custom exception for insufficient funds

---

3. [**Library Management System**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/LibraryManagement)

- Add, remove, and check book availability
- Search by title, author, or ISBN
- Display formatted book catalog

---

4. [**Expense Tracker**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ExpenseTracker)

- Add, remove, and view monthly expenses
- Categorize expenses for detailed tracking
- Over-budget warnings and monthly views
- Uses java.time and Streams for totals

---

5. [**Contact Directory**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ContactDirectory)

- Add, update, and search for contacts
- Regex-based phone/email validation
- Duplicate prevention and edit functionality
- Modular CLI with validation exceptions  (Regex, Duplicate, Edit)

---
6. [**Quiz Game Engine**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/QuizGame) (QuizGame)

- Shuffled questions with scoring system
- Tracks accuracy and response time
- Select quiz category and difficulty level

---

7. [**Password Manager**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/PasswordManager)

- Strong password generator with optional symbols
- Base64 mock encryption (for learning)
- Password strength feedback and list management

---

8. [**Inventory System**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/InventoryManagement)

- Add/remove stock and auto-alert for reorder level
- Custom InsufficientStockException
- Calculates total inventory value

---

9. [**Task Management System**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/TaskManagement)

- Tasks with deadlines, priority, and completion status
- Completion percentage + overdue detection
- Uses LocalDate and custom exception handling

---

10. [**ATM Simulator**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/ATM)

- PIN-authenticated transactions with demo account
- Record transaction history and print receipts
- Handles invalid PIN and balance exceptions

---

11. [**Hangman Game**](https://github.com/darshan-regmi/JAVA-_-Exercise/tree/main/Hangman)

- Word guessing with difficulty levels and scoring
- ASCII drawing for hangman visuals
- Replay option and score tracking

---

## 🧭 Learning Focus

- ✅ Object-Oriented Programming
- ✅ Input Handling and Validation
- ✅ Exception Handling
- ✅ Collections (Array and ArrayList)
- ✅ CLI Design and Logic

---

## 📝 Dev Notes

- No external libraries—pure Java.
- Use Ctrl+C or Exit option in menus to stop apps.
- Feel free to fork, modify, and provide suggestions!

---

## 🧠 Final Words

Learning Java doesn’t have to be boring. These projects are designed to be fun, practical, and progressive—so you actually enjoy the learning process while building a portfolio.

> 🎉 Let’s code Java the way it was meant to be—clean, clever, and console-ready.

> If you wish to request any project or have any feedback, please don’t hesitate to reach out. [Mail us Here](mailto:dev@icp.edu.np)

---

## Disclaimer

Even though our aim is to make sure that you understand the concepts, we don't expect you to copy paste the code. We expect you to try to understand the project requirements and then write the code for it yourself. If you feel stuck or confused about the solution we have provided hints and pseudocode and ultimately the solution as well in the respective project directory. <br> <br>
<b>This repo is for learning purpose, we don't guarantee that it will help you master java but we ensure that it will help you understand programming.</b>
