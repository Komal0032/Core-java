class A{
    public void show(){
        System.out.println("this is a class method");
    }
}
class B extends A{
    public void myshow(){
        System.out.println("this is B class method");
    }
}

class C extends B{
    public void showc(){
        System.out.println("this is c class method");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]){
        C obj=new C();
        obj.show();
        obj.myshow();
        obj.showc();
    }
    
}
