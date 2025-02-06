interface Display{
      String show(String msg);

}

public class LambdawithPara {
    public static void main(String []args){
        Display d1=(msg)->{
            return "hello"+msg;
        };
        d1.show("world");
        System.out.println(d1.show("world"));
    }
    
}
