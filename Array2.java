import java.util.Scanner;

public class Array2 {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("The elements of the array are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}