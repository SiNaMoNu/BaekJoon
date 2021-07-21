import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int A=0, i;
        
        for(i=0; i<T; i++) {
        	A = A + 1;
        	bw.write(A + "\n");
        }
        bw.flush();
        bw.close();
    }
}
