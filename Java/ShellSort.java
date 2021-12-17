public class ShellSort extends InsertionSort {

	private void shellSort(int[] m) {
		
		int n = m.length;
				
		// 갭을 계속 반으로 나눠가며 점점 작아지기
		// 갭이 1일때 까지
		for(int gap = n/2; gap >= 1; gap /= 2) {
			
			// 갭이 짝수면 홀수로 변경
			if(gap % 2 == 0)
				gap++;
			
			// 삽입 정렬 실행
			insertSort(m,gap);
		}
	}
	
	public void sort(int[] m) {
		shellSort(m);
		name = "셸 정렬";
		printArray(m);
	}
}
