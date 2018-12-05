import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Matches {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        int width = (int) sqrt(1.0 * count);

        int length = count / width;

        int outOfSquare = count - width * length;

        int matchesCount = width * (length + 1) + length * (width + 1);

        if (outOfSquare != 0){
            matchesCount = matchesCount + 2 * outOfSquare + 1;
        }

        System.out.println("Count of matches is - " + matchesCount);
    }
}
