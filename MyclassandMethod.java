
class Object {
    /*int age=10;
     String name="John";
     String city="New York";
 
     public static void main(String[] args) {
         Object s1=new Object();
         System.out.println(s1.age);
         System.out.println(s1.name);
         System.out.println(s1.city);
     }
      //return type is void
     public void myMethod(){
 
         System.out.println("This is a method in Object class");
 
     }
     public static void main(String[] args) {
         Object s1=new Object();
         System.out.println(s1.age);
         System.out.println(s1.name);
         System.out.println(s1.city);
         s1.myMethod();
     }*/
   //creating to different objects
     int age;
     String name;
     
     public void getData(int a,String n){
        age=a;
        name=n;
     }
     public void DisplayData(){
         System.out.println("age="+age+" name="+name);
     }
 }
 public class MyclassandMethod {
     public static void main(String[] args) {
         Object s1=new Object();
         Object s2=new Object();
         s1.getData(10,"John");
         s2.getData(20,"Smith");
         s1.DisplayData();
         s2.DisplayData();
     }
 
    }