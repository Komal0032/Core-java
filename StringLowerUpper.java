public class StringLowerUpper{
    public static void main(String args[]){
        String s= "my name";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String s1=  "  Seed infotech";
        System.out.println(s1);
        System.out.println(s1.trim());//remove the starting space
        System.out.println(s.startsWith("M"));
        System.out.println(s.startsWith("m"));
        System.out.println(s.endsWith("e"));

        String s2="java is programming language";
        String replaceString=s2.replace("java","C");
         System.out.println(s2);
         System.out.println(replaceString);



         System.out.println("character at 0 index is="+s.charAt(0));
         System.out.println("character at last index is="+s.charAt(s.length()-1));

         String str1 = "Hello World";  
         String replaced1 = str1.replace("o", "*");  
         System.out.println("Case-Sensitivity:");  
         System.out.println("Original String: " + str1);  
         System.out.println("Replaced String: " + replaced1); // Output: Hell* W*rld  
         StringBuilder sb = new StringBuilder(str1);
         sb.reverse();
         System.out.println(sb.toString());


    }
}

