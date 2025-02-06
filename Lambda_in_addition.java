
interface Addition{
    int add(int a,int b);
}
public class Lambda_in_addition {
    public static void main(String[]args){
        Addition ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));
       
    }
}
