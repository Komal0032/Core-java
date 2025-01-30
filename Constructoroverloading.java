public class Constructoroverloading {

    Constructoroverloading(){
        System.out.println("this is default constructor");

    }

    Constructoroverloading(int id){
        System.out.println(id);

    }
    public static void main(String args[]){
        Constructoroverloading obj1=new Constructoroverloading(1);
        Constructoroverloading obj2=new Constructoroverloading(2);
    }
}
