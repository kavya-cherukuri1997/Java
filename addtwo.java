public class addtwo {
    
    public int add (int a, int b){
        int i = a + b;
        return i;
    }
    public static void main(String[] args) {
        addtwo ans = new addtwo();
        
        int solution  =ans.add(2, 5);
        System.out.println("added ans = "+ solution);
    }

}
