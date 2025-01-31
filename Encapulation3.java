//read only encapulation
class student{
    private String name="komal";
    //getter method for name
    public String getname(){
        return name;
    }
}


public class Encapulation3 {
    public static void main(String args[]){
        //java class to test the encapulation class
        //creating instance of the encapulation class
     student s=new student();
     s.getname();
     System.out.println(s.getname());
    }
    
}
