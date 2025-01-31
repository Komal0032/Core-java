class person{
    private int age;
    //getter method
    public int getAge(){
        return age;
    }
    //setter method
    public void setAge(int age){
        this.age=age;
    }
}

 class Encapulation2 {
    public static void main(String args[]){
        person obj=new person();
        //chnge age using setter
        obj.setAge(20);
        //access age using getter
        System.out.println("My age is:"+obj.getAge());
    }
    
}
