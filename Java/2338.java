import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger N1 = new BigInteger(sc.next());
        BigInteger N2 = new BigInteger(sc.next());
        
        System.out.println(N1.add(N2));
        System.out.println(N1.subtract(N2));
        System.out.println(N1.multiply(N2));
	}
}
