public class methodoverloading {
    
    public int add (int a, int b){
        a = 100;    //changes the value only in the function
        int i = a + b;
        return i;
    }

    public static void main(String[] args) {
        
        methodoverloading ans = new methodoverloading();
        
        int num1 = 10;
        int num2 = 30;
        int num3 = 20;
        System.out.println("num1 before change = " + num1);  
        
        int solution  = ans.add(num1, num2);
        int sol2 = ans.add(num1,num2,num3);
        System.out.println("num1 after change = " + num1);  //no change in the value
        System.out.println("added ans = "+ solution);
        System.out.println("added ans = "+ sol2);
        
    }

    public int add( int a , int b, int c) {
        int i = a + b + c;
        return i;   
    }

}
