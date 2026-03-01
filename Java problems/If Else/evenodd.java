// check even odd
import java.util.Scanner;

public class evenodd{
    public static void main(String[]args){
        System.out.print("Write a number=");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       if(a%2==0){
        System.out.println("EVEN");
       }
       else{
        System.out.println("ODD");
       }
    }
}

/*public class evenodd{
    public static void main(String[]args){
        System.out.print("Write a number=");
        Scanner gn = new Scanner(System.in);
        int b = gn.nextInt();
        if(b%2==0){
            System.out.println("EVEN");
        }
        else{
            System.err.println("ODD");
        }
    }
}


public class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.err.println("even");
        }
        else{
            System.err.println("odd");
        }
    }
}*/