public class constructor {
    
    int var;

    constructor(){  //default constructor
        var  = 10;
    }

    constructor(int val){   // parameterized constructor
        var = val;
      //this(val,0);   - finds constuctor with 2 parameters and assigns the values
    }

    constructor(int val1,int val2,int val3){  // consturctor over loading
        var = val1+ val2 +val3;
    }

    public static void main(String[] args) {
        
        constructor c1  = new constructor();
        constructor c2  = new constructor(20);
        constructor c3  = new constructor(10,20,30);

        System.out.println("default constructor = " + c1.var);
        System.out.println("parameterized = "+ c2.var);
        System.out.println("overoading = "+c3.var);

    }

}
