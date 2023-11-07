import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
       
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact.toString());
    }
}
