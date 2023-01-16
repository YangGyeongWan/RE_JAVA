
public class Code05 {
	
	public static void main(String[] arg) {
		
		// declare the array
		// 배열을 사용하기 위해 먼저 이렇게 배열한다.
		int [] grades;
		
		// allocate memory for 5 indices
		// 배열의 크기를 지정하고 실제 배열이 생성되는 시점이다.  --> int[] grades = new int[5] 이렇게 배열을 한 라인으로 만들 수 있다.
		grades = new int[5];
		
		// assign some values to the array
		// 배열의 각 칸에 데이터를 저장하고, 저장된 데이터를 읽기 위해서 []사용한다.
		// 배열의 인덱스는 0부터 시작한다.
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] =	14;
		
		// print out each value
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		System.out.println(grades[4]);
		
		// 반복문을 이용한 출력
		for(int i = 0; i < 5; i++) {
			System.out.println("Grade" + (i+1) + ": " + grades[i]);
		}
		
	}
	
}