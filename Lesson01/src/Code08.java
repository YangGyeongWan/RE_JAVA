import java.util.Scanner;

public class Code08 {
	
	static public void main(String[] arg) {
		
		// 배열의 수 한칸씩 이동 shift
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for(int i =0; i<n; i++)
			data[i] = sc.nextInt();
		
		int tmp = data[n-1];
		for(int j=n-2; j >=0; j--) 
			data[j+1] = data[j];
			data[0] = tmp;
		
		
		for(int k=0; k<n; k++)
		
		System.out.println(data[k]);
		
		sc.close();
	}
	
}
