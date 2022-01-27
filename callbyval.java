public class callbyval {
    
    public int add (int a, int b){
        a = 100;    //changes the value only in the function
        int i = a + b;
        return i;
    }
    public static void main(String[] args) {
        
        callbyval ans = new callbyval();
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 before change = " + num1);  
        int solution  =ans.add(num1, num2);
        System.out.println("num1 after change = " + num1);  //no change in the value
        System.out.println("added ans = "+ solution);
    }

}
