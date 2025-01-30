public class ADD_using_Overloading {
    int add;
    public void addition(int a,int b){
        add=a+b;
        System.out.println("Addition of two no is="+add);
    }
    public void  addition(int a,int b,int c){
        add=a+b+c;
        System.out.println("Addition of three int no is="+add);

    }
    public void addition(double a, double b){
        System.out.println("Addition of two float no is="+(a+b));
    }
    public static void main(String args[]){
        ADD_using_Overloading obj =new ADD_using_Overloading();
        obj.addition(0,8);
        obj.addition(3,5,7);
        obj.addition(2.2,6.1);
    }
}
