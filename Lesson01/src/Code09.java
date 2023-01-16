
public class Code09 {

	public static void main(String[] args) {
		// 1~1000 사이의 모든 소수들을 찾아서 출력
		
		for(int n = 2; n < 1000; n++) {
			boolean isPrime = true;
			
			for(int i=2; i*i<n && isPrime; i++) {
				if(n%i ==0) {
					isPrime = false;
				}
			}
			if(isPrime)
				System.out.println(n);
		}
	}

}
