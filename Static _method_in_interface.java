
//ststic method in interface
interface DefaultExample{
    static void display(){
        System.out.println("this is static method ex");
    }
    static void  add(int a, int b){
        System.out.println(a+b);
    }
}
public class Static_method_in_interface  implements  DefaultExample{
    public static void main(String args[]){
          DefaultExample.display();
          DefaultExample.add(10,20 );
    }
    
}
