
class Student{
    public String name;
    public int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return "Name is: "+name+" and marks are: "+marks;
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        Student[]myStudents=new Student[]{
            new Student("komal",90),
            new Student("Rahul",80),
            new Student("Raj",70),
            new Student("Riya",60),
            new Student("Rohan",50)

        };
        for(Student s:myStudents){
            System.out.println(s);  
        }
        
    }
}