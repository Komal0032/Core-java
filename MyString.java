
import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        String s1="hello java string";
        System.out.println(s1);
        int length  = s1.length();
        System.out.println("Length of string is : "+length);
        String mystr="seed";
        int length1=mystr.length();
        System.out.println("Length of string is : "+length1);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s2=sc.next();
        System.out.println("length of string is : "+s2.length());

    }
    
}