
public class ThrowExc {
    static void show(){
        try{
               int a=5/0;
               throw new ArithmeticException("divide by zero");
        }
        catch( ArithmeticException e){
            System.out.println("exception caught");
        }
    }
    public static void main(String args[]){
        show();
    }
    }

