
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// reader선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// writer선언
		int[][] arr = new int[9][9];
		int max=-10000000;
		int x=-1,y=-1;
		for (int i = 0; i < 9; i++) {
			String[] input = bf.readLine().split(" ");
			for (int j = 0; j < 9; j++) {
				int n = Integer.parseInt(input[j]);
				if(n>max) {
					max=n;
					y=i;
					x=j;
				}
				arr[i][j] = n;
			}
		}
		
		
		System.out.println(max);
		System.out.println((y+1)+" "+(x+1));
        
        bw.flush();

	}
}
