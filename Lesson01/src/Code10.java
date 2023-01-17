import java.util.Scanner;

public class Code10 {
	static public void main(String[] arg) {
		// 사용자로부터 먼저 정수의 개수 n을 입력받는다.
		// 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.
		// 그런 다음 중복된 정수 쌍의 개수를 카운트하여 출력하라.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(data[i]==data[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
