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

---

## 📌 1️⃣ If Statement Example

```java
public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        }
    }
}

---

## 📌 2️⃣ If-Else Example
public class IfElseExample {
    public static void main(String[] args) {
        int number = -5;

        if (number >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}

##
public class ElseIfExample {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed to enter");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Not allowed");
        }
    }
}

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
    }
}


---

If you want, I can also give you:
- 🔥 A more professional README (for resume/GitHub portfolio)
- 🎯 With folder structure
- 📊 With flowchart diagrams
- 🧠 With practice questions included
