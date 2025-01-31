import java.util.Scanner;


public class OperatorOverloading {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();

        System.out.println("Enter the another string");
        String s2=sc.next();

        System.out.println("Enter the another string");
        String s3=sc.next();

        //plus operator concatenates the two String
        System.out.println(s1+""+s2);

        System.out.println("Enter the number");
        int n1=sc.nextInt();

        System.out.println("Enter the another number");
        int n2=sc.nextInt();

        System.out.println("Addition of two number is:"+(n1+n2));
      
        
    }
    
}
