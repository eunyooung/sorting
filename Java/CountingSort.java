public class CountingSort extends Sorting {
	
	private void counting(int[] m) {

		// 카운팅 배열의 크기 = 최대 숫자의 크기
		int n = getMax(m)+1;
		int[] counting = new int[n];
		// 정렬된 배열
		int[] sorted = new int[m.length];
		
		// 배열의 값을 인덱스로 하는 counting 배열 값 증가
		for(int i = 0; i < m.length; i++)
			counting[m[i]]++;			
		
		// 누적 합
		for(int i = 1; i < counting.length; i++)
			counting[i] += counting[i - 1];
		
		// i번째 요소를 인덱스로 하는 카운팅 배열의 누적합을 1 감소
		// 카운팅 배열의 누적합을 인덱스로 하여 정렬된 배열에 저장
		for(int i = m.length - 1; i >= 0; i--) {
			int temp = m[i];
			sorted[counting[temp] - 1] = temp;
			counting[temp] -= 1;
		}
		// 배열 복사
		System.arraycopy(sorted, 0, m, 0, m.length);
	}
	
	public void sort(int[] m) {
		counting(m);
		name = "계수 정렬";
		printArray(m);
	}
}
