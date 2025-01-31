
interface Area {
    void area();
}

class Circle implements Area {
    public void area() {
        int r = 2;
        System.out.println(3.142 * r * r);
    }
}

class Rectangle implements Area {
    public void area() {
        int l = 2, b = 4;
        System.out.println(l * b);
    }
}

public class InterfaceEx {
    public static void main(String args[]) {
        Area rc = new Rectangle();
        rc.area();
        Area cr = new Circle();
        cr.area();
    }
}
