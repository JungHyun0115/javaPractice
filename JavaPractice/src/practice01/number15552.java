package practice01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class number15552 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;

			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			int sum = num + num2;
			
			bw.write(sum);
			
			bw.flush();
			bw.close();
			
		}catch(IOException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
