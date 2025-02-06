interface one{
    default void print(){
      System.out.println("this is default method");
    }
}
//function interface contain only one abstract method
interface two extends one{
    void display(String msg);
}
public class FunctionlInterface implements two {
    public void display(String msg){
    System.out.println(msg);
}
public static void main(String[] args){
    FunctionlInterface f1=new FunctionlInterface();
    f1.display("Hello");
    f1.print();

}
}
