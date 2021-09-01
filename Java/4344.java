import java.util.*;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int total = 0, count = 0;
		int N2;
		double avg, propotion;
        
        for(int i=0; i<N1; i++) {
        	N2 = sc.nextInt();
        	int[] score = new int[N2];
        	
        	for(int j=0; j<N2; j++) {
        		score[j] = sc.nextInt();
        		total += score[j];
        	}
        	avg = total / N2;
        	
        	for(int j=0; j<N2; j++) {
        		if(score[j] > avg) {
        			count += 1;
        		}
        	}
        	propotion = (double) count / N2 * 100;
        	System.out.println(String.format("%.3f", propotion) + "%");
        	
        	total = 0;
        	count = 0;
        }
	}
}
