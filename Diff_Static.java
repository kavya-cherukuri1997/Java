public class Diff_Static {

    public static void method_static()  // can call static method without instance anywhere 
    {   
        System.out.println("....Static method....");
    }

    public void method_nonstatic(){
        System.out.println(".....non-Static method......");
        
    }
    public static void main(String[] args) {

        Diff_Static x  = new Diff_Static();  //create an instance for a class

        System.out.println("Hello World!");
        
        method_static();    // calling static method
        x.method_nonstatic(); // calling non-static method
    }
}
