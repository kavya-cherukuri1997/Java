public class variables {
    
    int instancevariable = 100;  // can have access modifiers as well
    static int stat_var  = 30;   // static variables are one per class

    public static void varibalemethod (){
        int local = 10;
        System.out.println("local variable = " + local + "\n");
    }

    public void varinonstatic(){
        instancevariable = 20 ;  // can be accessed without class object in nonstatic method
        stat_var =20;  
    }
    public static void main(String[] args) {
        variables v = new variables();

        v.instancevariable = 11; // instance variable can be accessed 
                                //with class object in static method and assigned differetn value
        stat_var = 10; // can be access without object
        
        varibalemethod();

        System.out.println("instance variable = " + v.instancevariable + "\n");
        System.out.println("static vri = " + stat_var + "\n");
    }
}
