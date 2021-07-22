import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer F = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(F.nextToken());
    	int B = Integer.parseInt(F.nextToken());
    	
        while(A!=0 && B!=0) {
        	bw.write(A+B + "\n");
        	
        	StringTokenizer N = new StringTokenizer(br.readLine());
        	A = Integer.parseInt(N.nextToken());
	    	B = Integer.parseInt(N.nextToken());
        }
        
        bw.flush();
        bw.close();
    }
}
