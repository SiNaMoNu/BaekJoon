import java.util.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0; i<N; i++) {
        	int r = sc.nextInt();
            int n = sc.nextInt();
            double N1 = n;
            double N2 = r;
            double N3 = n - r;
            double F1 = 1, F2 = 1, F3 = 1;
            
            for(double j=N1; j>0; j--) {
            	F1 = F1 * N1;
            	N1 = N1 - 1;
            }
            for(double j=N2; j>0; j--) {
            	F2 = F2 * N2;
            	N2 = N2 - 1;
            }
            for(double j=N3; j>0; j--) {
            	F3 = F3 * N3;
            	N3 = N3 - 1;
            }
            double result = F1 / (F2 * F3);
            System.out.println(String.format("%.0f", result));
            
            F1 = 1;
            F2 = 1;
            F3 = 1;
        }
	}
}
