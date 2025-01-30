abstract class Abstractanimal {
    abstract void makesound();
    public void mymethod(){
        System.out.println("creating regular method");
    }
    public void eat(){
        System.out.println("i can eat");
    }
}
class reDog extends  Abstractanimal {
    //provid implementation of abstract method
    public void makesound(){
        System.out.println("Bark bark");
    }
}
public class Abstract {
    public static void main(String args[]){
        //too auto generated method stub
        reDog d1=new reDog();
        d1.makesound();
        d1.eat();
        

    }
}
