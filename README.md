<div align="center">

# ☕ Java Full Stack — Complete Study Notes

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/JDK-21-orange?style=for-the-badge&logo=oracle&logoColor=white" alt="JDK">
<img src="https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge" alt="OOP">
<img src="https://img.shields.io/badge/JDBC-Database-green?style=for-the-badge" alt="JDBC">
<img src="https://img.shields.io/badge/Servlets-JSP-red?style=for-the-badge" alt="Servlets">
<img src="https://img.shields.io/badge/Maven-Gradle-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">

**Author: Mohammad Asfin &nbsp;|&nbsp; Stack: Java Full Stack &nbsp;|&nbsp; Level: Beginner to Advanced**

[🚀 Get Started](#-java-introduction--installation) · [📚 OOP Concepts](#-oop-object-oriented-programming) · [🔗 JDBC](#-jdbc-java-database-connectivity) · [🌐 REST API](#-rest-api--web-services) · [📦 Maven & Gradle](#-maven) · [🧵 Multithreading](#-multithreading)

</div>

---

## 📋 Table of Contents

<details>
<summary>Click to expand full Table of Contents</summary>

- [☕ Java Introduction & Features](#-java-introduction--features)
- [⬇️ Java Installation](#️-java-installation)
- [⚙️ Java Fundamentals](#️-java-fundamentals)
  - [JDK · JRE · JVM Architecture](#-jdk--jre--jvm-architecture)
  - [How Java Works (Compile → Run)](#-how-java-works)
  - [JShell — Java REPL](#-jshell--java-repl)
  - [Variables, Identifiers & Name Conventions](#-variables-identifiers--name-conventions)
  - [Primitive Data Types](#-primitive-data-types)
  - [Literals & Type Conversion](#-literals--type-conversion)
  - [Wrapper Classes](#-wrapper-classes)
- [🖨️ Input & Output Statements](#️-input--output-statements)
  - [Scanner Class](#-scanner-class)
  - [Console Class](#-console-class)
  - [Command Line Arguments](#-command-line-arguments)
  - [DataInputStream](#-datainputstream)
- [🔢 Operators](#-operators)
- [🔀 Control Statements](#-control-statements)
- [📦 Arrays](#-arrays)
- [🔡 Strings](#-strings)
  - [StringBuffer & StringBuilder](#-stringbuffer--stringbuilder)
- [🏛️ OOP — Object Oriented Programming](#-oop-object-oriented-programming)
  - [OOP vs POP](#-oop-vs-pop)
  - [Classes & Objects](#-classes--objects)
  - [Access Specifiers](#-access-specifiers)
  - [Constructors](#-constructors)
  - [Methods](#-methods)
  - [Encapsulation](#-encapsulation)
  - [Inheritance](#-inheritance)
  - [Polymorphism](#-polymorphism)
  - [Abstraction](#-abstraction)
  - [Static Keyword](#-static-keyword)
  - [this & super Keyword](#-this--super-keyword)
- [🔌 Interface](#-interface)
- [📊 Enum](#-enum)
- [🏷️ Annotations](#️-annotations)
- [🔄 Functional Interface & Lambda Expressions](#-functional-interface--lambda-expressions)
- [⚠️ Exception Handling](#️-exception-handling)
- [🧵 Multithreading](#-multithreading)
- [📦 Packages](#-packages)
- [🖼️ Java Swing & GUI](#️-java-swing--gui)
- [🗂️ File I/O (Input & Output Streams)](#️-file-io-input--output-streams)
- [🔄 Serialization & Deserialization](#-serialization--deserialization)
- [📚 Collections API](#-collections-api)
- [🌊 Stream API](#-stream-api)
- [🔗 JDBC — Java Database Connectivity](#-jdbc-java-database-connectivity)
- [🌐 Servlets & JSP](#-servlets--jsp)
- [🌍 REST API & Web Services](#-rest-api--web-services)
- [🗺️ ORM Tools (Hibernate / JPA)](#️-orm-tools)
- [📦 Maven](#-maven)
- [🐘 Gradle](#-gradle)
- [🧪 JUnit Testing](#-junit-testing)
- [📁 Git & Version Control](#-git--version-control)
- [🏗️ DSA — Data Structures & Algorithms](#️-dsa--data-structures--algorithms)

</details>

---

## ☕ Java Introduction & Features

Java is a **high-level, class-based, object-oriented programming language** designed to have as few implementation dependencies as possible. Developed by **James Gosling** at **Sun Microsystems** (now owned by **Oracle**) in **1995**.

> **"Write Once, Run Anywhere" (WORA)** — Java code compiled to bytecode runs on any platform with a JVM.

### 🌟 Key Features of Java

```
┌─────────────────────────────────────────────────────────────────────┐
│                        JAVA FEATURES                                │
├──────────────────┬──────────────────────────────────────────────────┤
│ Feature          │ Description                                      │
├──────────────────┼──────────────────────────────────────────────────┤
│ Simple           │ Clean syntax, close to C/C++ but simpler         │
│ Object-Oriented  │ Everything is an object (class-based)            │
│ Platform Indep.  │ Bytecode runs on any JVM (WORA)                  │
│ Secure           │ No pointers, sandbox execution, bytecode verifier│
│ Robust           │ Strong memory management, exception handling      │
│ Multithreaded    │ Built-in support for concurrent programming       │
│ Architecture-Neutral│ Compiled to bytecode, not machine code        │
│ Portable         │ Same behavior on any OS/hardware                 │
│ High Performance │ JIT compiler optimizes runtime execution         │
│ Distributed      │ Supports TCP/IP, RMI, EJB for network apps       │
│ Dynamic          │ Dynamically loads classes at runtime             │
│ Interpreted      │ JVM interprets bytecode at runtime               │
└──────────────────┴──────────────────────────────────────────────────┘
```

---

## ⬇️ Java Installation

### Step 1 — Download JDK

1. Visit the official Oracle JDK page: **https://www.oracle.com/java/technologies/downloads/**
2. Or use **OpenJDK**: **https://adoptium.net/**
3. Download the installer for your OS (Windows/macOS/Linux)

### Step 2 — Install JDK

- Run the installer
- Default install path: `C:\Program Files\Java\jdk-21` (Windows)

### Step 3 — Set Environment Variables (Windows)

```
System Properties → Advanced → Environment Variables

JAVA_HOME = C:\Program Files\Java\jdk-21
PATH      = %JAVA_HOME%\bin
```

### Step 4 — Verify Installation

Open **Command Prompt / Terminal** and run:

```bash
# Check Java runtime version
java --version

# Check Java compiler version
javac --version
```

**Expected Output:**
```
java 21.0.x 2024-xx-xx LTS
Java(TM) SE Runtime Environment (build 21.0.x+xx-LTS)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.x+xx-LTS, mixed mode)

javac 21.0.x
```

---

## ⚙️ Java Fundamentals

### 🏗️ JDK · JRE · JVM Architecture

```
┌──────────────────────────────────────────────────────────────┐
│                          JDK                                  │
│  (Java Development Kit — for developers)                     │
│  ┌────────────────────────────────────────────────────────┐  │
│  │                       JRE                              │  │
│  │  (Java Runtime Environment — to run Java programs)     │  │
│  │  ┌──────────────────────────────────────────────────┐  │  │
│  │  │                    JVM                           │  │  │
│  │  │  (Java Virtual Machine — executes bytecode)      │  │  │
│  │  │  ┌────────────┐  ┌──────────┐  ┌─────────────┐  │  │  │
│  │  │  │ Class      │  │ Bytecode │  │ Execution   │  │  │  │
│  │  │  │ Loader     │→ │ Verifier │→ │ Engine(JIT) │  │  │  │
│  │  │  └────────────┘  └──────────┘  └─────────────┘  │  │  │
│  │  └──────────────────────────────────────────────────┘  │  │
│  │  + Java Class Libraries (java.lang, java.util, ...)    │  │
│  └────────────────────────────────────────────────────────┘  │
│  + Compiler (javac), Debugger (jdb), Tools (javadoc...)      │
└──────────────────────────────────────────────────────────────┘
```

| Component | Full Form | Role |
|-----------|-----------|------|
| **JDK** | Java Development Kit | Complete package for developing + running Java apps |
| **JRE** | Java Runtime Environment | Environment to run (not develop) Java programs |
| **JVM** | Java Virtual Machine | Executes Java bytecode on any platform |

---

### 🔄 How Java Works

```
┌──────────────┐    javac      ┌──────────────┐    JVM/JIT    ┌──────────────┐
│  Source Code │  ──────────►  │   Bytecode   │  ──────────►  │  Machine     │
│  Hello.java  │  (Compiler)   │  Hello.class │  (Execution)  │  Code (Run)  │
└──────────────┘               └──────────────┘               └──────────────┘
  Human-readable                Platform-neutral               Platform-specific
```

**Compile and Run a Java Program:**

```bash
# Step 1: Write your code in a .java file
# Step 2: Compile it
javac Hello.java        # Creates Hello.class (bytecode)

# Step 3: Run it
java Hello              # JVM reads Hello.class and executes
```

**Your First Java Program:**

```java
// Hello.java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

> **Important:** The filename MUST match the public class name. `Hello.java` → `public class Hello`

---

### 💻 JShell — Java REPL

**JShell** is an interactive **Read-Eval-Print Loop (REPL)** tool introduced in **Java 9** that lets you execute Java code snippets directly without creating a full class.

```bash
# Open JShell in Command Prompt / Terminal
jshell

# You will see:
|  Welcome to JShell -- Version 21
|  For an introduction type: /help intro
jshell>
```

**Using JShell:**
```java
jshell> System.out.println("Hello from JShell!")
Hello from JShell!

jshell> int x = 10
x ==> 10

jshell> int y = 20
y ==> 20

jshell> x + y
$3 ==> 30

jshell> String name = "Mohammad Asfin"
name ==> "Mohammad Asfin"
```

**JShell Commands:**

| Command | Description |
|---------|-------------|
| `/exit` | Exit JShell |
| `/list` | List all snippets entered |
| `/vars` | List all variables |
| `/methods` | List all defined methods |
| `/help` | Display help |
| `/reset` | Reset JShell state |

```bash
# Exit JShell
jshell> /exit
|  Goodbye
```

---

### 📌 Variables, Identifiers & Name Conventions

#### Variable

> **Variable** is a container that stores data value during execution of a program.
> It is a **temporary memory location** used for assigning values or data to it.
> A variable **must be declared with a datatype**.

```
┌─────────────────────────────────────────────────┐
│                 VARIABLE SYNTAX                 │
│                                                 │
│    datatype  variableName  =  value;            │
│       ↑           ↑            ↑                │
│    int x          x           10                │
│                                                 │
│  ┌────────┐  ┌──────────┐  ┌────────────────┐  │
│  │  Type  │  │  Name    │  │  Memory Box    │  │
│  │  int   │  │    x     │  │     [ 10 ]     │  │
│  └────────┘  └──────────┘  └────────────────┘  │
└─────────────────────────────────────────────────┘
```

```java
// Variable Declaration
int age;           // declared but not initialized
int age2 = 25;     // declared and initialized

// Types of Variables
public class VariableDemo {
    static int classVar = 100;      // Class/Static variable

    int instanceVar = 50;           // Instance variable

    void method() {
        int localVar = 10;          // Local variable
        System.out.println(localVar);
    }
}
```

#### Identifier

> **Identifier** is a name assigned to any programming elements (class, method, variable, etc.).
> An identifier does **NOT** have a datatype.

```
NOTE:
 Identifier → a NAME given to classes, methods, variables, interfaces etc.
 Variable   → a specific memory location container that stores a value during execution.

 An identifier is a broader term; a variable is a specific type of identifier
 that has a datatype and holds a value.
```

#### Rules for Java Identifiers

```
VALID Rules:
   • Can contain letters (A-Z, a-z), digits (0-9), underscore (_), dollar sign ($)
   • Must BEGIN with a letter, underscore, or dollar sign (NOT a digit)
   • Cannot use Java reserved keywords (int, class, public, etc.)
   • Case-sensitive: myVar ≠ MyVar ≠ MYVAR
   • No spaces allowed

INVALID Examples:
   • 2name     → starts with digit
   • my-name   → contains hyphen (-)
   • class     → reserved keyword
   • my name   → contains space
```

#### Java Naming Conventions

```
┌──────────────────┬──────────────────────────┬───────────────────────────┐
│ Element          │ Convention               │ Example                   │
├──────────────────┼──────────────────────────┼───────────────────────────┤
│ Class            │ PascalCase               │ StudentDetails, BankAcc   │
│ Interface        │ PascalCase               │ Runnable, Serializable    │
│ Method           │ camelCase                │ getName(), calculateTotal │
│ Variable         │ camelCase                │ firstName, totalAmount    │
│ Constant         │ UPPER_SNAKE_CASE         │ MAX_SIZE, PI              │
│ Package          │ lowercase                │ com.company.project       │
│ Enum             │ PascalCase               │ DayOfWeek, Season         │
└──────────────────┴──────────────────────────┴───────────────────────────┘
```

---

### 🗃️ Primitive Data Types

> **Datatype:** Type of the data is called a datatype.

Java has **8 primitive datatypes**:

```
┌──────────────────────────────────────────────────────────────────────────────────────┐
│                        JAVA PRIMITIVE DATA TYPES                                     │
├──────────┬──────────────┬────────────────┬────────────────────────────────────────── │
│ Type     │ Size         │ Default Value  │ Range / Description                        │
├──────────┼──────────────┼────────────────┼────────────────────────────────────────── │
│ byte     │ 1 byte (8b)  │ 0              │ -128 to 127                                │
│ short    │ 2 bytes(16b) │ 0              │ -32,768 to 32,767                          │
│ int      │ 4 bytes(32b) │ 0              │ -2,147,483,648 to 2,147,483,647            │
│ long     │ 8 bytes(64b) │ 0L             │ -9,223,372,036,854,775,808 to max          │
│ float    │ 4 bytes(32b) │ 0.0f           │ ~3.4e-038 to 3.4e+038 (6-7 decimals)      │
│ double   │ 8 bytes(64b) │ 0.0d           │ ~1.7e-308 to 1.7e+308 (15 decimals)       │
│ char     │ 2 bytes(16b) │ '\u0000'       │ 0 to 65,535 (Unicode characters)          │
│ boolean  │ 1 bit        │ false          │ true or false only                         │
└──────────┴──────────────┴────────────────┴────────────────────────────────────────── ┘
```

```
Memory Hierarchy (smallest to largest):
byte → short → int → long → float → double
 1B      2B     4B    8B      4B      8B
```

```java
// Primitive Datatype Examples
byte   age      = 25;
short  year     = 2024;
int    salary   = 75000;
long   bigNum   = 9876543210L;   // 'L' suffix for long
float  price    = 19.99f;        // 'f' suffix for float
double pi       = 3.14159265358;
char   grade    = 'A';
boolean isPassed = true;
```

---

### 🔢 Literals & Type Conversion

**Literals** are fixed values assigned directly to variables.

```java
// Integer Literals
int decimal = 100;           // Decimal
int octal   = 0144;         // Octal (prefix 0)
int hex     = 0x64;         // Hexadecimal (prefix 0x)
int binary  = 0b01100100;   // Binary (prefix 0b) — Java 7+

// Floating-point Literals
float  f = 3.14f;
double d = 3.14;

// Character Literals
char c1 = 'A';
char c2 = '\n';   // newline escape sequence
char c3 = '\t';   // tab

// String Literal
String s = "Hello Java";

// Boolean Literal
boolean b = true;
```

#### Type Conversion (Widening & Narrowing)

```
WIDENING (Implicit / Automatic — safe, no data loss):
byte → short → int → long → float → double

NARROWING (Explicit / Manual — possible data loss, needs cast):
double → float → long → int → short → byte
```

```java
// Widening (Automatic)
int i = 100;
long l = i;       // int → long (automatic)
double d2 = l;    // long → double (automatic)

// Narrowing (Manual Cast)
double d3 = 9.99;
int i2 = (int) d3;   // double → int, loses decimal → i2 = 9

// Type Promotion in expressions
byte b2 = 10;
byte result = (byte)(b2 * 2);  // Expression promoted to int, must cast back
```

---

### 🎁 Wrapper Classes

Wrapper classes provide an object representation of primitive types. Needed for Collections, Generics, and utility methods.

```
┌─────────────────────────────────────────────────────────────────────────┐
│                      WRAPPER CLASS TABLE                                │
├─────────────┬─────────────────┬────────────────────────────────────────│
│ Primitive   │ Wrapper Class   │ Useful Method                          │
├─────────────┼─────────────────┼────────────────────────────────────────│
│ byte        │ Byte            │ Byte.parseByte("10")                   │
│ short       │ Short           │ Short.parseShort("20")                 │
│ int         │ Integer         │ Integer.parseInt("42")                 │
│ long        │ Long            │ Long.parseLong("100")                  │
│ float       │ Float           │ Float.parseFloat("3.14")               │
│ double      │ Double          │ Double.parseDouble("3.14")             │
│ char        │ Character       │ Character.isDigit('5')                 │
│ boolean     │ Boolean         │ Boolean.parseBoolean("true")           │
└─────────────┴─────────────────┴────────────────────────────────────────┘
```

**Autoboxing & Unboxing (Java 5+):**
```java
// Autoboxing — primitive to Wrapper (automatic)
int x = 50;
Integer obj = x;        // autoboxing

// Unboxing — Wrapper to primitive (automatic)
Integer obj2 = 100;
int y = obj2;           // unboxing

// Useful Integer Methods
int max  = Integer.MAX_VALUE;     // 2147483647
int min  = Integer.MIN_VALUE;     // -2147483648
String s = Integer.toString(42);  // "42"
int n    = Integer.parseInt("42"); // 42
String bin = Integer.toBinaryString(10); // "1010"
String hex = Integer.toHexString(255);   // "ff"
```

---

## 🖨️ Input & Output Statements

> **Input Statement:** To accept data from a user using an input device (keyboard) which is called input.
> **Output Statement:** To display data to the user on a screen.

### Output Methods
```java
System.out.println("Hello");   // prints with newline
System.out.print("Hello");     // prints without newline
System.out.printf("Name: %s, Age: %d%n", "Asfin", 20); // formatted
```

---

### 🔍 Scanner Class

`Scanner` is the most common class for reading user input in Java programs.

**Import:** `import java.util.Scanner;`

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                       SCANNER CLASS METHODS                                 │
├─────────────────────────┬───────────────────────────────────────────────── │
│ Method                  │ Description                                        │
├─────────────────────────┼───────────────────────────────────────────────── │
│ nextByte()              │ Reads a byte value                                 │
│ nextShort()             │ Reads a short value                                │
│ nextInt()               │ Reads an integer value                             │
│ nextLong()              │ Reads a long value                                 │
│ nextFloat()             │ Reads a float value                                │
│ nextDouble()            │ Reads a double value                               │
│ nextBoolean()           │ Reads a boolean value                              │
│ next()                  │ Reads a single word (stops at space)               │
│ nextLine()              │ Reads a full line of text including spaces         │
│ hasNext()               │ Returns true if there is another token             │
│ close()                 │ Closes the scanner                                 │
└─────────────────────────┴───────────────────────────────────────────────── ┘
```

```java
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner with System.in

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);

        sc.close(); // Always close scanner
    }
}
```

---

### 🖥️ Console Class

`System.console()` returns a `Console` object for reading from and writing to the system console.

```java
public class ConsoleDemo {
    public static void main(String[] args) {
        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("Console not available (run from terminal)");
            return;
        }

        // Read a line
        String username = console.readLine("Enter username: ");

        // Read password (hides input — great for passwords)
        char[] password = console.readPassword("Enter password: ");

        console.printf("Welcome, %s!%n", username);
    }
}
```

| Method | Description |
|--------|-------------|
| `readLine(prompt)` | Reads a line of text |
| `readPassword(prompt)` | Reads password (input hidden) |
| `printf(format, args)` | Formatted output |
| `writer()` | Returns PrintWriter for output |

---

### 📟 Command Line Arguments

Arguments passed to the `main` method when running a Java program.

```bash
# Pass arguments at runtime
java MyProgram Asfin 25
```

```java
public class CommandLineDemo {
    public static void main(String[] args) {
        // args[0] = "Asfin", args[1] = "25"
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        // Convert string argument to int
        if (args.length >= 2) {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
```

---

### 📥 DataInputStream

`DataInputStream` lets you read primitive data types from an underlying input stream.

```java
import java.io.*;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // Reading from keyboard using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
```

---

## 🔢 Operators

Operators are special symbols that perform operations on operands (values/variables).

### Types of Operators

```
┌──────────────────────────────────────────────────────────────────────────────┐
│                          JAVA OPERATORS                                       │
├──────────────────┬───────────────────────────────────────────────────────── │
│ Type             │ Operators                                                  │
├──────────────────┼───────────────────────────────────────────────────────── │
│ Arithmetic       │ +  -  *  /  %                                             │
│ Assignment       │ =  +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=             │
│ Relational       │ ==  !=  >  <  >=  <=                                     │
│ Logical          │ &&  ||  !                                                 │
│ Bitwise          │ &  |  ^  ~  <<  >>  >>>                                  │
│ Unary            │ +  -  ++  --  !  ~                                       │
│ Ternary          │ condition ? valueIfTrue : valueIfFalse                   │
│ instanceof       │ obj instanceof ClassName                                 │
└──────────────────┴───────────────────────────────────────────────────────── ┘
```

```java
public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. ARITHMETIC OPERATORS
        int a = 10, b = 3;
        System.out.println(a + b);   // 13 (Addition)
        System.out.println(a - b);   // 7  (Subtraction)
        System.out.println(a * b);   // 30 (Multiplication)
        System.out.println(a / b);   // 3  (Division — integer)
        System.out.println(a % b);   // 1  (Modulus / Remainder)

        // 2. ASSIGNMENT OPERATORS
        int x = 5;
        x += 3;   // x = x + 3 = 8
        x -= 2;   // x = x - 2 = 6
        x *= 4;   // x = x * 4 = 24
        x /= 3;   // x = x / 3 = 8
        x %= 3;   // x = x % 3 = 2

        // 3. RELATIONAL OPERATORS (return boolean)
        int p = 10, q = 20;
        System.out.println(p == q);   // false
        System.out.println(p != q);   // true
        System.out.println(p > q);    // false
        System.out.println(p < q);    // true
        System.out.println(p >= q);   // false
        System.out.println(p <= q);   // true

        // 4. LOGICAL OPERATORS
        boolean t = true, f = false;
        System.out.println(t && f);   // false (AND — both must be true)
        System.out.println(t || f);   // true  (OR  — at least one true)
        System.out.println(!t);       // false (NOT — reverses value)

        // 5. UNARY OPERATORS
        int n = 5;
        System.out.println(n++);   // 5 (post-increment: use then increment)
        System.out.println(++n);   // 7 (pre-increment: increment then use)
        System.out.println(n--);   // 7 (post-decrement)
        System.out.println(--n);   // 5 (pre-decrement)

        // 6. TERNARY OPERATOR
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);   // "Adult"

        // 7. BITWISE OPERATORS
        int m = 5;   // 0101
        int k = 3;   // 0011
        System.out.println(m & k);   // 1  (AND)
        System.out.println(m | k);   // 7  (OR)
        System.out.println(m ^ k);   // 6  (XOR)
        System.out.println(~m);      // -6 (NOT)
        System.out.println(m << 1);  // 10 (Left shift)
        System.out.println(m >> 1);  // 2  (Right shift)
    }
}
```

---

## 🔀 Control Statements

Control statements determine the **flow of execution** in a Java program.

```
┌────────────────────────────────────────────────────────────┐
│                  CONTROL STATEMENTS                         │
├─────────────────────┬──────────────────────────────────── │
│ Category            │ Types                                │
├─────────────────────┼──────────────────────────────────── │
│ Conditional         │ if, if-else, if-else-if, switch      │
│ Looping             │ for, while, do-while, enhanced-for   │
│ Jumping             │ break, continue, return              │
└─────────────────────┴──────────────────────────────────── ┘
```

### Conditional Statements

```java
// 1. if Statement
int marks = 75;
if (marks >= 60) {
    System.out.println("Passed!");
}

// 2. if-else Statement
if (marks >= 60) {
    System.out.println("Passed!");
} else {
    System.out.println("Failed!");
}

// 3. if-else-if Ladder
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {
    System.out.println("Grade: B");
} else if (marks >= 70) {
    System.out.println("Grade: C");
} else if (marks >= 60) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}

// 4. switch Statement
int day = 3;
switch (day) {
    case 1: System.out.println("Monday");    break;
    case 2: System.out.println("Tuesday");   break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday");  break;
    case 5: System.out.println("Friday");    break;
    default: System.out.println("Weekend");  break;
}
```

### Looping Statements

```
Flow Diagram for a Loop:
                     Start
                       |
                  Condition?
               Yes /          \ No
              /                 End
         Loop Body
              |
           Update
              |
          back to Condition
```

```java
// 1. while Loop — condition checked BEFORE execution
int i = 1;
while (i <= 5) {
    System.out.print(i + " ");   // 1 2 3 4 5
    i++;
}

// 2. do-while Loop — condition checked AFTER execution (runs at least once)
int j = 1;
do {
    System.out.print(j + " ");   // 1 2 3 4 5
    j++;
} while (j <= 5);

// 3. for Loop — compact; when you know iteration count
for (int k = 1; k <= 5; k++) {
    System.out.print(k + " ");   // 1 2 3 4 5
}

// 4. Enhanced for Loop (for-each) — for arrays/collections
int[] numbers = {10, 20, 30, 40, 50};
for (int num : numbers) {
    System.out.print(num + " ");  // 10 20 30 40 50
}

// 5. break — exits loop immediately
for (int nn = 1; nn <= 10; nn++) {
    if (nn == 5) break;
    System.out.print(nn + " ");   // 1 2 3 4
}

// 6. continue — skips current iteration
for (int nn = 1; nn <= 10; nn++) {
    if (nn % 2 == 0) continue;   // skip even
    System.out.print(nn + " ");   // 1 3 5 7 9
}
```

**When to use which loop:**

```
┌───────────────┬────────────────────────────────────────────────────┐
│ Loop          │ Best When...                                        │
├───────────────┼────────────────────────────────────────────────────┤
│ for           │ You know the exact number of iterations            │
│ while         │ Number of iterations is unknown (condition-based)  │
│ do-while      │ Loop must execute at least once                    │
│ enhanced-for  │ Iterating over arrays or collections               │
└───────────────┴────────────────────────────────────────────────────┘
```

---

## 📦 Arrays

> **Array:** An array is a collection of elements of the **same datatype** in **contiguous memory locations**.
> It is a set of variables with the same datatype referred by a **common name**.

```
┌────────────────────────────────────────────────────────────────┐
│                    ARRAY MEMORY LAYOUT                          │
│                                                                 │
│  int[] arr = {10, 20, 30, 40, 50};                            │
│                                                                 │
│  Index:   [0]  [1]  [2]  [3]  [4]                             │
│           ┌───┬───┬───┬───┬───┐                                │
│  Values:  │10 │20 │30 │40 │50 │                                │
│           └───┴───┴───┴───┴───┘                                │
│                                                                 │
│  arr[0] = 10   arr.length = 5                                  │
│  arr[4] = 50   Last index = length - 1 = 4                     │
└────────────────────────────────────────────────────────────────┘
```

### Types of Arrays

```java
// 1. SINGLE-DIMENSIONAL ARRAY
int[] arr1 = new int[5];             // Declaration + allocation
int[] arr2 = {10, 20, 30, 40, 50};  // Declaration + initialization
int[] arr3;                          // Declaration only
arr3 = new int[]{1, 2, 3};          // Late initialization

// Accessing elements
System.out.println(arr2[0]);         // 10 (first element)
System.out.println(arr2[arr2.length - 1]); // 50 (last element)

// Iterating
for (int i = 0; i < arr2.length; i++) {
    System.out.println("arr[" + i + "] = " + arr2[i]);
}

// 2. MULTI-DIMENSIONAL ARRAY (2D Array — Matrix)
int[][] matrix = new int[3][3];      // 3 rows, 3 columns

int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(grid[1][2]);      // 6 (row 1, col 2)

// Traverse 2D Array
for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + " ");
    }
    System.out.println();
}

// 3. JAGGED ARRAY (rows with different column counts)
int[][] jagged = new int[3][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3, 4, 5};
jagged[2] = new int[]{6, 7, 8, 9};

// 4. ARRAY OF OBJECTS
class Student {
    String name;
    int age;
    Student(String n, int a) { name = n; age = a; }
}

Student[] students = new Student[3];
students[0] = new Student("Asfin", 20);
students[1] = new Student("Riya", 22);
students[2] = new Student("John", 21);

for (Student s : students) {
    System.out.println(s.name + " - " + s.age);
}
```

### Key Array Methods (java.util.Arrays)

```java
import java.util.Arrays;

int[] arr = {5, 3, 1, 4, 2};

Arrays.sort(arr);                           // Sort array: [1,2,3,4,5]
System.out.println(Arrays.toString(arr));   // [1, 2, 3, 4, 5]

int idx  = Arrays.binarySearch(arr, 3);     // Search (returns index)
int[] copy = Arrays.copyOf(arr, 3);         // Copy first 3 elements
Arrays.fill(arr, 0);                        // Fill all with 0
boolean equal = Arrays.equals(arr, copy);   // Compare arrays
```

---

## 🔡 Strings

> **String** is a sequence of characters. In Java, String is an **immutable** class in the `java.lang` package.

```java
// String Creation
String s1 = "Hello";                     // String literal (stored in String Pool)
String s2 = new String("Hello");         // String object (stored in Heap)

// String Concatenation
String name = "Mohammad" + " " + "Asfin";

// String Comparison
System.out.println(s1 == s2);                    // false (different references)
System.out.println(s1.equals(s2));               // true  (same content)
System.out.println(s1.equalsIgnoreCase("hello")); // true (ignore case)
```

### String Methods

```java
String str = "Hello, World!";

// Length
str.length()                    // 13

// Case
str.toUpperCase()               // "HELLO, WORLD!"
str.toLowerCase()               // "hello, world!"

// Search
str.charAt(0)                   // 'H'
str.indexOf('o')                // 4
str.lastIndexOf('o')            // 8
str.contains("World")          // true
str.startsWith("Hello")        // true
str.endsWith("!")               // true

// Extract
str.substring(7)                // "World!"
str.substring(7, 12)           // "World"

// Modify
str.replace('l', 'r')          // "Herro, Worrd!"
str.replace("World", "Java")   // "Hello, Java!"
str.trim()                      // removes leading/trailing spaces
str.toCharArray()               // char array

// Split
String[] parts = "a,b,c".split(",");  // ["a", "b", "c"]

// Format
String.format("Name: %s, Age: %d", "Asfin", 20)  // "Name: Asfin, Age: 20"

// String.valueOf()
String.valueOf(42)              // "42"
String.valueOf(true)           // "true"
```

### String Pool (Interning)

```
String Pool (Heap memory area):

String a = "Java";    Both a and b point to SAME object in the pool
String b = "Java";
a == b  → true  (same reference in pool)

String c = new String("Java");   Creates NEW object in Heap (outside pool)
a == c  → false (different references)
a.equals(c) → true (same content)
```

---

### 📝 StringBuffer & StringBuilder

Both are **mutable** alternatives to `String` (can be modified without creating new objects).

```
┌───────────────────────────────────────────────────────────┐
│       String vs StringBuffer vs StringBuilder             │
├───────────────┬───────────────┬─────────────────────────  │
│ Feature       │ StringBuffer  │ StringBuilder             │
├───────────────┼───────────────┼─────────────────────────  │
│ Mutable?      │ Yes           │ Yes                       │
│ Thread-safe?  │ Yes (sync)    │ No (not sync)             │
│ Performance   │ Slower        │ Faster                    │
│ Use when      │ Multi-thread  │ Single-thread             │
└───────────────┴───────────────┴───────────────────────────┘
```

```java
// StringBuffer — Thread-safe
StringBuffer sb = new StringBuffer("Hello");
sb.append(", World");          // "Hello, World"
sb.insert(5, " Java");         // "Hello Java, World"
sb.delete(5, 10);              // "Hello, World"
sb.reverse();                  // "dlroW ,olleH"
sb.replace(0, 5, "Hi");        // Replace index 0-5
System.out.println(sb.length()); // Length
System.out.println(sb.toString()); // Convert to String

// StringBuilder — Faster (single-threaded)
StringBuilder sb2 = new StringBuilder();
sb2.append("Java ");
sb2.append("is ");
sb2.append("awesome!");
System.out.println(sb2.toString());  // "Java is awesome!"
sb2.deleteCharAt(4);           // Remove char at index 4
sb2.setCharAt(0, 'j');         // Replace char at index 0
```

---

## 🏛️ OOP — Object Oriented Programming

### 🔄 OOP vs POP

```
┌──────────────────────────────────────────────────────────────────────────────────┐
│              Programming Paradigm Comparison                                      │
├─────────────────────────────────────┬────────────────────────────────────────── │
│   POP (Procedure Oriented           │   OOP (Object Oriented                    │
│   Programming)                      │   Programming)                            │
├─────────────────────────────────────┼────────────────────────────────────────── │
│ Uses FUNCTIONS as building blocks   │ Uses CLASSES & OBJECTS as building blocks │
│ Program divided into functions      │ Program divided into objects              │
│ Top-down design approach            │ Bottom-up design approach                 │
│ Data flows between functions        │ Data is encapsulated in objects           │
│ Less secure (global data)           │ More secure (data hiding)                 │
│ Difficult to reuse                  │ Easy code reuse via inheritance           │
│ e.g., C, Pascal, COBOL              │ e.g., Java, C++, Python                  │
└─────────────────────────────────────┴────────────────────────────────────────── ┘
```

**Four Pillars of OOP:**
```
        ┌─────────────────────────────────────┐
        │         PILLARS OF OOP              │
        │                                     │
        │   ┌─────────────┐                  │
        │   │Encapsulation│  Data Hiding      │
        │   └─────────────┘                  │
        │   ┌─────────────┐                  │
        │   │ Abstraction │  Hide Complexity  │
        │   └─────────────┘                  │
        │   ┌─────────────┐                  │
        │   │ Inheritance │  Code Reuse       │
        │   └─────────────┘                  │
        │   ┌─────────────┐                  │
        │   │Polymorphism │  Many Forms       │
        │   └─────────────┘                  │
        └─────────────────────────────────────┘
```

---

### 🏗️ Classes & Objects

> **Class:** A blueprint/template for creating objects. It defines attributes (fields) and behaviors (methods).
> **Object:** A real-world instance of a class. Each object has its own state and behavior.

```
Class (Blueprint)                   Objects (Instances)
┌─────────────────┐                 ┌─────────────────────┐
│  class Car {    │    creates →    │ car1: Toyota, Red   │
│    String brand │                 │ car2: Honda, Blue   │
│    String color │                 │ car3: BMW, Black    │
│    void start() │                 └─────────────────────┘
│  }              │
└─────────────────┘
```

```java
// Class Definition
class Car {
    // Fields (Attributes / Instance variables)
    String brand;
    String color;
    int speed;

    // Methods (Behaviors)
    void start() {
        System.out.println(brand + " is starting...");
    }

    void accelerate(int s) {
        speed += s;
        System.out.println("Speed: " + speed + " km/h");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Objects using 'new' keyword
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";

        car1.start();           // "Toyota is starting..."
        car1.displayInfo();     // "Brand: Toyota, Color: Red"
        car2.start();           // "Honda is starting..."
    }
}
```

---

### 🔐 Access Specifiers (Visibility Modes)

Access specifiers control the **visibility / accessibility** of classes, methods, and fields.

```
┌─────────────────────────────────────────────────────────────────────────────────┐
│                        ACCESS SPECIFIERS IN JAVA                                │
├──────────────┬──────────────┬──────────────┬──────────────┬──────────────────── │
│ Modifier     │ Same Class   │ Same Package │ Subclass     │ Other Packages      │
├──────────────┼──────────────┼──────────────┼──────────────┼──────────────────── │
│ private      │     Yes      │     No       │     No       │      No             │
│ default      │     Yes      │     Yes      │     No       │      No             │
│ protected    │     Yes      │     Yes      │     Yes      │      No             │
│ public       │     Yes      │     Yes      │     Yes      │      Yes            │
└──────────────┴──────────────┴──────────────┴──────────────┴────────────────────┘
```

```java
class AccessDemo {
    private   int a = 10;   // only within this class
    int       b = 20;       // default: within same package
    protected int c = 30;   // same package + subclasses
    public    int d = 40;   // accessible everywhere

    public int getA() { return a; }  // getter for private field
}
```

---

### 🏗️ Constructors

> **Constructor** is a **special method** that is automatically called when an object is created.
> It has the **same name as the class** and **no return type** (not even `void`).

```
CONSTRUCTOR vs METHOD:
┌──────────────────────────────────┬──────────────────────────────────┐
│ Constructor                      │ Method                           │
├──────────────────────────────────┼──────────────────────────────────┤
│ Same name as class               │ Any name                         │
│ No return type (not even void)   │ Has return type (or void)        │
│ Called automatically on new      │ Called explicitly                │
│ Used to initialize objects       │ Used for any functionality       │
│ Cannot be abstract/static/final  │ Can be abstract/static/final     │
└──────────────────────────────────┴──────────────────────────────────┘
```

#### Types of Constructors

```java
class Student {
    String name;
    int age;
    String course;

    // 1. DEFAULT CONSTRUCTOR (no parameters)
    Student() {
        name   = "Unknown";
        age    = 0;
        course = "N/A";
    }

    // 2. PARAMETERIZED CONSTRUCTOR (with parameters)
    Student(String name, int age, String course) {
        this.name   = name;   // 'this' refers to current object
        this.age    = age;
        this.course = course;
    }

    // 3. COPY CONSTRUCTOR (copies another object)
    Student(Student other) {
        this.name   = other.name;
        this.age    = other.age;
        this.course = other.course;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();                      // default
        Student s2 = new Student("Asfin", 20, "Java"); // parameterized
        Student s3 = new Student(s2);                   // copy

        s1.display();  // Name: Unknown, Age: 0, Course: N/A
        s2.display();  // Name: Asfin, Age: 20, Course: Java
        s3.display();  // Name: Asfin, Age: 20, Course: Java
    }
}
```

---

### ⚙️ Methods

> A **Method** is a block of code that performs a specific task. It is called explicitly and has a return type.

```java
class MethodDemo {

    // 1. INSTANCE METHOD — requires object to call
    void greet() {
        System.out.println("Hello from instance method!");
    }

    // 2. STATIC METHOD — called with class name, no object needed
    static void staticHello() {
        System.out.println("Hello from static method!");
    }

    // 3. METHOD WITH PARAMETERS and RETURN TYPE
    int add(int a, int b) {
        return a + b;
    }

    // 4. VOID METHOD (no return value)
    void printInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    // 5. METHOD OVERLOADING (same name, different parameters)
    int multiply(int a, int b)          { return a * b; }
    double multiply(double a, double b) { return a * b; }
    int multiply(int a, int b, int c)   { return a * b * c; }

    // 6. VARARGS METHOD (variable number of arguments)
    int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        MethodDemo obj = new MethodDemo();
        obj.greet();                         // instance call
        MethodDemo.staticHello();            // static call
        System.out.println(obj.add(5, 3));  // 8
        System.out.println(obj.sum(1, 2, 3, 4, 5)); // 15 (varargs)
    }
}
```

---

### 🔒 Encapsulation

> **Encapsulation** is the process of **wrapping data (fields) and methods** together into a single unit (class), and restricting direct access to some components.

**Key Concept: Data Hiding** — Make fields `private`, provide `public` getters and setters.

```
┌──────────────────────────────────────────────────────────────┐
│                     ENCAPSULATION                            │
│                                                              │
│  ┌───────────────────────────────────┐                      │
│  │         Class (Capsule)           │                      │
│  │   ┌───────────────────────────┐   │                      │
│  │   │  private data members     │   │  Hidden from outside │
│  │   │  (fields / attributes)    │   │                      │
│  │   └───────────────────────────┘   │                      │
│  │   ┌───────────────────────────┐   │                      │
│  │   │  public methods           │   │  Controlled access   │
│  │   │  (getters / setters)      │   │                      │
│  │   └───────────────────────────┘   │                      │
│  └───────────────────────────────────┘                      │
│                                                              │
│  Benefits: Data Security, Flexibility, Maintainability       │
└──────────────────────────────────────────────────────────────┘
```

```java
class BankAccount {
    private String owner;
    private double balance;     // private — cannot access directly

    // Constructor
    BankAccount(String owner, double initialBalance) {
        this.owner   = owner;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Asfin", 5000.0);
        // acc.balance = -100;   Cannot access private field
        acc.deposit(2000);       // controlled via method
        acc.withdraw(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
```

---

### 🧬 Inheritance

> **Inheritance** is a mechanism where a **child class** acquires the properties and behaviors of a **parent class**.
> Promotes **code reuse** and establishes an **IS-A** relationship.

```
Syntax:
class ChildClass extends ParentClass { ... }
```

#### Types of Inheritance

```
1. SINGLE INHERITANCE
   ┌──────────┐
   │  Animal  │ (Parent)
   └────┬─────┘
        │ extends
   ┌────▼─────┐
   │   Dog    │ (Child)
   └──────────┘

2. MULTILEVEL INHERITANCE
   ┌──────────┐
   │  Animal  │
   └────┬─────┘
        │
   ┌────▼─────┐
   │   Dog    │
   └────┬─────┘
        │
   ┌────▼─────┐
   │  Puppy   │
   └──────────┘

3. HIERARCHICAL INHERITANCE
        ┌──────────┐
        │  Animal  │
        └────┬─────┘
       ┌─────┴─────┐
  ┌────▼─────┐ ┌───▼────┐
  │   Dog    │ │   Cat  │
  └──────────┘ └────────┘

4. MULTIPLE INHERITANCE — Not directly in Java
   Achieved via INTERFACES:
   ┌───────────┐  ┌────────────┐
   │Interface A│  │Interface B │
   └─────┬─────┘  └──────┬─────┘
         └────────┬───────┘
              ┌───▼────┐
              │ ClassC │ implements A, B
              └────────┘
```

```java
// 1. Single Inheritance
class Animal {
    String name;
    void eat()    { System.out.println(name + " is eating"); }
    void breathe(){ System.out.println(name + " is breathing"); }
}

class Dog extends Animal {
    void bark() { System.out.println(name + " says: Woof!"); }
}

// 2. Multilevel Inheritance
class Puppy extends Dog {
    void play() { System.out.println(name + " is playing!"); }
}

// 3. Hierarchical Inheritance
class Cat extends Animal {
    void meow() { System.out.println(name + " says: Meow!"); }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();    // inherited from Animal
        dog.bark();   // own method

        Puppy puppy = new Puppy();
        puppy.name = "Max";
        puppy.eat();     // from Animal (level 1)
        puppy.bark();    // from Dog (level 2)
        puppy.play();    // own method (level 3)
    }
}
```

**`super` keyword** — accesses parent class members:
```java
class Vehicle {
    String type = "Vehicle";
    void display() { System.out.println("I am a " + type); }
}

class Car extends Vehicle {
    String type = "Car";

    void display() {
        System.out.println("I am a " + type);            // Car's type
        System.out.println("Parent: " + super.type);     // Vehicle's type
        super.display();                                   // Parent's method
    }
}
```

---

### 🎭 Polymorphism

> **Polymorphism** (Greek: *poly* = many, *morphism* = forms) — The ability of an object to take **many forms**.
> One interface, multiple implementations.

```
TYPES OF POLYMORPHISM:
┌──────────────────────────────────────────────────────────────────────┐
│                        POLYMORPHISM                                  │
│                              │                                       │
│         ┌────────────────────┴────────────────────┐                 │
│         ▼                                         ▼                 │
│  Compile-Time (Static)                   Run-Time (Dynamic)         │
│  Method Overloading                      Method Overriding           │
│                                                                     │
│  Same name, different params             Same name + params          │
│  Resolved at compile time                in parent and child         │
│                                          Resolved at runtime         │
└──────────────────────────────────────────────────────────────────────┘
```

```java
// 1. COMPILE-TIME POLYMORPHISM — Method Overloading
class Calculator {
    int add(int a, int b)             { return a + b; }
    double add(double a, double b)    { return a + b; }
    int add(int a, int b, int c)      { return a + b + c; }
    String add(String a, String b)    { return a + b; }
}

Calculator calc = new Calculator();
System.out.println(calc.add(5, 3));           // 8
System.out.println(calc.add(5.5, 2.2));      // 7.7
System.out.println(calc.add(1, 2, 3));       // 6
System.out.println(calc.add("Hi", " Java")); // "Hi Java"

// 2. RUN-TIME POLYMORPHISM — Method Overriding
class Shape {
    void draw() { System.out.println("Drawing a shape"); }
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing a Circle"); }
}

class Rectangle extends Shape {
    @Override
    void draw() { System.out.println("Drawing a Rectangle"); }
}

// Dynamic Method Dispatch (Runtime Polymorphism)
public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();     // Shape reference, Circle object
        s.draw();             // "Drawing a Circle" — decided at RUNTIME

        s = new Rectangle();
        s.draw();             // "Drawing a Rectangle"
    }
}
```

**Upcasting & Downcasting:**
```java
Animal animal = new Dog();   // Upcasting (implicit) — Dog IS-A Animal
Dog dog = (Dog) animal;      // Downcasting (explicit cast)

// Safe downcasting with instanceof
if (animal instanceof Dog) {
    Dog d = (Dog) animal;
    d.bark();
}
```

---

### 🎭 Abstraction

> **Abstraction** is hiding the implementation details and showing only the essential features/functionality.

Java achieves abstraction via:
1. **Abstract Class** (0 to 100% abstraction)
2. **Interface** (100% abstraction)

```java
// Abstract Class
abstract class Shape {
    String color;

    // Abstract method — no body, must be implemented by subclass
    abstract double area();

    // Concrete method — has body
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r, String c) {
        this.radius = r;
        this.color  = c;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w, String c) {
        this.length = l; this.width = w; this.color = c;
    }

    @Override
    double area() { return length * width; }
}
```

---

### ⚡ Static Keyword

```java
class Counter {
    static int count = 0;    // Static variable — shared by all objects
    int id;                  // Instance variable — unique per object

    Counter() {
        count++;
        this.id = count;
    }

    static void showCount() {  // Static method — called via class name
        System.out.println("Total objects: " + count);
    }

    // Static Block — runs once when class is first loaded
    static {
        System.out.println("Counter class loaded!");
        count = 0;
    }
}

// Usage
Counter.showCount();   // 0
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();
Counter.showCount();   // 3
```

---

### 🔑 this & super Keyword

```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;   // 'this.name' = field; 'name' = parameter
        this.age  = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, int age, String company) {
        super(name, age);         // Call parent constructor — MUST be first line
        this.company = company;
    }

    void display() {
        super.display();          // Call parent method
        System.out.println("Company: " + company);
    }
}
```

---

## 🔌 Interface

> An **Interface** is a completely abstract type that defines a contract of methods a class must implement.
> All methods are **public abstract** by default.
> All variables are **public static final** (constants) by default.

```
Syntax:
interface InterfaceName { ... }
class ClassName implements InterfaceName { ... }
interface B extends A { ... }

INHERITANCE RELATIONSHIPS:
  class   → class      : extends   (single parent only)
  class   → interface  : implements (can implement multiple!)
  interface → interface: extends   (can extend multiple!)
```

### Types of Interfaces

```
┌────────────────────────────────────────────────────────────────────────┐
│                      TYPES OF INTERFACE                                │
├───────────────────────┬───────────────────────────────────────────────│
│ Type                  │ Description                                    │
├───────────────────────┼───────────────────────────────────────────────│
│ Normal Interface      │ Has MORE than one abstract method              │
│ Functional Interface  │ Has EXACTLY ONE abstract method (SAM)          │
│   (SAM Interface)     │ Used with Lambda expressions                   │
│ Marker Interface      │ EMPTY — has no methods, just "marks" a class   │
│                       │ e.g., Serializable, Cloneable, Remote          │
└───────────────────────┴───────────────────────────────────────────────┘
```

```java
// Normal Interface
interface Animal {
    String NAME = "Animal";    // public static final by default
    void eat();                // public abstract by default
    void sleep();
    void breathe();
}

// Functional Interface (SAM — Single Abstract Method)
@FunctionalInterface
interface Greeting {
    void greet(String name);   // only ONE abstract method
}

// Marker Interface (empty)
interface Printable { }   // marks a class as printable

// Multiple Interface Implementation
interface Flyable  { void fly(); }
interface Swimmable { void swim(); }

class Duck implements Flyable, Swimmable {
    @Override public void fly()  { System.out.println("Duck is flying!"); }
    @Override public void swim() { System.out.println("Duck is swimming!"); }
}
```

### Abstract Class vs Interface

```
┌──────────────────────────────────────────────────────────────────────────────┐
│              ABSTRACT CLASS  vs  INTERFACE                                   │
├─────────────────────────────┬────────────────────────────────────────────── │
│ Abstract Class              │ Interface                                      │
├─────────────────────────────┼────────────────────────────────────────────── │
│ abstract keyword            │ interface keyword                              │
│ Can have abstract + concrete│ Only abstract (Java 7), default/static (8+)   │
│ Can have instance variables │ Only public static final constants             │
│ Can have constructors       │ Cannot have constructors                       │
│ Single inheritance only     │ Multiple interfaces implementable              │
│ Can have access modifiers   │ All methods public by default                  │
│ 0 to 100% abstraction       │ 100% abstraction (traditionally)               │
│ use when: IS-A + shared code│ use when: CAN-DO / capability contract         │
│ extends keyword             │ implements keyword                             │
└─────────────────────────────┴────────────────────────────────────────────── ┘
```

---

## 📊 Enum

> **Enum (Enumeration)** is a special class that represents a group of **named constants**.

```java
// Basic Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Enum with fields and methods
enum Season {
    SPRING("Warm"), SUMMER("Hot"), AUTUMN("Cool"), WINTER("Cold");

    private final String description;

    Season(String desc) {
        this.description = desc;
    }

    public String getDescription() { return description; }
}

// Usage
Day today = Day.WEDNESDAY;
System.out.println(today);             // WEDNESDAY
System.out.println(today.ordinal());  // 2 (0-indexed position)
System.out.println(today.name());     // "WEDNESDAY"

// Enum in switch
switch (today) {
    case MONDAY:    System.out.println("Start of week!"); break;
    case FRIDAY:    System.out.println("Almost weekend!"); break;
    case SATURDAY:
    case SUNDAY:    System.out.println("Weekend!"); break;
    default:        System.out.println("Midweek");
}

// Get all enum values
for (Day d : Day.values()) {
    System.out.println(d.ordinal() + ": " + d);
}

System.out.println(Season.SUMMER.getDescription());  // "Hot"
```

---

## 🏷️ Annotations

> **Annotations** are metadata that provide information about the code to the compiler, JVM, or frameworks.

```
Why use Annotations?
  Provide metadata to compiler (suppress warnings)
  Instructions to build tools (Maven, Gradle)
  Runtime behavior (frameworks like Spring, JUnit)
  Code documentation
```

```
┌──────────────────────────────────────────────────────────────────────────────┐
│                       COMMON JAVA ANNOTATIONS                                │
├─────────────────────────────┬─────────────────────────────────────────────── │
│ Annotation                  │ Description                                    │
├─────────────────────────────┼─────────────────────────────────────────────── │
│ @Override                   │ Tells compiler this method overrides a parent  │
│ @Deprecated                 │ Marks element as outdated; compiler warns      │
│ @SuppressWarnings           │ Suppresses specific compiler warnings          │
│ @FunctionalInterface        │ Marks interface as functional (SAM)            │
│ @SafeVarargs                │ Suppresses varargs safety warnings             │
└─────────────────────────────┴─────────────────────────────────────────────── ┘
```

```java
class Parent {
    void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    @Override               // tells compiler: I am overriding a parent method
    void greet() {
        System.out.println("Hello from Child");
    }

    @Deprecated             // marks this as old/outdated
    void oldMethod() {
        System.out.println("This is deprecated, use newMethod() instead");
    }

    @SuppressWarnings("unchecked")   // suppresses unchecked cast warning
    void aMethod() {
        java.util.List list = new java.util.ArrayList();
        list.add("item");
    }
}

@FunctionalInterface
interface MyFunc {
    void execute();   // single abstract method
}
```

---

## 🔄 Functional Interface & Lambda Expressions

### Lambda Expression

> A **Lambda Expression** is a short, nameless function (anonymous function).
> Introduced in **Java 8**. Used with **Functional Interfaces**.

```
Lambda Syntax:
(parameters) -> expression
(parameters) -> { statements; }

HOW LAMBDA REDUCES CODE:

Without Lambda (Anonymous Inner Class):
  Runnable r = new Runnable() {
      @Override
      public void run() {
          System.out.println("Running!");
      }
  };

With Lambda (Java 8+):
  Runnable r = () -> System.out.println("Running!");
```

```java
import java.util.*;
import java.util.function.*;

// 1. Simple Lambda (no params, no return)
Runnable r = () -> System.out.println("Hello Lambda!");
r.run();

// 2. Lambda with one parameter
Consumer<String> printer = name -> System.out.println("Hello, " + name);
printer.accept("Asfin");

// 3. Lambda with two parameters and return
BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
System.out.println(adder.apply(5, 3));  // 8

// 4. Lambda with block body
Comparator<String> comp = (s1, s2) -> {
    return s1.length() - s2.length();
};

// 5. Lambda with collections — sorting
List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
names.sort((a, b) -> a.compareTo(b));
System.out.println(names);  // [Alice, Bob, Charlie]

// 6. Method Reference — even shorter!
names.forEach(System.out::println);  // :: is method reference

// 7. Custom Functional Interface with Lambda
@FunctionalInterface
interface Greet {
    String sayHello(String name);
}

Greet g = name -> "Hello, " + name + "!";
System.out.println(g.sayHello("Asfin"));  // "Hello, Asfin!"
```

**Built-in Functional Interfaces (java.util.function):**

```
┌──────────────────┬────────────────────┬───────────────────────────────────── │
│ Interface        │ Method             │ Description                           │
├──────────────────┼────────────────────┼───────────────────────────────────── │
│ Runnable         │ run()              │ No input, no output                   │
│ Supplier<T>      │ get()              │ No input, returns T                   │
│ Consumer<T>      │ accept(T)          │ Takes T, no output                    │
│ Function<T,R>    │ apply(T)           │ Takes T, returns R                    │
│ Predicate<T>     │ test(T)            │ Takes T, returns boolean              │
│ BiFunction<T,U,R>│ apply(T,U)         │ Takes T and U, returns R              │
└──────────────────┴────────────────────┴───────────────────────────────────── ┘
```

---

## ⚠️ Exception Handling

> **Exception** is an unwanted or unexpected event during program execution, disrupting normal flow.

```
EXCEPTION HIERARCHY:
                     ┌──────────────────┐
                     │    Throwable     │
                     └────────┬─────────┘
            ┌─────────────────┴────────────────────┐
            ▼                                       ▼
       ┌──────────┐                          ┌──────────┐
       │  Error   │  (unrecoverable)          │Exception │
       └──────────┘                          └──────┬───┘
  OutOfMemoryError                    ┌─────────────┴────────────┐
  StackOverflowError                  ▼                          ▼
                             ┌──────────────────┐    ┌─────────────────────┐
                             │ RuntimeException  │    │ Checked Exception   │
                             │ (Unchecked)       │    │ (must handle)       │
                             └──────────────────┘    └─────────────────────┘
                       NullPointerException           IOException
                       ArrayIndexOutOfBounds          FileNotFoundException
                       ClassCastException             SQLException
                       NumberFormatException          InterruptedException
                       ArithmeticException
```

```java
// Basic try-catch
try {
    int result = 10 / 0;         // Throws ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());  // "/ by zero"
} finally {
    System.out.println("This always runs!");  // always executes
}

// Multiple catch blocks
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[10]);   // ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of range!");
} catch (NullPointerException e) {
    System.out.println("Null pointer encountered!");
} catch (Exception e) {
    System.out.println("General exception: " + e);  // catch-all
}

// Multi-catch (Java 7+)
try {
    // risky code
} catch (java.io.IOException | java.sql.SQLException e) {
    System.out.println("IO or SQL Error: " + e.getMessage());
}

// throw keyword — manually throw an exception
public static void checkAge(int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Age must be 18+");
    }
    System.out.println("Access granted!");
}

// throws keyword — declare exception for caller to handle
public static void readFile(String path) throws java.io.IOException {
    java.io.FileReader fr = new java.io.FileReader(path);
}

// Custom Exception
class InsufficientFundsException extends Exception {
    private double amount;

    InsufficientFundsException(double amount) {
        super("Insufficient funds! Need " + amount + " more");
        this.amount = amount;
    }

    double getAmount() { return amount; }
}

// try-with-resources (Java 7+) — auto-closes resources
try (java.io.FileReader fr    = new java.io.FileReader("file.txt");
     java.io.BufferedReader br = new java.io.BufferedReader(fr)) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (java.io.IOException e) {
    e.printStackTrace();
}   // fr and br are automatically closed here!
```

---

## 🧵 Multithreading

> **Thread** is the smallest unit of execution within a process.
> **Multithreading** allows multiple tasks to run simultaneously.

```
SINGLE THREADING vs MULTITHREADING:

Single-Threaded:               Multi-Threaded:
  Task 1 ──────────►             Task 1 ─────────────────────►
  Task 2      ──────►            Task 2 ───────────────────►
  Task 3           ─►            Task 3 ────────────────────────────►
  (Sequential)                   (Concurrent/Parallel)
```

### Thread Lifecycle (States)

```
Thread Life Cycle:

   new Thread()     start()
   ┌───────┐  ──► ┌──────────┐  ──────────────────►  ┌─────────────┐
   │  NEW  │       │ RUNNABLE │                        │  RUNNING   │
   └───────┘       └──────────┘  ◄──────────────────   └──────┬──────┘
                                                               │
                                     sleep()/wait()/I/O        │
                                    ┌──────────────────────┐   │  run() ends
                                    │  BLOCKED / WAITING  │   │
                                    │  TIMED_WAITING       │   ▼
                                    └──────────────────────┘ ┌──────┐
                                                             │DEAD  │
                                                             └──────┘
```

**Thread States:**
| State | Description |
|-------|-------------|
| **NEW** | Thread created but `start()` not called yet |
| **RUNNABLE** | Thread ready to run, waiting for CPU |
| **RUNNING** | Thread currently executing |
| **BLOCKED** | Thread waiting to acquire a lock |
| **WAITING** | Thread waiting indefinitely (wait(), join()) |
| **TIMED_WAITING** | Thread waiting for specified time (sleep(), wait(time)) |
| **TERMINATED** | Thread has finished execution |

### Creating Threads

```java
// METHOD 1: Extending Thread class
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " — " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

// METHOD 2: Implementing Runnable interface (PREFERRED)
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " — " + i);
        }
    }
}

// METHOD 3: Lambda (Java 8+)
Runnable task = () -> {
    for (int i = 1; i <= 5; i++) {
        System.out.println("Lambda Thread — " + i);
    }
};

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Method 1
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");
        t1.start();
        t2.start();

        // Method 2
        Thread t3 = new Thread(new MyRunnable(), "Thread-C");
        t3.start();

        // Thread Priority
        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.MIN_PRIORITY);   // 1
        t3.setPriority(Thread.NORM_PRIORITY);  // 5 (default)

        t1.join();  // Wait for t1 to finish before continuing
        System.out.println("All done!");
    }
}
```

### Thread Synchronization

```java
// Race Condition — problem (multiple threads modifying shared data)
class Counter {
    int count = 0;
    void increment() { count++; }   // NOT thread-safe!
}

// Solution: synchronized keyword
class SafeCounter {
    int count = 0;

    synchronized void increment() {   // only one thread at a time
        count++;
    }

    // Synchronized block (finer control)
    void add(int n) {
        synchronized (this) {
            count += n;
        }
    }
}
```

---

## 📦 Packages

> A **Package** is a namespace that organizes related classes and interfaces into a directory hierarchy.

```
PACKAGE STRUCTURE:
com/
└── company/
    └── project/
        ├── model/
        │   └── Student.java
        ├── service/
        │   └── StudentService.java
        └── Main.java
```

```java
// 1. Declare a package (must be first line of file)
package com.asfin.myapp;

// 2. Import specific class
import java.util.Scanner;

// 3. Import all classes from package
import java.util.*;

// 4. Fully qualified name (no import needed)
java.util.Scanner sc = new java.util.Scanner(System.in);
```

**Types of Packages:**
```
┌─────────────────────────────────────────────────────────────────────┐
│                       PACKAGE TYPES                                 │
├─────────────────────────┬─────────────────────────────────────────  │
│ Built-in Packages       │ User-defined Packages                      │
├─────────────────────────┼─────────────────────────────────────────  │
│ java.lang  (auto-import)│ Packages you create for your project       │
│ java.util               │ e.g., com.mycompany.myapp.model            │
│ java.io                 │                                            │
│ java.net                │ Step 1: declare: package com.example;      │
│ java.sql                │ Step 2: compile: javac -d . File.java      │
│ java.awt                │ Step 3: run: java com.example.ClassName    │
│ javax.swing             │                                            │
└─────────────────────────┴─────────────────────────────────────────  ┘
```

---

## 🖼️ Java Swing & GUI

> **Java Swing** is a GUI toolkit for building desktop applications. Built on top of AWT.

**MVC Architecture (Model-View-Controller):**
```
┌─────────────────────────────────────────────────────────────────────────────┐
│                         MVC Architecture                                    │
│                                                                             │
│  ┌─────────┐   User Input    ┌────────────┐   Updates    ┌──────────────┐  │
│  │  VIEW   │  ────────────►  │ CONTROLLER │  ──────────► │   MODEL      │  │
│  │  (GUI)  │                 │  (Logic)   │              │   (Data)     │  │
│  │  JFrame │  ◄────────────  │            │  ◄──────────  │   Objects    │  │
│  │  JPanel │   Renders       └────────────┘   Notifies   └──────────────┘  │
│  └─────────┘                                                                │
└─────────────────────────────────────────────────────────────────────────────┘
```

```java
import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        // 1. JFrame — Main Window
        JFrame frame = new JFrame("My Java App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // 2. JLabel — Text Label
        JLabel label = new JLabel("Enter your name:");

        // 3. JTextField — Text Input
        JTextField textField = new JTextField(15);

        // 4. JButton — Clickable Button
        JButton button = new JButton("Greet");

        // 5. JTextArea — Multi-line text
        JTextArea area = new JTextArea(5, 20);

        // 6. Event Handling (ActionListener via Lambda)
        button.addActionListener(e -> {
            String name = textField.getText();
            area.setText("Hello, " + name + "!");
        });

        // 7. Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(new JScrollPane(area));

        frame.setVisible(true);  // Show the window
    }
}
```

**Common Swing Components:**

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                        SWING COMPONENTS                                     │
├────────────────┬──────────────────────────────────────────────────────────  │
│ Component      │ Description                                                │
├────────────────┼──────────────────────────────────────────────────────────  │
│ JFrame         │ Main application window                                    │
│ JPanel         │ Container for grouping components                          │
│ JLabel         │ Displays text or image                                     │
│ JButton        │ Clickable button                                           │
│ JTextField     │ Single-line text input                                     │
│ JTextArea      │ Multi-line text input                                      │
│ JCheckBox      │ Toggle on/off                                              │
│ JRadioButton   │ Select one from group (with ButtonGroup)                   │
│ JComboBox      │ Dropdown list                                              │
│ JList          │ Scrollable list of items                                   │
│ JTable         │ Tabular data display                                       │
│ JMenuBar       │ Top menu bar                                               │
│ JDialog        │ Dialog box (popup)                                         │
│ JScrollPane    │ Adds scrollbars to components                              │
│ JProgressBar   │ Shows progress percentage                                  │
└────────────────┴──────────────────────────────────────────────────────────  ┘
```

---

## 🗂️ File I/O (Input & Output Streams)

```
JAVA I/O STREAM HIERARCHY:

Byte Streams (binary data):
  InputStream  → FileInputStream, BufferedInputStream, DataInputStream
  OutputStream → FileOutputStream, BufferedOutputStream, PrintStream

Character Streams (text data):
  Reader → FileReader, BufferedReader, InputStreamReader
  Writer → FileWriter, BufferedWriter, PrintWriter
```

```java
import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        // --- WRITING to a File ---
        try (FileWriter fw = new FileWriter("output.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Hello, World!");
            bw.newLine();
            bw.write("Java File I/O is easy!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- READING from a File ---
        try (FileReader fr = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- File operations with java.io.File ---
        File file = new File("output.txt");
        System.out.println("Exists: "    + file.exists());
        System.out.println("Name: "      + file.getName());
        System.out.println("Path: "      + file.getAbsolutePath());
        System.out.println("Size: "      + file.length() + " bytes");
        System.out.println("Is File: "   + file.isFile());
        System.out.println("Is Dir: "    + file.isDirectory());

        // Create directory
        File dir = new File("myFolder");
        dir.mkdir();
    }
}
```

---

## 🔄 Serialization & Deserialization

> **Serialization** — Converting a Java object into a **byte stream** (for storing/sending).
> **Deserialization** — Reconstructing the Java object from a **byte stream**.
> Class must implement `java.io.Serializable` (a Marker Interface).

```
Object → (Serialization) → Byte Stream → (Deserialization) → Object
  RAM                        File/Network                      RAM
```

```java
import java.io.*;

// Must implement Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;  // version control
    String name;
    int age;
    transient String password;  // 'transient' — NOT serialized

    Person(String n, int a, String p) {
        name = n; age = a; password = p;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("Asfin", 20, "secret123");

        // SERIALIZATION — save object to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(p);
            System.out.println("Object serialized!");
        }

        // DESERIALIZATION — read object from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p2 = (Person) ois.readObject();
            System.out.println("Name: " + p2.name);        // "Asfin"
            System.out.println("Age: "  + p2.age);         // 20
            System.out.println("Password: " + p2.password); // null (transient!)
        }
    }
}
```

---

## 📚 Collections API

> **Collections Framework** provides classes and interfaces for storing and manipulating groups of objects.

```
COLLECTIONS HIERARCHY:
                     ┌──────────────┐
                     │  Collection  │
                     └──────┬───────┘
       ┌───────────────────┼────────────────────┐
       ▼                   ▼                     ▼
    ┌──────┐           ┌──────┐             ┌────────┐
    │ List │           │  Set │             │ Queue  │
    └──┬───┘           └──┬───┘             └────────┘
  ┌────┴────┐         ┌───┴────┐
ArrayList  LinkedList HashSet  TreeSet
  Vector   Stack      LinkedHashSet

                     ┌──────────┐
                     │   Map    │  (key-value pairs)
                     └────┬─────┘
                 ┌────────┴──────────┐
              HashMap           TreeMap
            LinkedHashMap      Hashtable
```

```java
import java.util.*;

// LIST — ordered, allows duplicates
List<String> list = new ArrayList<>();
list.add("Apple"); list.add("Banana"); list.add("Apple");
System.out.println(list);  // [Apple, Banana, Apple]

// SET — unordered, no duplicates
Set<String> set = new HashSet<>();
set.add("Java"); set.add("Python"); set.add("Java");
System.out.println(set);  // [Python, Java] — no duplicate

// MAP — key-value pairs
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 90);
map.put("Bob",   85);
map.put("Charlie", 92);
System.out.println(map.get("Bob"));  // 85
map.forEach((k, v) -> System.out.println(k + " = " + v));

// Sorting
List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9, 3);
Collections.sort(nums);               // [1, 2, 3, 5, 8, 9]
nums.sort(Comparator.reverseOrder()); // [9, 8, 5, 3, 2, 1]
```

---

## 🌊 Stream API

> **Stream API** (Java 8+) provides functional-style operations on sequences of elements.

```java
import java.util.*;
import java.util.stream.*;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// filter — select elements matching condition
List<Integer> evens = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
System.out.println(evens);  // [2, 4, 6, 8, 10]

// map — transform each element
List<Integer> squares = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());
System.out.println(squares);  // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

// filter + map + sorted + collect
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
List<String> longNames = names.stream()
    .filter(name -> name.length() > 4)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
System.out.println(longNames);  // [ALICE, CHARLIE, DAVID]

// reduce — combine all elements into one value
int sum = numbers.stream().reduce(0, Integer::sum);
System.out.println("Sum: " + sum);  // 55

// count, min, max
long count = numbers.stream().filter(n -> n > 5).count();  // 5
Optional<Integer> max = numbers.stream().max(Integer::compareTo);
```

---

## 🔗 JDBC — Java Database Connectivity

> **JDBC** is a Java API that enables Java applications to interact with relational databases.

```
JDBC ARCHITECTURE:
┌──────────────────────────────────────────────────────────────┐
│                    JAVA APPLICATION                           │
│                                                              │
│  ┌──────────┐  SQL Query   ┌─────────────┐  native call    │
│  │  JDBC    │  ──────────► │ JDBC Driver │  ─────────────► │
│  │   API    │              │  (Type 4)   │   Database       │
│  └──────────┘  Result Set  └─────────────┘   (MySQL etc.)  │
│                ◄──────────                                   │
└──────────────────────────────────────────────────────────────┘
```

**JDBC Steps:**
```java
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // STEP 1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // STEP 2: Establish Connection
        String url  = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "password";
        Connection conn = DriverManager.getConnection(url, user, pass);

        // STEP 3: Create Statement
        Statement stmt = conn.createStatement();

        // STEP 4: Execute Query
        stmt.executeUpdate("INSERT INTO students(name,age) VALUES('Asfin',20)");

        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            int id      = rs.getInt("id");
            String name  = rs.getString("name");
            int age     = rs.getInt("age");
            System.out.printf("ID: %d, Name: %s, Age: %d%n", id, name, age);
        }

        // STEP 5: PreparedStatement (PREFERRED — prevents SQL Injection)
        String sql = "INSERT INTO students(name, age) VALUES(?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "Riya");
        ps.setInt(2, 22);
        ps.executeUpdate();

        // STEP 6: Close resources
        rs.close(); stmt.close(); ps.close(); conn.close();
    }
}
```

| Statement | Use When |
|-----------|----------|
| `Statement` | Static SQL (no parameters) |
| `PreparedStatement` | SQL with parameters (safer, faster) |
| `CallableStatement` | Stored procedures |

---

## 🌐 Servlets & JSP

> **Servlet** is a Java class that handles HTTP requests/responses on a web server.
> **JSP (JavaServer Pages)** creates dynamic web pages using Java embedded in HTML.

```
CLIENT-SERVER FLOW:
Browser → HTTP Request → Web Server (Tomcat) → Servlet/JSP
Browser ← HTTP Response ← Web Server ← Servlet/JSP
```

**Servlet Lifecycle:**
```
init() once  →  service() per request  →  doGet()/doPost()  →  destroy()
(startup)       (for each request)        (handle request)     (shutdown)
```

```java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");

        out.println("<html><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String data = req.getParameter("data");
        // Process and respond...
    }
}
```

---

## 🌍 REST API & Web Services

> **REST (Representational State Transfer)** is an architectural style for designing web APIs using HTTP.

```
REST API HTTP METHODS:
┌──────────────────────────────────────────────────────────────────┐
│  Method   │ CRUD       │ Description           │ URL Example     │
├───────────┼────────────┼───────────────────────┼─────────────────┤
│  GET      │ Read       │ Retrieve resource     │ /api/users      │
│  POST     │ Create     │ Create new resource   │ /api/users      │
│  PUT      │ Update     │ Update whole resource │ /api/users/1    │
│  PATCH    │ Update     │ Partial update        │ /api/users/1    │
│  DELETE   │ Delete     │ Remove resource       │ /api/users/1    │
└──────────────────────────────────────────────────────────────────┘

HTTP Status Codes:
  2xx Success:  200 OK, 201 Created, 204 No Content
  3xx Redirect: 301 Moved, 302 Found
  4xx Client:   400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found
  5xx Server:   500 Internal Server Error, 503 Service Unavailable
```

```java
// Spring Boot REST Controller
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }
}
```

---

## 🗺️ ORM Tools

> **ORM (Object Relational Mapping)** maps Java objects to database tables automatically, eliminating raw SQL.

```
WITHOUT ORM (JDBC — Manual):        WITH ORM (Hibernate/JPA):
  String sql =                         @Entity
  "INSERT INTO users                   @Table(name = "users")
   (name, age)                         class User {
   VALUES (?, ?)";           VS          @Id @GeneratedValue
  ps.setString(1, name);                 Long id;
  ps.setInt(2, age);                     String name;
  ps.executeUpdate();                    int age;
                                       }
                                       // Just call:
                                       repo.save(user);
```

```java
import javax.persistence.*;

// JPA Entity (Hibernate ORM)
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(unique = true)
    private String email;

    // Constructors, Getters, Setters...
}

// Spring Data JPA Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String name);
    List<Student> findByAgeGreaterThan(int age);
    Optional<Student> findByEmail(String email);
}
```

---

## 📦 Maven

> **Maven** is a **build automation and project management tool**. Manages dependencies, compilation, testing, and packaging.

```
POM.XML STRUCTURE:
  <?xml version="1.0" encoding="UTF-8"?>
  <project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.asfin</groupId>       ← your company/group ID
    <artifactId>myapp</artifactId>     ← project name
    <version>1.0.0</version>           ← version
    <packaging>jar</packaging>

    <dependencies>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.2.0</version>
      </dependency>
    </dependencies>
  </project>
```

**Maven Commands:**
```bash
mvn clean              # Delete target/ folder
mvn compile            # Compile source code
mvn test               # Run unit tests
mvn package            # Create JAR/WAR
mvn install            # Install to local repo (~/.m2)
mvn clean install      # Clean + install (common build)
mvn spring-boot:run    # Run Spring Boot app
mvn dependency:tree    # Show dependency hierarchy
```

**Maven Lifecycle:**
```
validate → compile → test → package → verify → install → deploy
```

---

## 🐘 Gradle

> **Gradle** is a modern, flexible build tool using **Groovy or Kotlin DSL**. Faster than Maven.

**build.gradle (Groovy DSL):**
```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.2.0'
}

group = 'com.asfin'
version = '1.0.0'
sourceCompatibility = '21'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.mysql:mysql-connector-j'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

**Gradle Commands:**
```bash
./gradlew clean          # Clean build
./gradlew build          # Compile + test + package
./gradlew test           # Run tests
./gradlew bootRun        # Run Spring Boot app
./gradlew dependencies   # Show dependencies
```

---

## 🧪 JUnit Testing

> **JUnit** is the standard unit testing framework for Java.

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach         // Runs before each test
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach          // Runs after each test
    void tearDown() {
        calc = null;
    }

    @Test               // Marks method as a test
    void testAdd() {
        assertEquals(8, calc.add(5, 3));         // 5 + 3 = 8
    }

    @Test
    void testDivide() {
        assertEquals(4.0, calc.divide(8, 2));    // 8 / 2 = 4
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
            () -> calc.divide(10, 0));           // Should throw
    }

    @Test
    @Disabled("Not implemented yet")             // Skip this test
    void testMultiply() { }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEven(int number) {
        assertTrue(number % 2 == 0);
    }
}
```

**JUnit Assertions:**
```java
assertEquals(expected, actual)          // values are equal
assertNotEquals(unexpected, actual)     // values are not equal
assertTrue(condition)                   // condition is true
assertFalse(condition)                  // condition is false
assertNull(object)                      // object is null
assertNotNull(object)                   // object is not null
assertThrows(ExceptionClass, lambda)    // lambda throws exception
assertArrayEquals(expected, actual)     // arrays are equal
```

---

## 📁 Git & Version Control

> **Git** is a distributed **version control system** for tracking changes in source code.

```bash
# Initial Setup
git config --global user.name  "Mohammad Asfin"
git config --global user.email "asfin@example.com"

# Start a new repo
git init                         # Initialize empty repo
git clone <url>                  # Clone existing repo

# Daily Workflow
git status                       # Check what's changed
git add .                        # Stage all changes
git add filename.java            # Stage specific file
git commit -m "Add login feature"# Commit with message
git push origin main             # Push to remote (GitHub)
git pull origin main             # Pull latest from remote

# Branching
git branch                       # List branches
git branch feature-login         # Create new branch
git checkout feature-login       # Switch to branch
git checkout -b hotfix           # Create + switch in one step
git merge feature-login          # Merge branch into current
git branch -d feature-login      # Delete merged branch

# Other Useful Commands
git log --oneline                # Compact commit history
git diff                         # Show unstaged changes
git stash                        # Temporarily save changes
git stash pop                    # Restore stashed changes
git reset --soft HEAD~1          # Undo last commit (keep changes)
git reset --hard HEAD~1          # Undo last commit (discard changes)
```

**Git Workflow:**
```
Working Dir → git add → Staging Area → git commit → Local Repo → git push → Remote (GitHub)
```

---

## 🏗️ DSA — Data Structures & Algorithms

> **DSA** is the study of organizing and processing data efficiently.

```
DATA STRUCTURES:
  Linear:    Array, LinkedList, Stack, Queue
  Non-Linear: Tree, Graph
  Hash-Based: HashMap, HashSet

ALGORITHMS:
  Sorting:   Bubble, Selection, Insertion, Merge, Quick Sort
  Searching: Linear Search, Binary Search
  Traversal: DFS, BFS (Graph/Tree)
  Other:     Dynamic Programming, Greedy, Divide & Conquer
```

```java
// LinkedList implementation
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; next = null; }
}

class MyLinkedList {
    Node head;

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

// Stack (LIFO)
Stack<Integer> stack = new Stack<>();
stack.push(1); stack.push(2); stack.push(3);
System.out.println(stack.pop());    // 3 (Last In, First Out)
System.out.println(stack.peek());   // 2 (view top without removing)

// Queue (FIFO)
Queue<String> queue = new LinkedList<>();
queue.offer("Alice"); queue.offer("Bob"); queue.offer("Charlie");
System.out.println(queue.poll());   // "Alice" (First In, First Out)

// Binary Search
int[] sorted = {1, 3, 5, 7, 9, 11, 13};
int target = 7;
int low = 0, high = sorted.length - 1;
while (low <= high) {
    int mid = (low + high) / 2;
    if (sorted[mid] == target) {
        System.out.println("Found at index: " + mid);  // 3
        break;
    } else if (sorted[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}
```

---

<div align="center">

## 📊 Quick Reference Summary

| Topic | Key Concept |
|-------|-------------|
| **JDK/JRE/JVM** | JDK = Develop + Run, JRE = Run only, JVM = Executes bytecode |
| **Datatypes** | 8 primitives: byte, short, int, long, float, double, char, boolean |
| **OOP Pillars** | Encapsulation, Abstraction, Inheritance, Polymorphism |
| **Access** | private < default < protected < public |
| **Interface** | implements (class), extends (interface-to-interface) |
| **Lambda** | `(params) -> expression` — requires Functional Interface |
| **Exception** | try-catch-finally, throw, throws, custom exceptions |
| **Threads** | extend Thread OR implement Runnable (preferred) |
| **Collections** | List (ordered), Set (no dups), Map (key-value) |
| **Streams** | filter, map, reduce, collect — functional pipeline |
| **JDBC** | Load Driver → Connect → Statement → Execute → Close |
| **Maven** | pom.xml dependency management, mvn clean install |

---

### Happy Learning Java!

**Author:** Mohammad Asfin &nbsp;|&nbsp; **Version:** 1.0.0 &nbsp;|&nbsp; **Last Updated:** July 2026

[![GitHub](https://img.shields.io/badge/GitHub-Mohammad--Asfin-black?style=flat-square&logo=github)](https://github.com/Mohammad-Asfin)

> *"The best way to learn programming is to write programs."* — Brian Kernighan

</div>
