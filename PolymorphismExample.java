class Language {
    void Feature(){
      
        
    }
}

class Java extends Language {
    public void Feature() {
        System.out.println("Java is a high-level, \nclass-based, \nobject-oriented programming language.");
    }
}

class Cpp extends Language {
    public void Feature() {
        System.out.println("\nC++ is a general-purpose programming language created as an extension of the C programming language.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Language java = new Java();
        Language cpp = new Cpp();
        

        java.Feature();
        cpp.Feature();
    }
}
