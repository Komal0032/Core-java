
    class PublicEx{
        public int count;

     public   void display(){
            System.out.println("count="+count);
        }
    }
    public class publicAccessEx{
        public static void main(String args[]){
            PublicEx obj=new PublicEx();
            System.out.println(obj.count=4);
        }


    }

