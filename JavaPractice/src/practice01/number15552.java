package practice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class number15552 {

	public static void main(String[] args) throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			
			bw.write(num + num2 +"\n");
			
			bw.flush();
			bw.close();

	}

}
