public class use_this_in_gettersetter {
    String name;
     //setter method
     void setname(String name){
        this.name=name;
     }
     //getter method
      String getname(){
         return this.name;
     }
     public static void main(String args[]){
        use_this_in_gettersetter obj=new use_this_in_gettersetter();
        obj.setname("Komal jadhav");
        System.out.println("name="+obj.getname());
     }
}
