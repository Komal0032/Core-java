public class MethodOverloading {
    private String name;

    public void display(){
        System.out.println("This is method Overloading");
    }

    public void display(String n){
        name = n;
        System.out.println("name of user: " + name);
    }

    public static void main(String args[]){
        MethodOverloading obj = new MethodOverloading();
        obj.display();
        obj.display("Komal");
    }
}
