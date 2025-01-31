 //instanceof operator is used to test whether an object is an instance of a specified type (class or sub - class or visual interface).
 class Parent{}
 class Child1 extends Parent{}
 class Child2 extends Parent{}
 class InstanceOperator1 {
    public static void main(String args[]){
        Parent p=new Parent();
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        
        System.out.println("c1 is instance of parent:"+ (c1 instanceof Parent));//true
        System.out.println("c2 is instance of parent:"+(c2 instanceof Parent));//true
        System.out.println("p is instance of Child1:"+(p instanceof Child1));//false
        System.out.println("p is instance of child2:"+(p instanceof Child2));//false
        
        p=c1;
        System.out.println("p  instance of Child1:"+(p instanceof Child1));//true
        System.out.println("p is instance of Child2:"+(p instanceof Child2));//false

        p=c2;
        System.out.println("p  instance of Child1:"+(p instanceof Child1));//false
        System.out.println("p is instance of Child2:"+(p instanceof Child2));//true

    }
    
}
