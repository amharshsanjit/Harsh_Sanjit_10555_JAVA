//Check pass or fail
import  java.util.Scanner;

public class marks{
    public static void main(String[] args) {
        System.out.print("Enter your marks (0 to 100) = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=40 && a<=100){
            System.out.println("You are Pass ");
        }
        else if(a>100){
            System.err.println("Invalid marks");
        }
        else{
            System.out.println("You are Fail ");
        }
    }
}

/* 
import  java.util.Scanner;

public class marks{
    public static void main(String[] args) {
        System.out.print("Enter your marks (0 to 100) = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=40 && a<=100){
            System.out.println("You are Pass ");
        }
        else if(a>100){
            System.err.println("Invalid marks");
        }
        else{
            System.out.println("You are Fail ");
        }
    }
}



import  java.util.Scanner;

public class marks{
    public static void main(String[] args) {
        System.out.print("Enter your marks (0 to 100) = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=40 && a<=100){
            System.out.println("You are Pass ");
        }
        else if(a>100){
            System.err.println("Invalid marks");
        }
        else{
            System.out.println("You are Fail ");
        }
    }
} */