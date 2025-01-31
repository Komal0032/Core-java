class Area{
    int length;
    int breadth;
    //constructor to intialize values
    Area (int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    //method to calculate area
    public void getArea(){
        int area=length * breadth;
        System.out.println("Area="+area);
    }
    
}

public class EncapulationEx {
    public static void main(String args[]){
         Area rectangle=new Area(5,6);
         rectangle.getArea();
    }
}
