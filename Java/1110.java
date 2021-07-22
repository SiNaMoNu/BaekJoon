import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int First_Number, New_Number = -1, i = 0;
        First_Number = N;
        
        while(First_Number != New_Number) {
        	if(N < 10) {
        		N = (N * 10) + N;
        		New_Number = N;
        	}
        	else if(N >= 10) {
        		N = (N%10*10) + (((N/10) + (N%10))%10);
        		New_Number = N;
        	}
        	i = i + 1;
        }
        System.out.println(i);
    }
}
