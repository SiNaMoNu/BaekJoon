import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int i, Max_Number = 1;
        
        for(i=0; i<array.length; i++) {
        	array[i] = sc.nextInt();
        }
        int max = array[0];
        
        for(i=0; i<array.length; i++) {
        	if(array[i] > max) {
        		max = array[i];
        		Max_Number = i + 1;
        	}
        }
        System.out.println(max);
        System.out.println(Max_Number);
    }
}
