import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        long remain = 0;
        for(int i=0; i<N.length(); i++) {
        	remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
        	// 원리 생각해보기
        }
        System.out.println(remain);
	}
}
