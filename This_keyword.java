 class Employee {
    int eid=10;
    String ename="komal";
    int salary=30000;

    public void getdata(int eid,String ename,int salary){
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
    }
    public void display(){
        System.out.println(" name= "+ename+"\t eid="+eid+"\t salary="+salary);    
    }
  

    }
    public class This_keyword { 
    public static void main(String args[]){
        Employee obj1=new  Employee();
        obj1.getdata(2, "komal", 50000);
        obj1.display();
    }
}
 
