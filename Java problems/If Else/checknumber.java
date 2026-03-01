//check number is postive , negatrive or zero
import java.util.Scanner;

public class checknumber{
    public static void main(String[]args){
        System.err.print("Write a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Number is postive");
        }
        else if(a<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}



/* import java.util.Scanner;

public class checknumber{
    public static void main(String[]args){
        System.err.print("Write a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Number is postive");
        }
        else if(a<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}





import java.util.Scanner;

public class checknumber{
    public static void main(String[]args){
        System.err.print("Write a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Number is postive");
        }
        else if(a<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
} */