import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(45 <= M) {
        	System.out.println(H + " " + (M-45));
        }
        else if(1 <= H && M < 45) {
        	System.out.println((H-1) + " " + (M+15));
        }
        else if(0 == H && M < 45) {
        	System.out.println((H+23) + " " + (M+15));
        }
    }
}
