import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = 0;
        
        for(int i=1; i<N+1; i++) {
        	A = A + i;
        }
        System.out.println(A);
    }
}
