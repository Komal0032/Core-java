class data1{
    private String name;
    //getter method
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class PrivateAccessSpecifier {
    public static void main(String args[]){
        data1 d=new data1();
        //access the private variable using the getter 
        d.setName("Private access Specifier");
        System.out.println(d.getName());
    }
    
}
