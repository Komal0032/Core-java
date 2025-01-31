interface DefaultEx{
    default void display(){
        System.out.println("this is default method in interface");
    }
    default void add(int a, int b) {
        System.out.println(a + b);
    }
    
} 
public class DefaultMethodinInterface implements DefaultEx {
    public static void main(String args[]){
        DefaultMethodinInterface d1 = new DefaultMethodinInterface();
        d1.display();
        d1.add(20,20 );
    }
    
}
