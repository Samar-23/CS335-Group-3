//Loops
public class WhileAndDoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        
        // Nested While and do while loops
        while (i++ < 5) {
            int j = 0;
            do {
                System.out.println(10*i + j);
            } while (j++ < 5);
        }
        for(int k = 12; k >= 4; k -= 2) {
            System.out.println(k*k);
        }
    }
}
