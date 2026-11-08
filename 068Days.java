import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        
        int n = hi.nextInt();

        while (n >= 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}
