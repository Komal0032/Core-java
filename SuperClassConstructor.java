
class SuperAnimal {

    SuperAnimal() {
        System.out.println("SuperAnimal Constructor");
    }
    
}
class SubDog extends SuperAnimal {

    SubDog() {
        System.out.println("SubDog Constructor");
    }
    
}
class SubBabyDog extends SubDog {

    SubBabyDog() {
        System.out.println("SubBabyDog Constructor");
    }
    
}
public class SuperClassConstructor {
    public static void main(String[] args) {
        SubBabyDog d1 = new SubBabyDog();
    }
}