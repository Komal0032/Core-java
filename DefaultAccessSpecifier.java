public class DefaultAccessSpecifier {
    void display(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        DefaultAccessSpecifier obj=new DefaultAccessSpecifier();
        obj.display();
    }
}
