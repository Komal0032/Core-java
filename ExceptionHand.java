
public class ExceptionHand {
    public static void main(String[] args) {
        try {
            //String s=null;
            String s="seed";
            System.out.println(s.charAt(0));
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block");//finally block will always execute even when there is an exception
        }
    }
}