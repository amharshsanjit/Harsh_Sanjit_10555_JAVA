# Harsh_Sanjit_10555_JAVA

# ☕ Java Control Statements – If-Else & Loops

This repository contains basic Java programs demonstrating:

- ✅ If Statement
- ✅ If-Else Statement
- ✅ Else-If Ladder
- ✅ Nested If
- ✅ For Loop
- ✅ While Loop
- ✅ Do-While Loop

# ☕ Java Control Statements Demo

## 👨‍💻 Author: Harsh Sanjit

This repository contains a single Java program that demonstrates:

- ✅ If-Else Statement  
- ✅ For Loop  
- ✅ While Loop  
- ✅ Do-While Loop  

It is designed for beginners who are learning Java basics.

---

## 📌 Program Description

The program:

- Prints the author's name
- Checks whether a number is Even or Odd using If-Else
- Prints numbers using:
  - For Loop
  - While Loop
  - Do-While Loop

---

## 💻 Java Code

```java
/*
 Program: Java If-Else and Loop Example
 Author: Harsh Sanjit
*/

public class ControlStatementsDemo {

    public static void main(String[] args) {

        System.out.println("Author: Harsh Sanjit");

        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        int j = 5;
        while (j >= 1) {
            System.out.println("While Loop: " + j);
            j--;
        }

        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= 3);
    }
}
