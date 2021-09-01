import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int N4 = sc.nextInt();
        int N5 = sc.nextInt();

        System.out.println((N1*N1 + N2*N2 + N3*N3 + N4*N4 + N5*N5) % 10);
	}
}
