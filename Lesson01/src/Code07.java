import java.util.Scanner;

public class Code07 {
	
	static public void main(String[] arg) {
		// 배열의 합과 입력받은 값의 최댓값 구하기
		
		Scanner key = new Scanner(System.in);
		
		int n = key.nextInt();
		int [] data = new int[n];
		for(int i = 0; i < n; i++) 
			data[i] = key.nextInt();
			
			key.close();
			
		int sum = 0;
		int max = 0;
		for(int i=0; i<n; i++) {
			sum += data[i]; // sum = sum + data[i];
			
			if(data[i] > max) {
				max = data[i];
			}
			
		}
		
		
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
		
	}
	
}
