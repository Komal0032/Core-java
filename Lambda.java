
interface lambda1{
    void display();
}
public class Lambda {
    public static void main(String[]args){
        lambda1 l1=()->System.out.println("this is th zero-parameter lambda experssion");
        l1.display();
    }
    
}
