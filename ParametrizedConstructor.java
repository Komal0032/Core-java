

//Java Program to create and call a Parametrized Constructor 
class ParametrizedConstructor{  
    int id;
    String name;
    //creating a Parametrized Constructor  
    ParametrizedConstructor(int i,String n){
        System.out.println("constructor is created");

        
        id=i;
        name=n;

    }  
    public void Display()//regular method
    {
        System.out.println("id="+id+ "name="+name);
    }
    //main method  
    public static void main(String args[]){  
    //calling a Parametrized Constructor  
    ParametrizedConstructor b=new ParametrizedConstructor(1,"komal");
    b.Display();  
    }  
    }  
    