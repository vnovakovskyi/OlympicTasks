import java.math.BigInteger;
import java.util.Scanner;

public class TheFactorial {
    public static void main(String[] args) {

        BigInteger b;
        Scanner in = new Scanner(System.in);

        b = new BigInteger(in.next());

        BigInteger curr = BigInteger.ONE;

        for(int i = 1; i <= 2000; i++) {
            curr = curr.multiply(new BigInteger(String.valueOf(i)));

            if(b.compareTo(curr) == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
