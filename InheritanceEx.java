
class person{
    public void display(){
        System.out.println("person has its own property");
    }
}

//child class derived sub class
class employee extends person{
     void designation(){
    System.out.println("employee of organization");
}
}
public class InheritanceEx {
    public static void main(String args[]){
        employee e1=new employee();
        e1.display();//parent class method 
        e1.designation();//child class method
        
    }
    
}
