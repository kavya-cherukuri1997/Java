public class arr {
    
    public static void main(String[] args) {
        //int[] arrint = new int[] {5,6,7};
        //int[] array  = {2,4,6,8,10};

        char[] s = {'a','b','c','d'};
        char[] d = new char[5];

        System.arraycopy(s, 0, d, 1, 4);
        System.out.println(new String(d));

        int[][] mul = {
            {1,2},
            {3,4},
            {5,6}
        }; //3*2

        System.out.println(mul[0].length);
    }

}
